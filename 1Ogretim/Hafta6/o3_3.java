import java.util.Scanner;

public class o3_3 {
    public static void main(String[] args) {
        double[] sicaklik=new double[7];
        double toplam=0;
        double ortalama;
        Scanner giris=new Scanner(System.in);
        //sicaklik.length = dizinin uzunluğu = satır sayısı,eleman sayısı
        for (int i = 0; i < 7; i++) {
            System.out.println("Sıcaklık:");
            sicaklik[i] = giris.nextDouble();
            toplam += sicaklik[i];
        }
        
        //ortalama hesapla
        ortalama = toplam / 7;
        System.out.println(ortalama);
    }
}
