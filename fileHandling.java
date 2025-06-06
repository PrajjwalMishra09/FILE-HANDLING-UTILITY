// Import necessary classes for file handling
import java.io.*;
import java.util.Scanner;

// Main class for File Handling Utility
public class FileHandlingUtility {

    // Method to write content to a file
    public static void writeFile(String filename, String content) {
        try {
            // FileWriter creates or opens a file in write mode
            FileWriter writer = new FileWriter(filename, false);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read and display content from a file
    public static void readFile(String filename) {
        try {
            // FileReader reads characters from a file
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Reading file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to append content to an existing file
    public static void modifyFile(String filename, String newContent) {
        try {
            // FileWriter with 'true' flag opens file in append mode
            FileWriter writer = new FileWriter(filename, true);
            writer.write(newContent);
            writer.close();
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "example.txt";

        // Write operation
        System.out.println("Enter content to write into the file:");
        String content = scanner.nextLine();
        writeFile(filename, content);

        // Read operation
        readFile(filename);

        // Modify operation
        System.out.println("Enter content to append to the file:");
        String newContent = scanner.nextLine();
        modifyFile(filename, "\n" + newContent);

        // Read updated content
        readFile(filename);

        scanner.close();
    }
}
