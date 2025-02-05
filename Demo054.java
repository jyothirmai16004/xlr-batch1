public class Demo054 {
    public static void main(String[] args) {
        System.out.println(add(10, 20)); // 30
        System.out.println(add(10, 20, 30)); // 60
        System.out.println(add(10.5, 20.7)); // 31.2
    }

    public static int add(int a, int b) { return a + b; }
    public static int add(int a, int b, int c) { return a + b + c; }
    public static double add(double a, double b) { return a + b; }
}
