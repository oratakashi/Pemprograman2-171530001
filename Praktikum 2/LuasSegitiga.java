import java.util.Scanner;
public class LuasSegitiga{
    public static void main(String[] args) {
        //byte alas = 10;
        //byte tinggi = 5;
        byte alas, tinggi;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Alas : ");
        alas = keyboard.nextByte();
        System.out.print("\nMasukan Tinggi : ");
        tinggi = keyboard.nextByte();

        float luas = alas*tinggi*.5F;
        System.out.println("\nLuas Segitiga : "+luas);
    }
}