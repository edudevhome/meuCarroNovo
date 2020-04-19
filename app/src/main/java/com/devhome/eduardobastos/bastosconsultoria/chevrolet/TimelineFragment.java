package com.devhome.eduardobastos.bastosconsultoria.chevrolet;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.devhome.eduardobastos.bastosconsultoria.R;
import com.devhome.eduardobastos.bastosconsultoria.home.HomeFragment;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;

import mehdi.sakout.aboutpage.AboutPage;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimelineFragment extends Fragment  {

    private TimelineViewModel timelineViewModel;
    private Spinner spinner;
    private ImageView imageView;
    private AdView adView;

    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToogle;
    private String barra;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(getContext(), "3940256099942544~3347511713");

        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");


        timelineViewModel =
                ViewModelProviders.of(this).get(TimelineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_timeline, container, false);
        final TextView textView = root.findViewById(R.id.text_timeline);

        spinner = root.findViewById(R.id.veiculosChevrolet_spinner);

        imageView = root.findViewById(R.id.imageVeiculo);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.veiculosChevrolet_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        //Toast.makeText(parent.getContext(), "AGILE SELECIONADO", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(parent.getContext(), "AGILE SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.agile);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/" +
                                        "gmbr/dynamic/manuals/2014/chevrolet/Agile/pt/" +
                                        "om_ng-chevrolet_Agile_my14-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "CELTA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.celta);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/" +
                                        "gmsa/gmbr/dynamic/manuals/2014/chevrolet/Celta/pt/" +
                                        "om_ng-chevrolet_Celta_my14-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(parent.getContext(), "CLASSIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.classic);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2015/chevrolet/" +
                                        "Classic/pt/om_ng-chevrolet_Classic_my15-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 4:
                        Toast.makeText(parent.getContext(), "COBALT SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.cobalt);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2015/chevrolet/Cobalt/" +
                                        "pt/om_ng-chevrolet_Cobalt_my15-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 5:
                        Toast.makeText(parent.getContext(), "CORSA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.corsa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2012/chevrolet/Corsa/" +
                                        "pt/om_ng-chevrolet_Corsa_my12-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 6:
                        Toast.makeText(parent.getContext(), "JOY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.joy);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2020/chevrolet/Joy/" +
                                        "pt/om_ng-chevrolet_Joy_my20-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 7:
                        Toast.makeText(parent.getContext(), "JOY PLUS SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.joyplus);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/" +
                                        "gmsa/gmbr/dynamic/manuals/2020/chevrolet/Joy/" +
                                        "pt/om_ng-chevrolet_Joy_my20-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 8:
                        Toast.makeText(parent.getContext(), "MERIVA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.meriva);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2012/chevrolet/Meriva/" +
                                        "pt/om_ng-chevrolet_Meriva_my12-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 9:
                        Toast.makeText(parent.getContext(), "ONIX SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.onix);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2017/chevrolet/Onix/" +
                                        "pt/om_ng-chevrolet_Onix_my17-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 10:
                        Toast.makeText(parent.getContext(), "ONIX ACTIV SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.onixactiv);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2018/" +
                                        "chevrolet/Onix/pt/om_ng-chevrolet_Onix_my18-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 11:
                        Toast.makeText(parent.getContext(), "ONIX JOY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.onixjoy);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2019/chevrolet/OnixJoy/" +
                                        "pt/om_ng-chevrolet_Onix_Joy_my19-pt_BR.pdf.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 12:
                        Toast.makeText(parent.getContext(), "ONIX PLUS SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.onixplus);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2020/chevrolet/OnixPlus/pt/" +
                                        "om_ng-chevrolet_Onix%20Plus_my20-pt_BR.pdf.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 13:
                        Toast.makeText(parent.getContext(), "PRISMA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.prisma);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2019/chevrolet/" +
                                        "Prisma/pt/om_ng-chevrolet_Prisma_my19-pt_BR.pdf.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 14:
                        Toast.makeText(parent.getContext(), "PRISMA JOY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.prismajoy);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2017/chevrolet/PrismaJoy/" +
                                        "pt/om_ng-chevrolet_PrismaJoy_my17-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 15:
                        Toast.makeText(parent.getContext(), "SONIC HATCHBACK SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sonic);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2013/chevrolet/Sonic/" +
                                        "pt/om_ng-chevrolet_Sonic_my13-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 16:
                        Toast.makeText(parent.getContext(), "SONIC SEDAN SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sonicsedan);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2013/" +
                                        "chevrolet/Sonic/pt/om_ng-chevrolet_Sonic_my13-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 17:
                        Toast.makeText(parent.getContext(), "SPIN SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.spin);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2018/chevrolet/Spin/" +
                                        "pt/om_ng-chevrolet_Spin_my18-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 18:
                        Toast.makeText(parent.getContext(), "SPIN ACTIV SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.spinactiv);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://meu.chevrolet.com.br/content/dam/gmownercenter/gmsa/gmbr/dynamic/manuals/2018/chevrolet/Spin/" +
                                        "pt/om_ng-chevrolet_Spin_my18-pt_BR.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                        default:

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        timelineViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

