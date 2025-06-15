package model;

import interfacee.IYemek;

public class Icecek implements IYemek {
    private String isim;
    private double fiyat;

    public Icecek(String isim, double fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    @Override
    public String getIsim() {
        return isim;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return isim + " - " + fiyat + " TL";
    }
}