import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is uw naam? ");
        
        String naam = scanner.nextLine();

        if (naam.equals("Arnold Schwarzenegger")) {
            System.out.println("\nOefening voor Armen: herhaal 3 keer (rust tussendoor 30 seconden) 3 Push-ups");
            System.out.println("Oefening voor Buik: herhaal 3 keer (rust tussendoor 30 seconden) 4 Sit-ups");
            System.out.println("Oefening voor Benen: herhaal 2 keer (rust tussendoor 30 seconden) 5 Squats");
            System.out.println("Oefening voor Rug: herhaal 3 keer (rust tussendoor 15 seconden) 3 Supermans");
            System.out.println("Oefening voor Borst: herhaal 3 keer (rust tussendoor 30 seconden) 3 Chest-dips");
        } else if (naam.equals("Kim Kardashian")) {
            System.out.println("\nUw trainer: Daphne Jongejans");
            System.out.println("Oefening voor Rug: herhaal 3 keer (rust tussendoor 15 seconden) 3 Supermans");
            System.out.println("Oefening voor Buik: herhaal 3 keer (rust tussendoor 30 seconden) 4 Sit-ups");
        } else {
            System.out.println("\nU komt niet voor in ons systeem.");
        }

        scanner.close();
    }
}
