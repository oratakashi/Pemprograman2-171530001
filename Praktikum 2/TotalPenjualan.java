public class TotalPenjualan{
    public static void main(String[] args) {
        int KopiHitam = 3000;
        System.out.println("Harga Kopi Hitam : "+KopiHitam);
        int Esteh = 3500;
        System.out.println("Harga Es Teh : "+Esteh);
        int NasiGoreng = 8000;
        System.out.println("Nasi Goreng : "+NasiGoreng);
        int MieGoreng = 7500;
        System.out.println("Mie Goreng : "+MieGoreng);

        long Total = NasiGoreng+Esteh;
        System.out.println("Total : "+Total);

        float Bayar = 50000;
        double Kembalian = Total-Bayar;
        int Jujul = (int)Kembalian;
        System.out.println("Kembalian : "+Jujul);

    }
}