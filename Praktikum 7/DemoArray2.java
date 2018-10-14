public class DemoArray2{
    public static void main(String[] args) {
        System.out.println("\n\nContoh1\n");
        int[] ages1 = new int[10];
        for( int i=0; i<10;i++){
            System.out.println(ages1[i]);
        }
        System.out.println("\n\nContoh2\n");
        int[] ages2 = new int[10];
        for(int i=0; i<ages2.length;i++){
            System.out.println(ages2[i]);
        }
        System.out.println("\n\nContoh3\n");
        int[] ages3 = new int[10];
        for(int i=0; i<ages3.length;i++){
            ages3[i]=i;
            System.out.println(ages3[i]);
        }
    }
}