package com.devhome.eduardobastos.bastosconsultoria.nissan;


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

import mehdi.sakout.aboutpage.AboutPage;


/**
 * A simple {@link Fragment} subclass.
 */
public class NissanFragment extends Fragment  {

    private NissanViewModel nissanViewModel;
    private Spinner spinner;
    private ImageView imageView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        nissanViewModel =
                ViewModelProviders.of(this).get(NissanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_nissan, container, false);
        final TextView textView = root.findViewById(R.id.text_nissan);

        spinner = root.findViewById(R.id.veiculosNissan_spinner);

        imageView = root.findViewById(R.id.imageVeiculo);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.veiculosNissan_array, android.R.layout.simple_spinner_item);
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
                        Toast.makeText(parent.getContext(), "LIVINA SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.livina);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/br/" +
                                        "manuais/Livina/2013-2014/MP-Livina-web.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "MARCH SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.march);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/" +
                                        "br/manuais/March/ManualdoProprietario_March18_30072018.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(parent.getContext(), "MARCH ACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.marchactive);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/br/manuais/March-active/2015/" +
                                        "MP_March_Active_G02-site_sbsr040217578945d47f6479dabf40e5142e78b38d192206e962.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 4:
                        Toast.makeText(parent.getContext(), "SENTRA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sentra);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/" +
                                        "br/manuais/Sentra/2018/MP%20Sentra_2018.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 5:
                        Toast.makeText(parent.getContext(), "TIIDA HATCH SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.tiida);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/br/" +
                                        "manuais/Tiida-Hatch/2013/Site-Tiida-18-10-2013.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 6:
                        Toast.makeText(parent.getContext(), "TIIDA SEDAN SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.tiidasedan);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/br/" +
                                        "manuais/Tiida-Sedan/2013/Site-Tiida-Sedan-18-10-2013.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 7:
                        Toast.makeText(parent.getContext(), "VERSA SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.versa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.nissan.com.br/content/dam/Nissan/br/" +
                                        "manuais/Versa/ManualdoProprietario_Versa18_30072018.pdf");
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



        nissanViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

