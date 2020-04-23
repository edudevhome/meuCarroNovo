package com.devhome.eduardobastos.bastosconsultoria.ford;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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
import com.devhome.eduardobastos.bastosconsultoria.ford.WorkViewModel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import mehdi.sakout.aboutpage.AboutPage;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment  {

    private WorkViewModel workViewModel;
    private Spinner spinner;
    private ImageView imageView;
    private AdView bannerAd;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(getContext(), "@string/ford_banner");

        workViewModel =
                ViewModelProviders.of(this).get(WorkViewModel.class);
        View root = inflater.inflate(R.layout.fragment_work, container, false);
        final TextView textView = root.findViewById(R.id.text_work);

        spinner = root.findViewById(R.id.veiculosFord_spinner);

        imageView = root.findViewById(R.id.imageVeiculo);

        bannerAd = root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        bannerAd.loadAd(adRequest);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.veiculosFord_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Toast.makeText(parent.getContext(), "NENHUM MODELO SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.vazio);

                        break;

                    case 1:
                        Toast.makeText(parent.getContext(), "FIESTA ROCAM SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.rocam);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.ford.com.br/content/dam/Ford/website-assets/latam/br/servico-ao-cliente/" +
                                        "manuais/2014/manuais-do-proprietario/Fiesta_2014.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "FOCUS SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.focus);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.ford.com.br/content/dam/Ford/website-assets/latam/br/servico-ao-cliente/manuais/2015/" +
                                        "manuais-do-proprietario/Manual_Proprietario_Novo_Focus_2015.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(parent.getContext(), "KA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.ka);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.ford.com.br/content/dam/Ford/website-assets/latam/br/servico-ao-cliente/manuais/2015/" +
                                        "manuais-do-proprietario/KA_E3B519A321AC_MY%202015.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 4:
                        Toast.makeText(parent.getContext(), "KA SEDAN SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.kasedan);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.ford.com.br/content/dam/Ford/website-assets/latam/br/servico-ao-cliente/manuais/2019/" +
                                        "manuais-do-proprietario/KA_JB7X19A32_BA_MY2019.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 5:
                        Toast.makeText(parent.getContext(), "NEW FIESTA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.newfiesta);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.ford.com.br/content/dam/Ford/website-assets/latam/br/servico-ao-cliente/manuais/2016/" +
                                        "manuais-do-proprietario/New%20Fiesta%20-%20Manual%20do%20Proprietario%20-%20MY16.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 6:
                        Toast.makeText(parent.getContext(), "NEW FIESTA SEDAN SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.fiestasedan);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.ford.com.br/content/dam/Ford/website-assets/latam/br/servico-ao-cliente/manuais/2017/" +
                                        "manuais-do-proprietario/Manual_Proprietario_New_Fiesta_Sedan_2017.pdf");
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



        workViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

