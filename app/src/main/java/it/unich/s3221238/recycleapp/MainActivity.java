package it.unich.s3221238.recycleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelliGiochi> modelliGiochi = new ArrayList<> ();

    int [] GiochiImages = {R.drawable.primo_vector,
            R.drawable.secondo_vector,
            R.drawable.terzo_vector,
            R.drawable.quarto_vector,
            R.drawable.quinto_vector,
            R.drawable.sesto_vector,
            R.drawable.settimo_vector,
            R.drawable.ottavo_vector,
            R.drawable.nono_vector,
            R.drawable.decimo_vector,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mReclyclerView);

        setUpmodelliGiochi();

        GG_RecyclerViewAdapter adapter = new GG_RecyclerViewAdapter(this,
                modelliGiochi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpmodelliGiochi() {
        String[] nomiGiochi =getResources().getStringArray(R.array.Nome_App);
        String[] nomeSito = getResources().getStringArray(R.array.Sito);

        for (int i = 0; i<nomiGiochi.length; i++) {
            modelliGiochi.add(new ModelliGiochi(nomiGiochi[i],
                    nomeSito[i],
                    GiochiImages[i]));
        }
    }
}