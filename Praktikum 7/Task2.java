import javax.swing.*;
public class Task2{

    public static void main(String[] args) {
        //Inisialisasi
        String barang[] = {"KB001", "KB002", "KB003", "KB004", "KB005"}; //Inisialisasi Kode Barang dalam bentuk Array
        /*
            Inisialisasi untuk inputan kdbarang, dan untuk menampung nmbarang yg di temukan
            dan cart[] array untuk menampung kdbarang yang di beli,
            variabel tampung untuk menampung daftar yang di beli
        */
        String kdbarang = "", nmbarang="",cart[]= new String[100], tampung="";
        /*
            jumlah[] deklarasi array untuk menampung jumlah yang di beli
            bayar deklarasi variabel untuk menampung inputan nominal bayar
        */
        int jumlah[] = new int[100], bayar = 0;
        //Deklarasi untuk menghitung total, subtotal, dan kembalian
        float total  = 0, subtotal=0, harga[]=new float[100],kembali = 0;
        
        //Deklarasi untuk menampung tgl, nofaktur, dan nama konsumer
        String tgl = JOptionPane.showInputDialog(null, "Silahkan Input Tanggal");
        String nofaktr = JOptionPane.showInputDialog(null, "Silahkan No Faktur");
        String nama = JOptionPane.showInputDialog(null, "Silahkan Nama Kostumer");

        while(true){ //InfinyLoop
            kdbarang = JOptionPane.showInputDialog(null, "Silahkan Input Kode Barang: "); //Meminta inputan kdbarang
            for(int i=0; i<barang.length;i++){ //Looping untuk memeriksa kode barang di array barang[]
                if(kdbarang.equals(barang[i])){
                    if(barang[i] == "KB001"){
                        nmbarang = "Blazer Cokelat L";
                        harga[i] = 150000;
                    }else if(barang[i] == "KB002"){
                        nmbarang = "Blazer Hitam L";
                        harga[i] = 180000;
                    }else if(barang[i] == "KB003"){
                        nmbarang = "Blazer Campur 1";
                        harga[i] = 295000;
                    }else if(barang[i] == "KB004"){
                        nmbarang = "Blazer Campur 2";
                        harga[i] = 305000;
                    }else if(barang[i] == "KB005"){
                        nmbarang = "Elegant Jeans 1";
                        harga[i] = 225000;
                    }else if(barang[i] == "KB006"){
                        nmbarang = "Elegant Jeans 2";
                        harga[i] = 175000;
                    }
                    
                    int tmp = Integer.parseInt(JOptionPane.showInputDialog(null, barang[i]+" : "+nmbarang+" : ")); //Menginputkan Jumlah brg yg di beli
                    if(tmp>jumlah[i]){ //Memeriksa nilai yang di input lebih besar dari jumlah atau engga (Memeriksa sudah di pakai belum arraynya)
                        jumlah[i] = tmp;
                        cart[i] = barang[i];
                    }
                    subtotal = jumlah[i]*harga[i];
                    total = total+jumlah[i]*harga[i];
                    JOptionPane.showMessageDialog(null, 
                    "Kode Barang : "+cart[i]+"\n"+
                    "Nama Barang : "+nmbarang+"\n"+
                    "Barang berhasil ditambahkan"
                    );
                    break; //Menghentikan Looping
                }
            }
            
            //Meminta Inputan Yes / NO
            int jawab = JOptionPane.showOptionDialog(null, "Sub Total\t: "+subtotal+"\n"+
            "Total\t: "+total+"\n\n"+"Ingin menambah barang?", "Peringatan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(jawab == JOptionPane.NO_OPTION){
                break;
            }
        }
        while(true){ //InfiniteLoop
            //Meminta Inputan Nominal Bayar
            bayar = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Total\t: "+total+"\n"+
            "Silahkan masukan nominal pembayaran :"));
            kembali = bayar-total;
            if(kembali < 0){ //Jika Duit Kurang Muncul Peringatan
                JOptionPane.showMessageDialog(null, "Nominal yang anda masukan kurang dari total pembelian");
            }else{ //Jika Duit Cukup Menghentikan Perulangan
                break;
            }
        }
        for(int i=0; i<cart.length;i++){ //Looping untuk membuat daftar belanja
            if(cart[i] == "KB001"){
                nmbarang = "Blazer Cokelat L";
                harga[i] = 150000;
            }else if(cart[i] == "KB002"){
                nmbarang = "Blazer Hitam L";
                harga[i] = 180000;
            }else if(cart[i] == "KB003"){
                nmbarang = "Blazer Campur 1";
                harga[i] = 295000;
            }else if(cart[i] == "KB004"){
                nmbarang = "Blazer Campur 2";
                harga[i] = 305000;
            }else if(cart[i] == "KB005"){
                nmbarang = "Elegant Jeans 1";
                harga[i] = 225000;
            }else if(cart[i] == "KB006"){
                nmbarang = "Elegant Jeans 2";
                harga[i] = 175000;
            }else if(cart[i]==null){
                continue;
            }
            tampung = tampung+"Kode Barang\t: "+cart[i]+"\n"+"Nama Barang\t: "+nmbarang+"\n"+"Jumlah\t: "+jumlah[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, 
        "Tanggal\t\t: "+tgl+"\n"+
        "No Faktur\t\t: "+nofaktr+"\n"+
        "Nama Pelanggan\t: "+nama+"\n\n"+
        "Daftar Belanja :"+"\n"+tampung+"\n"+
        "Total\t: "+total+"\n"+
        "Bayar\t: "+bayar+"\n"+
        "Kembalian\t: "+kembali
        ); //Menampilkan Nota dan Daftar barang
        System.exit(0); //Keluar dari program
        
    }
}