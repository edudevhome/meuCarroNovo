package com.devhome.eduardobastos.bastosconsultoria.hyundai;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.devhome.eduardobastos.bastosconsultoria.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class HyundaiFragment extends Fragment {

    private AdView bannerAd;

    public HyundaiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_hyundai, container, false);
        final TextView textView = root.findViewById(R.id.textView2);


        bannerAd = root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //bannerAd.setAdSize(AdSize.SMART_BANNER);
        bannerAd.loadAd(adRequest);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hyundai, container, false);
    }

}
