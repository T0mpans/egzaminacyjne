package com.example.myapplication;

public abstract class Pytanie {
    private String trescPytania = "";
    private String nazwaPliku = "";
    private boolean poprawna;

    public Pytanie(String trescPytania, String nazwaPliku) {
        this.trescPytania = trescPytania;
        this.nazwaPliku = nazwaPliku;
        poprawna = false;
    }
    public abstract boolean sprawdzOdpowiedz(char odpowiedz);
}
