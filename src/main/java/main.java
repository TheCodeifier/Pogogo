import java.util.ArrayList;
import java.util.Scanner;

class Oefening {
    private final String naam;
    private final String spiergroep;
    private final int aantalSets;
    private final int aantalHerhalingen;
    private final int rusttijd;

    public Oefening(String naam, String spiergroep, int aantalSets, int aantalHerhalingen, int rusttijd) {
        this.naam = naam;
        this.spiergroep = spiergroep;
        this.aantalSets = aantalSets;
        this.aantalHerhalingen = aantalHerhalingen;
        this.rusttijd = rusttijd;
    }

    public void toonGegevens() {
        System.out.printf("Oefening voor %s: herhaal %d keer (rust tussendoor %d seconden) %d %s%n",
                spiergroep, aantalSets, rusttijd, aantalHerhalingen, naam);
    }
}

class Trainingsschema {
    private final String klant;
    private final String trainer;
    private final ArrayList<Oefening> oefeningen;

    public Trainingsschema(String klant, String trainer) {
        this.klant = klant;
        this.trainer = trainer;
        this.oefeningen = new ArrayList<>();
    }

    public void voegOefeningToe(Oefening oefening) {
        if (oefening != null) {
            oefeningen.add(oefening);
        }
    }

    public boolean isSchemaVoor(String klant) {
        return this.klant.equalsIgnoreCase(klant);
    }

    public void toonGegevens() {
        System.out.println("\nWat is uw naam? " + klant);

        if (trainer != null && !trainer.isEmpty()) {
            System.out.println("Uw trainer: " + trainer);
        }

        for (Oefening oefening : oefeningen) {
            oefening.toonGegevens();
        }
    }
}

public class main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Trainingsschema schemaArnold = new Trainingsschema("Arnold Schwarzenegger", "Geen trainer toegewezen");
        schemaArnold.voegOefeningToe(new Oefening("Push-ups", "Armen", 3, 3, 30));
        schemaArnold.voegOefeningToe(new Oefening("Sit-ups", "Buik", 3, 4, 30));
        schemaArnold.voegOefeningToe(new Oefening("Squats", "Benen", 2, 5, 30));
        schemaArnold.voegOefeningToe(new Oefening("Supermans", "Rug", 3, 3, 15));
        schemaArnold.voegOefeningToe(new Oefening("Chest-dips", "Borst", 3, 3, 30));

        Trainingsschema schemaKim = new Trainingsschema("Kim Kardashian", "Daphne Jongejans");
        schemaKim.voegOefeningToe(new Oefening("Supermans", "Rug", 3, 3, 15));
        schemaKim.voegOefeningToe(new Oefening("Sit-ups", "Buik", 3, 4, 30));


        ArrayList<Trainingsschema> schemas = new ArrayList<>();
        schemas.add(schemaArnold);
        schemas.add(schemaKim);

        System.out.print("Wat is uw naam? ");

        String naam = scanner.nextLine();
        boolean gevonden = false;

        for (Trainingsschema schema : schemas) {
            if (schema.isSchemaVoor(naam)) {
                schema.toonGegevens();
                gevonden = true;
                break;
            }
        }

        if (!gevonden) {
            System.out.println("\nU komt niet voor in ons systeem.");
        }

        scanner.close();
    }
}
