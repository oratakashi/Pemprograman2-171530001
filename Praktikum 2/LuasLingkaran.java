import java.util.Scanner;
public class LuasLingkaran{
    public static void main(String[] args) {
        int jari;
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Program Luas Lingkaran");
        System.out.println("\n\nMasukan jari-jari\t:");
        jari = Keyboard.nextInt();

        float total = jari*jari*3.14F;
        System.out.println("\n\nLuas lingkaran adalah "+total);
    }
}