import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble(); // Kullanıcıdan birinci sayıyı alır.

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble(); // Kullanıcıdan ikinci sayıyı alır.

        System.out.print("İşlem tipini giriniz +, -, *, / : ");
        char islem = input.next().charAt(0); // Kullanıcıdan işlem tipini alır.

        double sonuc = 0; // Sonucu tutmak için bir değişken oluşturulur ve başlangıç değeri atanır.

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2; // Toplama işlemi yapılır.
                break;
            case '-':
                sonuc = sayi1 - sayi2; // Çıkarma işlemi yapılır.
                break;
            case '*':
                sonuc = sayi1 * sayi2; // Çarpma işlemi yapılır.
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2; // Bölme işlemi yapılır (sıfıra bölme hatası kontrolü yapılır).
                } else {
                    System.out.println("Sıfıra bölme hatası!"); // Sıfıra bölme hatası durumunda kullanıcıya bilgi verilir.
                    return; // Program sonlandırılır.
                }
                break;
            default:
                System.out.println("Geçersiz işlem tipi!"); // Geçersiz işlem tipi girilirse kullanıcıya bilgi verilir.
                return; // Program sonlandırılır.
        }

        System.out.println("Sonuç: " + sonuc); // Sonuç ekrana yazdırılır.
    }
}
