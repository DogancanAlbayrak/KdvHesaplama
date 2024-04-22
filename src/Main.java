
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar;
        Scanner input = new Scanner (System.in);
        System.out.print("Ücret tutarını giriniz : ");

        tutar = input.nextDouble();
        double kdvOran = tutar <= 1000 ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar :" + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + kdvTutar);
        System.out.print("Kdv'li Tutarı : " + kdvliTutar);

}
}