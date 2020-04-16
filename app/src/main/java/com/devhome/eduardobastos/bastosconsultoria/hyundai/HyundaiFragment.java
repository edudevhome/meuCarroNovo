package com.devhome.eduardobastos.bastosconsultoria.hyundai;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devhome.eduardobastos.bastosconsultoria.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HyundaiFragment extends Fragment {


    public HyundaiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hyundai, container, false);
    }

}
