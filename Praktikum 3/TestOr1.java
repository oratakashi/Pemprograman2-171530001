public class TestOr1{
    public static void main(String[] args) {
        int j = 10;
        int i = 0;

        boolean test=true;

        test = (i>10)|(j++>0);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}