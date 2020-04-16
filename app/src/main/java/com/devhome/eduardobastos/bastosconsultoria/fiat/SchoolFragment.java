package com.devhome.eduardobastos.bastosconsultoria.fiat;


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

import mehdi.sakout.aboutpage.AboutPage;


/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment  {

    private SchoolViewModel schoolViewModel;
    private Spinner spinner;
    private ImageView imageView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        schoolViewModel =
                ViewModelProviders.of(this).get(SchoolViewModel.class);
        View root = inflater.inflate(R.layout.fragment_school, container, false);
        final TextView textView = root.findViewById(R.id.text_school);

        spinner = root.findViewById(R.id.veiculosFiat_spinner);

        imageView = root.findViewById(R.id.imageVeiculo);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.veiculosFiat_array, android.R.layout.simple_spinner_item);
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
                        Toast.makeText(parent.getContext(), "ARGO 1.0 SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "ARGO 1.0 DRIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/" +
                                        "handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(parent.getContext(), "ARGO 1.3 DRIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 4:
                        Toast.makeText(parent.getContext(), "ARGO 1.3 GSR DRIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 5:
                        Toast.makeText(parent.getContext(), "ARGO 1.8 AUTOMÁTICO HGT SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 6:
                        Toast.makeText(parent.getContext(), "ARGO 1.8 AUTOMÁTICO PRECISION SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argoprecision);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 7:
                        Toast.makeText(parent.getContext(), "ARGO 1.8 HGT SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argohgt);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 8:
                        Toast.makeText(parent.getContext(), "ARGO 1.8 PRECISION SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.argoprecision);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/358/2019/handbook-2019-argo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 9:
                        Toast.makeText(parent.getContext(), "BRAVO 1.4 16V TURBO T-JET SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.bravo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2014/handbook-2014-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 10:
                        Toast.makeText(parent.getContext(), "BRAVO 1.8 16V ABSOLUTE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.bravodual);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2014/handbook-2014-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 11:
                        Toast.makeText(parent.getContext(), "BRAVO 1.8 16V BLACKMOTION SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.blackmotion);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2016/handbook-2016-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 12:
                        Toast.makeText(parent.getContext(), "BRAVO 1.8 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.bravoessense);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2016/handbook-2016-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 13:
                        Toast.makeText(parent.getContext(), "BRAVO 1.8 16V ESSENCE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.bravoessense);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2013/handbook-2013-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 14:
                        Toast.makeText(parent.getContext(), "BRAVO 1.8 16V SPORTING SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.bravosporting);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2016/handbook-2016-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 15:
                        Toast.makeText(parent.getContext(), "BRAVO 1.8 16V SPORTING DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.bravosporting);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/198/2013/handbook-2013-bravo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 16:
                        Toast.makeText(parent.getContext(), "CRONOS 1.3 SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.cronos);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/359/2019/handbook-2019-cronos.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 17:
                        Toast.makeText(parent.getContext(), "CRONOS 1.3 DRIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.cronos);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/359/2019/handbook-2019-cronos.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 18:
                        Toast.makeText(parent.getContext(), "CRONOS 1.8 DRIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.cronos);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/359/2019/handbook-2019-cronos.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 19:
                        Toast.makeText(parent.getContext(), "CRONOS 1.8 PRECISION SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.cronosprecision);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/359/2019/handbook-2019-cronos.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 20:
                        Toast.makeText(parent.getContext(), "DOBLÒ 1.4 ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.dobloatrativ);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/119/2014/handbook-2014-doblo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 21:
                        Toast.makeText(parent.getContext(), "DOBLÒ 1.8 16V ADVENTURE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.dobloadventure);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/119/2014/handbook-2014-doblo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 22:
                        Toast.makeText(parent.getContext(), "DOBLÒ 1.8 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.dobloessensse);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/119/2014/handbook-2014-doblo.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 23:
                        Toast.makeText(parent.getContext(), "GRAND SIENA 1.4 EVO SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.gransiena);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/197/2015/handbook-2015-grand-siena.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 24:
                        Toast.makeText(parent.getContext(), "GRAND SIENA 1.4 EVO ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.granatrativ);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/197/2018/handbook-2018-grand-siena.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 25:
                        Toast.makeText(parent.getContext(), "GRAND SIENA 1.6 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.granessensse);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/197/2018/handbook-2018-grand-siena.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 26:
                        Toast.makeText(parent.getContext(), "GRAND SIENA 1.6 16V ESSENCE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.granessensse);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/197/2018/handbook-2018-grand-siena.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 27:
                        Toast.makeText(parent.getContext(), "IDEA 1.4 ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.ideaaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/135/2016/handbook-2016-idea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 28:
                        Toast.makeText(parent.getContext(), "IDEA 1.6 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.ideaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/135/2016/handbook-2016-idea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 29:
                        Toast.makeText(parent.getContext(), "IDEA 1.6 16V ESSENCE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.idea);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/135/2013/handbook-2013-idea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 30:
                        Toast.makeText(parent.getContext(), "IDEA 1.8 16V ADVENTURE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.ideaadventure);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/135/2013/handbook-2013-idea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 31:
                        Toast.makeText(parent.getContext(), "IDEA 1.8 16V ADVENTURE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.ideaadventure);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/135/2013/handbook-2013-idea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 32:
                        Toast.makeText(parent.getContext(), "LINEA 1.4 16V TURBO T-JET SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.linea);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/110/2013/handbook-2013-linea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 33:
                        Toast.makeText(parent.getContext(), "LINEA 1.8 16V DUALOGIC ABSOLUTE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.lineaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/110/2013/handbook-2013-linea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 34:
                        Toast.makeText(parent.getContext(), "LINEA 1.8 16V DUALOGIC ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.lineaaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/110/2013/handbook-2013-linea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 35:
                        Toast.makeText(parent.getContext(), "LINEA 1.8 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.lineaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/110/2013/handbook-2013-linea.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 36:
                        Toast.makeText(parent.getContext(), "MOBI 1.0 DRIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.blackmotion);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/341/2017/handbook-2017-mobi.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 37:
                        Toast.makeText(parent.getContext(), "MOBI 1.0 EASY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.mobi);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/341/2017/handbook-2017-mobi.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 38:
                        Toast.makeText(parent.getContext(), "MOBI 1.0 EASY ON SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.mobi);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/341/2017/handbook-2017-mobi.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 39:
                        Toast.makeText(parent.getContext(), "MOBI 1.0 LIKE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.mobii);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/341/2017/handbook-2017-mobi.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 40:
                        Toast.makeText(parent.getContext(), "MOBI 1.0 WAY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.mobia);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/341/2017/handbook-2017-mobi.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 41:
                        Toast.makeText(parent.getContext(), "MOBI 1.0 WAY ON SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.mobia);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/341/2017/handbook-2017-mobi.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 42:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.0 EVO ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.palio);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2015/handbook-2015-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 43:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.0 EVO VIVACE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.palio);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2013/handbook-2013-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 44:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.0 FIRE ECONOMY 4P SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.palio);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/171/2013/handbook-2013-palio-fire.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 45:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.4 EVO ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.paliopontoquatro);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2013/handbook-2013-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 46:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.6 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.palio);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2015/handbook-2015-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 47:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.6 16V ESSENCE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.paliopontoquatro);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2013/handbook-2013-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 48:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.6 16V SPORTING SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.palioaaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2014/handbook-2014-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 49:
                        Toast.makeText(parent.getContext(), "NOVO PALIO 1.6 16V SPORTING DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.palioaaa);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/196/2013/handbook-2013-palio.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 50:
                        Toast.makeText(parent.getContext(), "PALIO WEEKEND 1.4 ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.wee);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/374/2015/handbook-2015-siena-weekend.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 51:
                        Toast.makeText(parent.getContext(), "PALIO WEEKEND 1.6 16V TREKKING SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.wee);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/374/2015/handbook-2015-siena-weekend.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 52:
                        Toast.makeText(parent.getContext(), "PALIO WEEKEND 1.8 16V ADVENTURE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.weeeadven);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/374/2015/handbook-2015-siena-weekend.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 53:
                        Toast.makeText(parent.getContext(), "PALIO WEEKEND 1.8 16V ADVENTURE DUALOGIC SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.weeeadven);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/374/2017/handbook-2017-siena-weekend.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 54:
                        Toast.makeText(parent.getContext(), "PUNTO 1.4 16V TURBO T-JET SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.puntored);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/118/2013/handbook-2013-punto.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 55:
                        Toast.makeText(parent.getContext(), "PUNTO 1.4 ATTRACTIVE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.puntored);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/118/2013/handbook-2013-punto.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 56:
                        Toast.makeText(parent.getContext(), "PUNTO 1.6 16V DUALOGIC ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.puntowhite);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/118/2013/handbook-2013-punto.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 57:
                        Toast.makeText(parent.getContext(), "PUNTO 1.6 16V ESSENCE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.puntowhite);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/118/2013/handbook-2013-punto.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 58:
                        Toast.makeText(parent.getContext(), "PUNTO 1.8 16V DUALOGIC SPORTING SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.puntored);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/118/2013/handbook-2013-punto.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 59:
                        Toast.makeText(parent.getContext(), "PUNTO 1.8 16V SPORTING SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.puntored);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/118/2013/handbook-2013-punto.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 60:
                        Toast.makeText(parent.getContext(), "SIENA 1.0 EL SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sienawhite);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/372/2013/handbook-2013-siena-strada-weekend.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 61:
                        Toast.makeText(parent.getContext(), "SIENA 1.4 EL SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.sienared);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/372/2013/handbook-2013-siena-strada-weekend.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 62:
                        Toast.makeText(parent.getContext(), "UNO 1.0 EVO VIVACE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.unobasic);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/195/2013/handbook-2013-uno.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 63:
                        Toast.makeText(parent.getContext(), "UNO 1.0 EVO WAY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.unobasic);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/195/2013/handbook-2013-uno.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 64:
                        Toast.makeText(parent.getContext(), "UNO 1.4 EVO ECONOMY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.unoo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/195/2013/handbook-2013-uno.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 65:
                        Toast.makeText(parent.getContext(), "UNO 1.4 EVO EVOLUTION SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.uno);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/195/2015/handbook-2015-uno.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 66:
                        Toast.makeText(parent.getContext(), "UNO 1.4 EVO SPORTING SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.unobasic);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/195/2015/handbook-2015-uno.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 67:
                        Toast.makeText(parent.getContext(), "UNO 1.4 EVO WAY SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.unobasic);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://servicos.fiat.com.br/content/dam/fiat/products/handbooks/195/2015/handbook-2015-uno.pdf");
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



        schoolViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

