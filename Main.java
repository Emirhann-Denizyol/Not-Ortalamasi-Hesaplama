import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Mat notu gir");
        mat = scan.nextInt();
        System.out.println("Fizik notu gir");
        fizik = scan.nextInt();
        System.out.println("kimya notu gir");
        kimya = scan.nextInt();
        System.out.println("turkce notu gir");
        turkce = scan.nextInt();
        System.out.println("tarih notu gir");
        tarih = scan.nextInt();
        System.out.println("muzik notu gir");
        muzik = scan.nextInt();
        double ortalama;
        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println(ortalama);
    }
}