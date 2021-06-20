public class constantPool {

    public static void main(String[] args) {
        String s1 = new String("123");
        String s2 = new String("123");
        System.out.println(s1 == s2);

        Integer i1 = 300;
        Integer i2 = 300;
        System.out.println(i1.equals(i2));
    }
}
