import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Tekli yorum satırı
        /* Çoklu yorum satırı*/
        System.out.println("");// Ekrana bir şeyler yazdırmak için

        // Veri tipleri,değişken oluşturma ve değer atama
        byte byte_veri_tipi=2;
        int int_veri_tipi=2;
        short short_veri_tipi=2;
        long long_veri_tipi=2;
        float float_veri_tipi=2.3f;
        double double_veri_tipi=2.3;
        char char_veri_tipi='a';
        boolean true_veri_tipi=true;
        boolean false_veri_tipi=false;
        String string_veri_tipi="Serdar";

        // Veri tipleri arasında dönüşüm yapılacaksa değerin önüne hangi veri tipini döneceği yazılır (int)(2.345) gibi

        /* Operatörler
            + --> Toplama
            - --> Çıkarma
            * --> Çarpma
            / --> Bölme
            % --> Mod

            Atama Operatörleri
            i++ önce işlemleri yapar sonra değeri arttırır
            ++i önce değeri arttırır sonra işlemleri yapar
            i+=1 i=i+1 işlemine denktir

         */

        Scanner scanner = new Scanner(System.in); // Scanner sınıfından nesne oluşturduk

        scanner.nextLine();// Kullanıcıdan string değerler almamızı sağlar
        scanner.nextInt();// Kullanıcıdan int değerler almamızı sağlar
        scanner.nextDouble();// Kullanıcıdan double değerler almamızı sağlar

    }
}
