import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        int yas, mesafe, YolcuTip;
        double Nfiyat, yasInd, GidisDonus;

        Scanner input = new Scanner(System.in);

        System.out.println("Onur Air Hoş Geldiniz");
        System.out.print(" Lütfen uçuş mesafesini giriniz: ");
        mesafe = input.nextInt();
        Nfiyat = mesafe * 0.10;

        while (mesafe < 0) {
            System.out.println(" Hatalı bilgi girdiniz.\nlütfen mesafeyi tekrar giriniz: ");
            mesafe = input.nextInt();
        }
        System.out.print(" Yaş :");
        yas = input.nextInt();
        while (yas < 0) {
            System.out.print("Hatalı bilgi girdiniz.\nlütfen mesafeyi tekrar giriniz: ");
        }
        System.out.print("1 - Tek yön " + " 2 - Gidiş dönüş");
        System.out.print("Yolculuk Tipi : ");
        YolcuTip = input.nextInt();
        double indirimF = Nfiyat;
        if (yas < 12) {
            yasInd = Nfiyat * 0.50;
            indirimF = Nfiyat - yasInd;
        } else if (yas <= 24) {
            yasInd = Nfiyat * 0.10;
            indirimF = Nfiyat - yasInd;
        } else if (yas > 65) {
            yasInd = Nfiyat * 0.30;
            indirimF = Nfiyat - yasInd;
        }
        if (YolcuTip == 1) {
            System.out.print("Toplam Tutar : " + indirimF + " TL ");
        } else {
            GidisDonus = indirimF * 0.20;
            indirimF = (indirimF - GidisDonus) * 2;
            System.out.println("Toplam Tutar : " + indirimF + " TL ");
        }


    }
}
