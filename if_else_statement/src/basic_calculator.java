import java.util.Scanner;

public class basic_calculator {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String islemler = "1.Toplama İşlemi\n"
                +"2.Çıkarma İşlemi\n"
                +"3.Çarpma İşlemi\n"
                +"4.Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("Lütfen Yapacağınız İşlemi Seçiniz");
        String islem = scanner.nextLine();
        switch (islem){
            case "1":
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                float num1= scanner.nextFloat();
                System.out.println("Lütfen İkinci Sayıyı Giriniz:");
                float num2= scanner.nextFloat();
                System.out.println("İşlem Sonucu:"+(num1+num2));
                break;
            case "2":
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                num1= scanner.nextFloat();
                System.out.println("Lütfen İkinci Sayıyı Giriniz:");
                num2= scanner.nextFloat();
                System.out.println("İşlem Sonucu:"+(num1-num2));
                break;
            case "3":
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                num1= scanner.nextFloat();
                System.out.println("Lütfen İkinci Sayıyı Giriniz:");
                num2= scanner.nextFloat();
                System.out.println("İşlem Sonucu:"+(num1*num2));
                break;
            case "4":
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                num1= scanner.nextFloat();
                System.out.println("Lütfen İkinci Sayıyı Giriniz:");
                num2= scanner.nextFloat();
                System.out.println("İşlem Sonucu:"+(num1/num2));
                break;
        }
    }
}
