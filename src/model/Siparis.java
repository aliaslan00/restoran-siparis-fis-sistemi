package model;

import interfacee.IYemek;
import java.util.ArrayList;
import java.util.List;

public class Siparis {
    private Masa masa;
    private List<IYemek> yemekler;

    public Siparis(Masa masa) {
        this.masa = masa;
        this.yemekler = new ArrayList<>();
    }

    public void yemekEkle(IYemek yemek) {
        yemekler.add(yemek);
    }

    public List<IYemek> getYemekler() {
        return yemekler;
    }

    public double toplamTutar() {
        return yemekler.stream().mapToDouble(IYemek::getFiyat).sum();
    }

    public Masa getMasa() {
        return masa;
    }
}
