import java.util.Random;
import java.util.Scanner;

/**
 * o7_2
 */
public class o7_2 {

    public static void main(String[] args) {
        //Dinamik Dizi
        //her çalıştığında eleman sayısı farklı olan dizi
        Scanner giris=new Scanner(System.in);
        Random rnd = new Random();
        int elemanSayisi=0;
        int[] sayilar;
        
        System.out.println("Eleman Sayısı Gir:");
        elemanSayisi = giris.nextInt();
        sayilar=new int[elemanSayisi];
        
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = rnd.nextInt(100);
            System.out.println(sayilar[i]);
        }
    }
}