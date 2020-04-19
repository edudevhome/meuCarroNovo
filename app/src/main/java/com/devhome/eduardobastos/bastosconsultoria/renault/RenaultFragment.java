package com.devhome.eduardobastos.bastosconsultoria.renault;


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
public class RenaultFragment extends Fragment  {

    private RenaultViewModel renaultViewModel;
    private Spinner spinner;
    private ImageView imageView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        renaultViewModel =
                ViewModelProviders.of(this).get(RenaultViewModel.class);
        View root = inflater.inflate(R.layout.fragment_renault, container, false);
        final TextView textView = root.findViewById(R.id.text_renault);

        spinner = root.findViewById(R.id.veiculosRenault_spinner);

        imageView = root.findViewById(R.id.imageVeiculo);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.veiculosRenault_array, android.R.layout.simple_spinner_item);
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
                        Toast.makeText(parent.getContext(), "CLIO SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.clio);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/clio/" +
                                        "catalogos-e-manuais/manuais-antigos/16/NU1055-7-X65-PTB.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "KWID SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.kwid);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/manuais/kwid/" +
                                        "kwid-manual-do-roprietario.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(parent.getContext(), "LOGAN SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.logan);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/logan/l52-logan/catalogos-e-manuais/" +
                                        "manuais-antigos/18/NU1077-10-L52-PTB.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 4:
                        Toast.makeText(parent.getContext(), "SANDERO SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sandero);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/sandero/b52-sandero/" +
                                        "catalogos-e-manuais/2019/sandero-manual-propietario-19-19.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 5:
                        Toast.makeText(parent.getContext(), "SANDERO R.S. SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sanderors);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/manuais/" +
                                        "linha-sandero/rs-manual-do-proprietario.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 6:
                        Toast.makeText(parent.getContext(), "STEPWAY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.stepway);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/sandero/b52-sandero/catalogos-e-manuais/" +
                                        "2019/sandero-manual-propietario-19-19.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 7:
                        Toast.makeText(parent.getContext(), "ZOE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.zoe);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.renault.com.br/content/dam/Renault/BR/personal-cars/ZOE/" +
                                        "catalogos-manuais/afonline-rm006219-fol-zoe-ago-2019.pdf");
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



        renaultViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

