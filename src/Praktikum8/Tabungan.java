package Praktikum_8;

public class Tabungan {
    int saldo;
    
    Tabungan(int initsaldo){
        this.saldo=initsaldo;
    }
    
    public void ambilUang(int jumlah){
        this.saldo=(saldo-jumlah);
    }
}
