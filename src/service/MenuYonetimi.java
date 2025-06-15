package service;

import model.Icecek;
import model.Yemek;
import interfacee.IYemek;
import java.util.ArrayList;
import java.util.List;

public class MenuYonetimi {
    private List<IYemek> menuler;

    public MenuYonetimi() {
        menuler = new ArrayList<>();
        menuler.add(new Yemek("Köfte", 70));
        menuler.add(new Yemek("Pilav", 25));
        menuler.add(new Icecek("Ayran", 15));
        menuler.add(new Icecek("Kola", 20));
    }

    public List<IYemek> getMenuler() {
        return menuler;
    }
}