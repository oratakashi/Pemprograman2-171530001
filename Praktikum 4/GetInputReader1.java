import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader1{
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nim = "", nama = "";

        System.out.println("Masukan Nama Anda: ");
        try{
            nama = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        System.out.println("Masukan NIM Anda: ");
        try{
            nim = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Selamat datang "+nama);
        System.out.println("NIM : "+nim);
    }
}