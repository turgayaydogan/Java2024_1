import java.util.Scanner;

/**
 * o1
 */
public class o1 {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int not1,not2,ortalama;

        System.out.println("1.Not:");
        not1 = giris.nextInt();

        System.out.println("2.Not:");
        not2 = giris.nextInt();

        ortalama = (not1 + not2) / 2;
        System.out.println("Ortalamanız="+ortalama);

        if(ortalama>=70){
            System.out.println("Başarılı");
        }




    }
}