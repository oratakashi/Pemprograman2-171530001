import java.io.*;

public class TipeDosen{
    public static void main(String[] args) throws IOException {
        //deklarasi variabel
        String tampang;
        String nilai;
        //deklarasi object buffered reader
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        //input data
        System.out.print("Tampang : ");
        tampang = dataInput.readLine();
        System.out.print("Nilai : ");
        nilai = dataInput.readLine();
        //percabangan
        if(tampang.equals("Baik") && nilai.equals("Baik")){
            System.out.println("Nilai A Untuk Kalian");
            System.out.println("Most Wanted");
        }else if(tampang.equals("Baik") && nilai.equals("Muke Gile")){
            System.out.println("Nilai CD Untuk Kalian");
            System.out.println("Muke Gile");
        }else if(tampang.equals("Muke Gile") && nilai.equals("Baik")){
            System.out.println("Nilai A Untuk Kalian");
            System.out.println("Most Wanted");
        }else if(tampang.equals("Muke Gile") && nilai.equals("Muke Gile")){
            System.out.println("Nilai CD Untuk Kalian");
            System.out.println("Muke Gile");
        }
    }
}