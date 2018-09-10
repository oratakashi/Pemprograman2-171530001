public class DemoCasting{
    public static void main(String[] args) {
        //Casting Implisit
        byte b = 100;
        int i = b;
        System.out.println("Casting Int i : "+i);
        //Casting Explisit
        int x = 1000;
        byte y = (byte) x;
        System.out.println("Casting Byte y : "+y);

        double j = 10.5;
        int k = (int) j;
        System.out.println("Casting Int k : "+k);

        double a = 10.2;
        int l = (int) a;
        System.out.println("Casting Int l : "+l);

        double c = 10.8;
        short m = (short) c;
        System.out.println("Casting short m : "+m);
    }
}