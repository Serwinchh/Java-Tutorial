import java.util.Scanner;

public class body_mass_index {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu giriniz:");
        float mass= scanner.nextFloat();
        System.out.println("Lütfen Boyunuzu Giriniz (Metre Cinsinden):");
        float height= scanner.nextFloat();
        double index= (mass/(height*height));

        if (index<18.5){
            System.out.println("Zayıfsınız");
        } else if (index >= 18.5 && index<25) {
            System.out.println("Normal");
        }else if (index>=25 && index<30){
            System.out.println("Fazla Kilolu");
        }else{
            System.out.println("Obez");
        }
    }
}
