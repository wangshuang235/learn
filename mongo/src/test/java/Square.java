public class Square {
    long width;
    public Square(long l) {
        width = l;
    }
    public static void main(String arg[]) {
        Square a, b, c;
        a = new Square(42L);
        b = new Square(42L);
        c = b;
        long s = 42L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
    }
}
