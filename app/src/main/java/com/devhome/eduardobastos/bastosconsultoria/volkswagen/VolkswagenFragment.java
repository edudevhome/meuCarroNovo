package com.devhome.eduardobastos.bastosconsultoria.volkswagen;


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
public class VolkswagenFragment extends Fragment  {

    private VolkswagenViewModel volkswagenViewModel;
    private Spinner spinner;
    private ImageView imageView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        volkswagenViewModel =
                ViewModelProviders.of(this).get(VolkswagenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_volkswagen, container, false);
        final TextView textView = root.findViewById(R.id.text_volkswagen);

        spinner = root.findViewById(R.id.veiculosVolkswagen_spinner);

        imageView = root.findViewById(R.id.imageVeiculo);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.veiculosVolkswagen_array, android.R.layout.simple_spinner_item);
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
                        Toast.makeText(parent.getContext(), "CROSSFOX SELECIONADO",
                                Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.crossfox);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/crossfox/my-2018_181-5b1-crf-66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/my-2018_181-5b1-crf-66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "FOX SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.fox);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/fox/MY%202020_20B.5B1.FOX.66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202020_20B.5B1.FOX.66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;
                    case 3:
                        Toast.makeText(parent.getContext(), "GOL SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.gol);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/gol/MY%202019_D191.5B1.GOL.66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202019_D191.5B1.GOL.66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 4:
                        Toast.makeText(parent.getContext(), "GOLF SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.golf);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/golf/MY%202019%20-%205G0%20012%20766.BA.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202019%20-%205G0%20012%20766.BA.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 5:
                        Toast.makeText(parent.getContext(), "NOVO POLO SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.polo);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/polo/MY%202019_D192.5B1.POL.66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202019_D192.5B1.POL.66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 6:
                        Toast.makeText(parent.getContext(), "NOVO UP! SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.up);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/up/MY%202019_D191.5B1.BUP_66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202019_D191.5B1.BUP_66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 7:
                        Toast.makeText(parent.getContext(), "SPACE CROSS SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.spacecross);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/space-cross/MY%202018_181.5B1.SPF.66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202018_181.5B1.SPF.66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 8:
                        Toast.makeText(parent.getContext(), "SPACEFOX SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.spacefox);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/" +
                                        "manuais/spacefox/MY%202019_D191.5B1.SPF.66.pdf/_jcr_content/renditions/original.media_file.download_attachment.file/MY%202019_D191.5B1.SPF.66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 9:
                        Toast.makeText(parent.getContext(), "VIRTUS SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.virtus);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/virtus/MY%202019_D192.5B1.VIR.66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202019_D192.5B1.VIR.66.pdf");
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(intent);

                            }
                        });
                        break;

                    case 10:
                        Toast.makeText(parent.getContext(), "VOYAGE SELECIONADO", Toast.LENGTH_LONG).show();

                        imageView.setImageResource(R.drawable.voyage);

                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri uri = Uri.parse("https://www.vw.com.br/content/dam/vw-ngw/vw_pkw/importers/br/editorial/manuais/voyage/MY%202018_D191.5B1.VOY.66.pdf/_jcr_content/renditions/" +
                                        "original.media_file.download_attachment.file/MY%202018_D191.5B1.VOY.66.pdf");
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



        volkswagenViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

