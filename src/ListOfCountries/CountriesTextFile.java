package ListOfCountries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFile {

    public static void ReadFromFile(String directoryFolder, String filename) {
        Path filePath = Paths.get(directoryFolder, filename);
        File textFile = filePath.toFile();

        try {
            FileReader fr = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(fr);

            try {
                String line = reader.readLine();

                while (line != null){
                    System.out.println(line);
                    line = reader.readLine();
                }
                
                reader.close();
                
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Contact customer service!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static void WriteToFile(Scanner s,String directoryFolder, String fileName) {
        Path filePath = Paths.get(directoryFolder, fileName);
        File file = filePath.toFile();
        System.out.println("Enter a Country");
        String myCountry = s.nextLine();



        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(file, true));

            out.println();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createFile(String directoryFolder, String fileName) {
        Path filePath = Paths.get(directoryFolder,fileName);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
                System.out.println("File was created successfully!");
            } catch (IOException e) {
            	e.printStackTrace();
                System.out.println("There was an error!");
            }
       }else {
    	   System.out.println("File already exist");
       }

        }
//        System.out.println("File Name: " + filePath.getFileName());
//        System.out.println("Absolute Path: " + filePath.toAbsolutePath());
//        System.out.println("Is Writeable: " + Files.isWritable(filePath));

    

    public static void createDirectory() {
    	String dirPath = "Country";
    	Path folder = Paths.get(dirPath);
        if (Files.notExists(folder)){
            try {
                Files.createDirectories(folder);
                System.out.println("This folder was created successfully!");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("There was an error");
            }
        }
    }
}
