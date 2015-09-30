package com.example.mukesh.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_main, container, false) ;
        String[] forecast ={"Today", "Tomorrow", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Again Sunday", "Fill List" };

        List<String> weekforecast=new ArrayList<String>(Arrays.asList(forecast));

        ArrayAdapter forecastAdapter= new ArrayAdapter<String> (getActivity(), R.layout.fragment_main, R.id.today, forecast );

        ListView listView= (ListView) rootview.findViewById(R.id.today );
        listView.setAdapter(forecastAdapter);
        return rootview;

    }
}
