import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class Alphabetize {

    public static void main(String[] args) {

        // Eclipse runs programs from the project root
        String fileName = "Names";

        try {
            List<String> names = Files.readAllLines(Paths.get(fileName));

            // Sort by last name (case-insensitive)
            names.sort(Comparator.comparing(
                    Alphabetize::getLastName,
                    String.CASE_INSENSITIVE_ORDER
            ));

            // Print sorted names
            for (String name : names) {
                System.out.println(name);
            }

        } catch (IOException e) {
            e.printStackTrace(); // shows the real problem if something goes wrong
        }
    }

    private static String getLastName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        return parts[parts.length - 1];
    }
}

//1/28/ From Home - Still doesnt work
