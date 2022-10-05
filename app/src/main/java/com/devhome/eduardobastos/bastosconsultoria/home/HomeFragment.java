package com.devhome.eduardobastos.bastosconsultoria.home;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentController;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.devhome.eduardobastos.bastosconsultoria.MainActivity;
import com.devhome.eduardobastos.bastosconsultoria.R;
import com.devhome.eduardobastos.bastosconsultoria.avaliarComentar.SettingsViewModel;
import com.devhome.eduardobastos.bastosconsultoria.fiat.SchoolFragment;
import com.devhome.eduardobastos.bastosconsultoria.honda.HondaFragment;
import com.devhome.eduardobastos.bastosconsultoria.honda.HondaViewModel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private AdView bannerAd;
    private AdView bannerAd2;


    public HomeFragment() {
        // Required empty public constructor
    }

    // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
    //MobileAds.initialize(getContext(), "@string/home_banner");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MobileAds.initialize(getContext(), "@string/home_banner");
        MobileAds.initialize(getContext(), "@string/home_banner2");

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        bannerAd = root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //bannerAd.setAdSize(AdSize.SMART_BANNER);
        bannerAd.loadAd(adRequest);

        bannerAd2 = root.findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        //bannerAd.setAdSize(AdSize.SMART_BANNER);
        bannerAd2.loadAd(adRequest2);

        // Inflate the layout for this fragment
        return root;
    }


    public void onHonda(View view) {
        Intent intent = new Intent( getActivity(), MainActivity.class);

        startActivity(intent);
    }
}






