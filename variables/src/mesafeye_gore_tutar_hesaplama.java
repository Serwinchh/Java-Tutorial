import java.util.Scanner;

public class mesafeye_gore_tutar_hesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Aracınız kilometre başına ne kadar yakıyor:");
        double tutar= scanner.nextDouble();
        System.out.println("Aracınızla kaç kilometre gittiniz:");
        double km= scanner.nextDouble();
        System.out.println("Toplam tutar:"+(km*tutar));
    }
}
