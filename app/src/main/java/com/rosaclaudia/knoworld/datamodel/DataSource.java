package com.rosaclaudia.knoworld.datamodel;

import com.rosaclaudia.knoworld.R;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DataSource {

    private Hashtable<String, Citta> elencoCitta;

    private static DataSource instance = null;

    private DataSource(){
        elencoCitta=new Hashtable<>();
        popolaDataSource();
    }

    public static DataSource getInstance() {
        if (instance == null)
            instance = new DataSource();
        return instance;
    }

    public void addCitta(Citta citta){
        elencoCitta.put(citta.getNome(),citta);

    }

    public void deleteCitta(String nome){
        elencoCitta.remove(nome);
    }

    public Citta getCitta (String nome){
        return elencoCitta.get(nome);
    }

    public List<Citta> getElencoCitta(String prefissoNome){

        ArrayList<Citta> risultato = new ArrayList<Citta>();

        for(Map.Entry<String, Citta> elemento: elencoCitta.entrySet()){
                risultato.add(elemento.getValue());
        }

        return risultato;

    }


    private void popolaDataSource(){

        elencoCitta.put("Roma", new Citta("Roma",  R.drawable.roma));
        elencoCitta.put("Firenze", new Citta("Firenze", R.drawable.firenze));
        elencoCitta.put("Napoli", new Citta("Napoli",  R.drawable.napoli));
        elencoCitta.put("Rimini", new Citta("Rimini",  R.drawable.rimini));
        elencoCitta.put("Ravenna", new Citta("Ravenna",R.drawable.ravenna));

    }

}
