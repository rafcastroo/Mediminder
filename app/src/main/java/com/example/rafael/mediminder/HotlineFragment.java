package com.example.rafael.mediminder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotlineFragment extends Fragment {


    public HotlineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Hotlines");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotline, container, false);
    }

}
