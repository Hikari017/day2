import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz ilość miejsc: ");
        int seats = scanner.nextInt();

        System.out.print("Wpisz ilość rzędów: ");
        int rows = scanner.nextInt();

        int seatPerRow = seats % rows;

        if(seatPerRow != 0){
            System.out.println("Kazdy rzad: " + (seats / (rows - 1)));
            System.out.println("Ostatni: " + (seats % (rows - 1)));
        } else {
            System.out.println("Kazdy rzad: " + seats / rows);
        }
    }
}
