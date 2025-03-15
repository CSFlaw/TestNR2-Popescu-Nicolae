public class Ex1 {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = 100;
        double d = i;
        long l = 5000;
        int il = (int) l;
        System.out.println("byte to short: " + s);
        System.out.println("int to double: " + d);
        System.out.println("long to int: " + il);
    }
}
