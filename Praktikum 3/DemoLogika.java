public class DemoLogika{
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Nilai dari Variabel...");
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);

        //Lebih Besar
        System.out.println("Lebih Besar Dari...");
        System.out.println("i > j = "+(i>j));
        System.out.println("j > i = "+(j>i));
        System.out.println("k > j = "+(k>j));

        //Lebih Besar atau Sama Dengan
        System.out.println("Lebih besar atau Sama Dengan");
        System.out.println("i >= j = "+(i>=j));
        System.out.println("j >= i = "+(j>=i));
        System.out.println("k >= j = "+(k>=j));

        //Lebih Kecil 
        System.out.println("Lebih Kecil Dari...");
        System.out.println("i < j = "+(i<j));
        System.out.println("j < i = "+(j<i));
        System.out.println("k < j = "+(k<j));

        //Lebih Kecil atau sama dengan
        System.out.println("Lebih kecil atau Sama Dengan");
        System.out.println("i <= j = "+(i<=j));
        System.out.println("j <= i = "+(j<=i));
        System.out.println("k <= j = "+(k<=j));

        //Sama Dengan
        System.out.println("Sama Dengan");
        System.out.println("i == j = "+(i==j));
        System.out.println("k == k = "+(k==j));
        
        //Tidak Sama Degan
        System.out.println("Tidak Sama Dengan");
        System.out.println("i != j = "+(i!=j));
        System.out.println("k != k = "+(k!=j));
    }
}