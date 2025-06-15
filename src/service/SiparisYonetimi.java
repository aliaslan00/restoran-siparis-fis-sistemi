package service;

import model.Masa;
import model.Siparis;
import interfacee.IYemek;

import java.util.HashMap;
import java.util.Map;

public class SiparisYonetimi {
    private Map<Masa, Siparis> siparisler;

    public SiparisYonetimi() {
        siparisler = new HashMap<>();
    }

    public void siparisEkle(Masa masa, IYemek yemek) {
        siparisler.putIfAbsent(masa, new Siparis(masa));
        siparisler.get(masa).yemekEkle(yemek);
    }

    public Siparis getSiparis(Masa masa) {
        return siparisler.get(masa);
    }
}