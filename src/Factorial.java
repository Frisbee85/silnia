import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sprawdz silnię z podanej liczby: X \nPodaj liczbę...");

        int number= scanner.nextInt();
        scanner.nextLine();
        int result = factorial(number);
        System.out.println("Silnia : " + number + "!"+" = " + result);
    }

    private static int factorial(final int n) {
        // 3argumentowy
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
