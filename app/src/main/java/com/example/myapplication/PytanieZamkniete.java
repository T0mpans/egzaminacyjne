package com.example.myapplication;

public abstract class PytanieZamkniete extends Pytanie{
    public PytanieZamkniete(String trescPytania, String nazwaPliku) {
        super(trescPytania, nazwaPliku);
    }
    private String odpowiedzA;
    private String odpowiedzB;
    private String odpowiedzC;
    private char poprawnaOdpowiedz;

    public PytanieZamkniete(
            String trescPytania,
            String nazwaPliku,
            String odpowiedzA,
            String odpowiedzB,
            String odpowiedzC,
            char poprawnaOdpowiedz) {

        super(trescPytania, nazwaPliku);

        this.odpowiedzA = odpowiedzA;
        this.odpowiedzB = odpowiedzB;
        this.odpowiedzC = odpowiedzC;
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
    }

    // implementacja metody abstrakcyjnej
    @Override
    public boolean sprawdzOdpowiedz(char odpowiedz) {
        boolean poprawna;

        if (Character.toUpperCase(odpowiedz) == Character.toUpperCase(poprawnaOdpowiedz)) {
            poprawna = true;
        } else {
            poprawna = false;
        }

        return poprawna;
    }

}
