import model.Masa;
import interfacee.IYemek;
import service.FisYazici;
import service.MenuYonetimi;
import service.SiparisYonetimi;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuYonetimi menuYonetimi = new MenuYonetimi();
        SiparisYonetimi siparisYonetimi = new SiparisYonetimi();
        FisYazici fisYazici = new FisYazici();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masa numarasını girin: ");
        int masaNo = scanner.nextInt();
        Masa masa = new Masa(masaNo);

        List<IYemek> menu = menuYonetimi.getMenuler();

        while (true) {
            System.out.println("--- Menü ---");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }
            System.out.print("Sipariş numarası (0 çıkış): ");
            int secim = scanner.nextInt();
            if (secim == 0) break;

            if (secim > 0 && secim <= menu.size()) {
                siparisYonetimi.siparisEkle(masa, menu.get(secim - 1));
            } else {
                System.out.println("Geçersiz seçim!");
            }
        }

        fisYazici.fisYazdir(siparisYonetimi.getSiparis(masa));
        System.out.println("Fiş yazdırıldı.");
    }
}