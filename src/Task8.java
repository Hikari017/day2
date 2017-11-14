import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz jakiegos doubla: ");
        double someDouble = scanner.nextDouble();

        System.out.println((int) someDouble);


    }
}
