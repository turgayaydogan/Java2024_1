import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi1, sayi2, sonuc = 0;
        char secim;

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        System.out.println("Hesaplama İşlemi(+,-,*,/):");
        secim = giris.next().charAt(0);
        // sadece == kontrolü yapılır
        switch (secim) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            default:
                break;
        }//dış

        

        System.out.println("Hesaplama Sonucu=" + sonuc);
    }
}
