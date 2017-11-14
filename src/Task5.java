import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int a = scanner.nextInt();

        if(a  % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else{
            System.out.println("Liczba nie jest podzielna");
        }
    }
}
