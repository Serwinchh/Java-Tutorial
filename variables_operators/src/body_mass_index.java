import java.util.Scanner;

public class body_mass_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        double mass=scanner.nextDouble();
        System.out.printf("Lütfen boyunuzu giriniz (Örnek: 1,80):");
        double height=scanner.nextDouble();

        double bmi=(mass/(height*height));
        System.out.printf("Vücut Kitle İndeksiniz:"+bmi);

    }
}
