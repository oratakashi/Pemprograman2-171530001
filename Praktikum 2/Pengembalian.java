public class Pengembalian {
    public static void main(String[] args) {
        long BarA = 1000;
        long BarB = 2000;
        long BarC = 3000;
        long BarD = 4000;
        long BarE = 5000;
        double Total = BarA+BarB+BarC+BarD+BarE;
        float Bayar = 50000;
        double Kembalian = Total-Bayar;
        int Jujul = (int)Kembalian;
        System.out.println("Kembalian : "+Jujul);
    }
}