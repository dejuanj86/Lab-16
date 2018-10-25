package ListOfCountries;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class CountriesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "Countries.txt";
        String directoryFolder = "Country Folder";
        


        CountriesTextFile.createFile(fileName, directoryFolder);
        int userInput = 0;

        do {
            System.out.println();
            System.out.println("Choose an option");
            System.out.println("1: Display countries");
            System.out.println("2: Enter in a country");
            System.out.println("Choose another number to Quit");
            userInput= sc.nextInt();
            sc.nextLine();
            System.out.println();
            if (userInput==1){
                CountriesTextFile.ReadFromFile(directoryFolder,fileName);
            }
            else if (userInput==2){
                CountriesTextFile.WriteToFile(sc,directoryFolder, fileName);
            }


        }while (userInput==1  || userInput==2);

        System.out.println("Goodbye");




    }

}
