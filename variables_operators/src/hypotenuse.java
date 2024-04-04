import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Birinci Kenar:");
        double first_edge=scanner.nextDouble();
        System.out.printf("İkinci Kenar:");
        double second_edge= scanner.nextDouble();

        double hyp=Math.sqrt((first_edge*first_edge)+(second_edge*second_edge));
        System.out.printf("Hipotenüs:"+hyp);
    }
}
