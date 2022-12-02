import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri belirleyelim. Meyve ve sebzelerin baş harflerini kullanalım.
        double a=2.14 ,e=3.67 ,d=1.11,m=0.95,p=5, kilo;

        //Kullanıcıdan değer alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldığınızı giriniz: ");
        kilo= input.nextDouble();
        System.out.print("Kaç kilo elma aldığınızı giriniz: ");
        kilo= input.nextDouble();
        System.out.print("Kaç kilo domates aldığınızı giriniz: ");
        kilo= input.nextDouble();
        System.out.print("Kaç kilo muz aldığınızı giriniz: ");
        kilo= input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldığınızı giriniz: ");
        kilo= input.nextDouble();

        //Fiyat çıktısını elde edebilmek için hesaplama yapalım.
        double fiyat;
        fiyat = (a*kilo) + (e*kilo) + (d*kilo) + (m*kilo) + (p*kilo);

        //Toplam tutarı kullanıcıya iletelim.
        System.out.print("Toplam Tutar: "+fiyat );
    }
}