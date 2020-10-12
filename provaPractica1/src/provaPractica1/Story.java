package provaPractica1;

import java.util.Scanner;

public class Story {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String line1, line2, line3,name, job;
        name = "";
        job = "";
        line1 = "I will tell you a story, but I need some information first.\nWhat is the main character called?";
        line2 = "What is their job?";
        
        System.out.println(line1);
        name = scanner.nextLine();
        System.out.println(line2);
        job = scanner.nextLine();
        line3 = "Here is the story:\nOnce upon a time there was " + name + ", who was " + job + ".\nOn the way to work, " + name + " reflected on life.\nPerhaps " + name + " will not be " + job + " forever.";
        System.out.println(line3);
        
        scanner.close();
    }
}