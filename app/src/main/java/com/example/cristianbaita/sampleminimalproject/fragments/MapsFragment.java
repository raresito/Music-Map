package com.example.cristianbaita.sampleminimalproject.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cristianbaita.sampleminimalproject.R;

/**
 * Created by Rares - Desktop on 14.09.2016.
 */
public class MapsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.map_fragment, container, false);
    }
}
