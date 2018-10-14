import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader{
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nim="", nama="", tempat="", tgllahir="";
        System.out.print("Masukan Nama Anda : ");
        nama = dataIn.readLine();
        System.out.print("Masukan NIM Anda : ");
        nim = dataIn.readLine();
        System.out.print("Masukan Tempat Lahir Anda : ");
        tempat = dataIn.readLine();
        System.out.print("Masukan Tgl Lahir Anda : ");
        tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Selamat Datang "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Tempat Lahir : "+tempat);
        System.out.println("Tgl Lahir : "+tgllahir);
    }
}