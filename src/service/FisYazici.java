package service;

import interfacee.IYemek;
import model.Siparis;
import java.io.FileWriter;
import java.io.IOException;

public class FisYazici {
    public void fisYazdir(Siparis siparis) {
        String dosyaAdi = "fisler/fis_masa" + siparis.getMasa().getMasaNo() + ".txt";
        try (FileWriter writer = new FileWriter(dosyaAdi)) {
            writer.write("--- FİŞ ---\n");
            writer.write(siparis.getMasa().toString() + "\n");
            for (IYemek yemek : siparis.getYemekler()) {
                writer.write(yemek.toString() + "\n");
            }
            writer.write("Toplam: " + siparis.toplamTutar() + " TL\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}