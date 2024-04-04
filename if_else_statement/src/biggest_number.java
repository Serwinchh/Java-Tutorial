import java.util.Scanner;

public class biggest_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        float firstN = scanner.nextFloat();
        System.out.println("İkinci sayıyı giriniz");
        float secondN = scanner.nextFloat();
        System.out.println("Üçüncü sayıyı giriniz");
        float thirthN = scanner.nextFloat();

        if (( firstN>secondN) && firstN>thirthN){
            System.out.println("En büyük sayı:"+firstN);

        } else if (secondN>firstN && secondN>thirthN) {
            System.out.println("En büyük sayı:"+secondN);

        } else {
            System.out.println("En büyük sayı:"+thirthN);


        }


    }
}