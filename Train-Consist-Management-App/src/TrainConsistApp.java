import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 UC1: Initialize
        List<String> bogies = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());

        // 🔹 UC2: Add Passenger Bogies
        System.out.println("\n--- Adding Passenger Bogies ---");

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("Bogies after addition: " + bogies);

        // 🔹 Remove one bogie
        System.out.println("\n--- Removing Bogie ---");
        bogies.remove("AC Chair");

        System.out.println("Bogies after removal: " + bogies);

        // 🔹 Check existence
        System.out.println("\n--- Checking Existence ---");
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // 🔹 Final state
        System.out.println("\nFinal Train Consist: " + bogies);

        System.out.println("\nProgram continues...");
    }
}
