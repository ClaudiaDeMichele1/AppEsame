package com.rosaclaudia.knoworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.rosaclaudia.knoworld.datamodel.Citta;
import com.rosaclaudia.knoworld.datamodel.DataSource;

public class ActivityListaCitta extends AppCompatActivity {

    private ListView vListaCitta;
    private CittaAdapter adapter;
    private DataSource dataSource;

    private final String EXTRA_CITTA = "citta";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_citta);
        vListaCitta = findViewById(R.id.listaCitta);
        dataSource = DataSource.getInstance();
        adapter = new CittaAdapter(this,dataSource.getElencoCitta("R"));
        vListaCitta.setAdapter(adapter);
        vListaCitta.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Citta citta=(Citta)adapter.getItem(position);
                Intent intent = new Intent(view.getContext(), ActivityDettaglioCitta.class);
                intent.putExtra(EXTRA_CITTA, citta);
                startActivity(intent);
            }
        });
    }
}
