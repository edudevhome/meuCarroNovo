package com.devhome.eduardobastos.bastosconsultoria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.devhome.eduardobastos.bastosconsultoria.chevrolet.TimelineFragment;
import com.devhome.eduardobastos.bastosconsultoria.fiat.SchoolFragment;
import com.devhome.eduardobastos.bastosconsultoria.ford.WorkFragment;
import com.devhome.eduardobastos.bastosconsultoria.home.HomeFragment;
import com.devhome.eduardobastos.bastosconsultoria.honda.HondaFragment;
import com.devhome.eduardobastos.bastosconsultoria.hyundai.HyundaiFragment;
import com.devhome.eduardobastos.bastosconsultoria.nissan.NissanFragment;
import com.devhome.eduardobastos.bastosconsultoria.peugeot.PeugeotFragment;
import com.devhome.eduardobastos.bastosconsultoria.renault.RenaultFragment;
import com.devhome.eduardobastos.bastosconsultoria.toyota.ToyotaFragment;
import com.devhome.eduardobastos.bastosconsultoria.volkswagen.VolkswagenFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemSelectedListener {

     DrawerLayout mDrawerLayout;
     ActionBarDrawerToggle mDrawerToogle;
     private String barra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(barra);
        setSupportActionBar(toolbar);


        mDrawerLayout = findViewById(R.id.drawerLayout);
        mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
              R.string.open, R.string.close);


        mDrawerLayout.addDrawerListener(mDrawerToogle);
        mDrawerToogle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment fragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment, "Home");
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        if (id == R.id.home) {

            String home = "HOME";
            Toolbar toolbar = findViewById(R.id.toolbar);
            toolbar.setTitle(home);
            setSupportActionBar(toolbar);

            HomeFragment fragment = new HomeFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment, "Home");
            fragmentTransaction.commit();

            mDrawerLayout = findViewById(R.id.drawerLayout);
            mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                    R.string.open, R.string.close);

        } else
            if (id == R.id.timeLine) {

                String che = "CHEVROLET";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(che);
                setSupportActionBar(toolbar);

                TimelineFragment fragment = new TimelineFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "CHEVROLET");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);



        } else
            if (id == R.id.school) {

                String home = "FIAT";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);


            SchoolFragment fragment = new SchoolFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment, "FIAT");
            fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

        } else
            if (id == R.id.work) {

                String home = "FORD";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

            WorkFragment fragment = new WorkFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment, "FORD");
            fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

            } else
            if (id == R.id.nav_honda) {

                String home = "HONDA";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                HondaFragment fragment = new HondaFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Honda");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

            } else
            if (id == R.id.nav_nissan) {

                String home = "NISSAN";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                NissanFragment fragment = new NissanFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Nissan");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

            } else
            if (id == R.id.nav_hiunday) {

                String home = "HYUNDAI";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                HyundaiFragment fragment = new HyundaiFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Hyundai");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);


            } else
            if (id == R.id.nav_renault) {

                String home = "RENAULT";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                RenaultFragment fragment = new RenaultFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Renault");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

            } else
            if (id == R.id.nav_toyota) {

                String home = "TOYOTA";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                ToyotaFragment fragment = new ToyotaFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Toyota");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

            } else
            if (id == R.id.nav_volkswagen) {

                String home = "VOLKSWAGEN";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                VolkswagenFragment fragment = new VolkswagenFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Volkswagen");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

            } else
            if (id == R.id.nav_peugeot) {

                String home = "PEUGEOT";
                Toolbar toolbar = findViewById(R.id.toolbar);
                toolbar.setTitle(home);
                setSupportActionBar(toolbar);

                PeugeotFragment fragment = new PeugeotFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment, "Peugeot");
                fragmentTransaction.commit();

                mDrawerLayout = findViewById(R.id.drawerLayout);
                mDrawerToogle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                        R.string.open, R.string.close);

        } else
            if (id == R.id.settings) {



            SettingsFragment fragment = new SettingsFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment, "Settings");
            fragmentTransaction.commit();
        } else
            if (id == R.id.logout) {

            LogoutFragment fragment = new LogoutFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout, fragment, "Logout");
            fragmentTransaction.commit();

        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}