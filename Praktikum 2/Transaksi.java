import java.util.Scanner;
public class Transaksi{
    public static void menu(String[] args) {
        System.out.println("Kedai Berkah Cuyy");
        System.out.println("\nDaftar barang yang terjual\t: ");
        System.out.println("1. Ultramilk\t: 5000");
        System.out.println("2. Indomie\t: 2500");
        System.out.println("3. Cadbury \t: 15000");
        System.out.println("4. Silverqueen\t: 20000");
        System.out.println("5. Pop Mie\t:  5000");
        System.out.println("0. Selesai Memilih");
    }
    public static void cart(int indomie,int ultramilk,int cadbury,int silverqueen,int popmie) {
        System.out.println("\n\n========\tKeranja Belanjang\t========");
        if(ultramilk != 0){
            System.out.println("Ultramilk\t: "+ultramilk);
        }
        if(indomie != 0){
            System.out.println("Indomie\t\t: "+indomie);
        }
        if(cadbury != 0){
            System.out.println("Cadbury\t\t: "+cadbury);
        }
        if(silverqueen != 0){
            System.out.println("Silverqueen\t: "+silverqueen);
        }
        if(popmie != 0){
            System.out.println("Pop Mie\t\t: "+popmie);
        }
        System.out.println("\n\n========\t      Total\t\t========");
    }    
    public static int pilihan(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Silahkan Pilih Menu : ");
        int pilih = keyboard.nextInt();
        return pilih;
    }
    public static float hitung(int indomie,int ultramilk,int cadbury,int silverqueen,int popmie){
        for(int i=0;  ;i++){
            int pilih = pilihan();
            if(pilih!=0){
                if(pilih == 1){
                    ultramilk = ultramilk + 1;
                }else if(pilih == 2){
                    indomie = indomie + 1;
                }else if(pilih == 3){
                    cadbury = cadbury + 1;
                }else if(pilih == 4){
                    silverqueen = silverqueen + 1;
                }else if(pilih == 5){
                    popmie = popmie + 1;
                }
            }else{
                break;
            }
        }
        //Menampilkan Cart
        cart(indomie, ultramilk, cadbury, silverqueen, popmie);
        //Perhitungan Total
        float i = indomie;
        float u = ultramilk;
        float c = cadbury;
        float s = silverqueen;
        float p = popmie;
        float total = (u*5000F)+(i*2500F)+(c*15000F)+(s*20000F)+(p*5000F);
        System.out.println("\nTotal Pembelian adalah "+total);
        return total;
    }
    public static double trans(float uang,float total){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nMasukkan uang yang dibayarkan\t:");
        uang = keyboard.nextFloat();
        float kembalian = uang-total;
        return kembalian;
    }
    public static void main(String[] args) {      
        //Deklarasi
        int indomie, ultramilk,cadbury,silverqueen, popmie;
        float uang, total;
        double kembalian;
        //Inisialisasi
        indomie = 0;
        ultramilk = 0;
        cadbury = 0;
        silverqueen = 0;
        popmie = 0;
        uang = 0;
        //Manggil Menu
        menu(args);
        //Perhitungan
        total = hitung(indomie, ultramilk, cadbury, silverqueen, popmie); //Menjalankan Fungsi Hitung Untuk Menghitung Total
        kembalian = trans(uang, total); //Menjalankan Fungsi Trans Untuk Menghitung Kembalian
        int jujul = (int)kembalian;
        System.out.println("Kembaliannya sebesar\t:"+jujul+"\n\n");
    }
    
}