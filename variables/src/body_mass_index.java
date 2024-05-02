import java.util.Scanner;

public class body_mass_index {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        double mass= scanner.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz:");
        double height=scanner.nextDouble();
        double body_mass= mass/(height*height);
        System.out.println("Beden kitle indeksiniz:"+body_mass);
    }
}
