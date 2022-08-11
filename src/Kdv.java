import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

            float fiyat;
            Scanner Girdi = new Scanner(System.in);
            System.out.println("fiyat giriniz ");
            fiyat = Girdi.nextInt();


            float hesaplananKdv = (fiyat > 1000.0) ? fiyat * 0.08f : fiyat * 0.18f;

            System.out.println(hesaplananKdv);

    }
    }


