package com.rosaclaudia.knoworld.datamodel;


import java.io.Serializable;

public class Citta implements Serializable {

    private String nome;
    private int image;
    private String descrizione;



    public Citta() {
    }

    public Citta(String nome, int image, String descrizione) {
        this.nome = nome;
        this.image = image;
        this.descrizione= descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
