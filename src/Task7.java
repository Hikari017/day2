public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        b = b + a; //15
        a = b - a; // 15 - 5 = 10;
        b = b - a; // 15 - 10 = 5;

        System.out.println(a +  " : " + b);
    }
}
