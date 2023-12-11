import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party = "";

        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        party = in.nextLine();

        if (party.equals("D"))
        {
            System.out.println("You said your party affiliation is Democrat Donkey.");
        } else if (party.equals("R")) {
            System.out.println("You said your party affiliation is Republican Elephant.");
        } else if (party.equals("I")) {
            System.out.println("You said your party affiliation is Independent Person.");
        } else {
            System.out.println("You said your party affiliation is Other: " + party);
            System.out.println("Run the program again. That's not a valid party.");
        }
    }
    }
