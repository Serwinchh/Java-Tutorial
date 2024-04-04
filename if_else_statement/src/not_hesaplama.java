import java.util.Scanner;

public class not_hesaplama {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vize Yüzdesini Giriniz:");
        float vizeOran = scanner.nextFloat();
        System.out.println("Final Yüzdesini Giriniz:");
        float finalOran = scanner.nextFloat();
        System.out.println("Vize Notunuzu Giriniz:");
        float vizeNot=scanner.nextFloat();
        System.out.println("Final Notunuzu Giriniz:");
        float finalNot=scanner.nextFloat();
        double ortalama=(vizeNot*vizeOran/100)+(finalNot*finalOran/100);
        if (ortalama>=90){
            System.out.println("AA");
            System.out.println(ortalama);
        } else if (ortalama>=85) {
            System.out.println("BA");
            System.out.println(ortalama);
        }else if (ortalama>=80){
            System.out.println("BB");
            System.out.println(ortalama);
        } else if (ortalama>=75) {
            System.out.println("CB");
            System.out.println(ortalama);
        } else if (ortalama>=70) {
            System.out.println("CC");
            System.out.println(ortalama);
        } else if (ortalama>=65) {
            System.out.println("DC");
            System.out.println(ortalama);
        } else if (ortalama>=60) {
            System.out.println("DD");
            System.out.println(ortalama);
        } else if (ortalama>=55) {
            System.out.println("FD");
            System.out.println(ortalama);
        }else {
            System.out.println("FF");
            System.out.println(ortalama);
        }
    }
}
