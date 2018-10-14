import java.io.*;

public class Task1{
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        //Deklarasi Array dan Pariabel
        String barang[] = new String[100];
        String nmbarang[] = new String[100];
        int jumlah[] = new int[100];

        String pilihan = "";

        while(true){ //Looping Untuk Menu Utama
            System.out.println("Selamat Datang");
            System.out.println("Toko Masih Harapan");
            System.out.println("===================================");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Daftar Barang");
            System.out.println("0. Keluar");
            System.out.println("===================================");
            System.out.print("Masukan Inputan : ");
            int Inputan = Integer.parseInt(dataIn.readLine()); //Memasukan Inputan Menu
            if(Inputan == 1){ //JIka Inputan 1
                pilihan = "Y"; //Memberi Nilai jadi Y
                Mendek:
                //while(true){ 
                    for(int i=0; i<barang.length; i++){ //Perulangan Input Barang
                        if(pilihan.equalsIgnoreCase("Y")||pilihan.equalsIgnoreCase("y")){ //Jika Menginput Y maka Input Barang
                            System.out.print("Masukan Kode Barang : ");
                            barang[i] = dataIn.readLine();
                            System.out.print("Masukan Nama Barang : ");
                            nmbarang[i] = dataIn.readLine();
                            System.out.print("Masukan Jumlah Barang : ");
                            jumlah[i] = Integer.parseInt(dataIn.readLine());
                            System.out.println("===================================");
                            System.out.print("Ingin menambah barang lagi ? (Y/N) ");
                            pilihan = dataIn.readLine();
                        }else{ //Jika N maka Berhenti
                            break Mendek;
                        }
                        
                    }
                //}
            }else if(Inputan == 2){ //Jika Inputan 2
                pilihan = "N";
                while(true){ //Infinite loop
                    if(pilihan.equalsIgnoreCase("Y")||pilihan.equalsIgnoreCase("y")){ 
                        break; // JIka Pilihan Y maka Looping berhenti
                    }else{
                        //Jika N Looping terus berjalan
                        System.out.println("Daftar barang : ");
                        for(int i=0; i<barang.length; i++){
                            if(barang[i]!=null){
                                System.out.println("Kode Barang\t: "+barang[i]);
                                System.out.println("Nama Barang\t: "+nmbarang[i]);
                                System.out.println("Jumlah Barang\t: "+jumlah[i]);
                            }else{
                                //Jika Nilainya Kosong maka akan di lewati
                                continue;
                            }
                        }
                    }
                    System.out.println("===================================");
                    System.out.print("Ingin kembali ke menu utama ? (Y/N) ");
                    pilihan = dataIn.readLine();
                }
            }else if(Inputan == 0){
                System.exit(0);
            }else{
                System.out.println("System Error.... ");
            }
        }
    }
}