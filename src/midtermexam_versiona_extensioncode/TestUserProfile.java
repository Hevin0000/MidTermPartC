/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Hevin
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display available genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Available Genres:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Choose your favorite genre (Enter the corresponding number): ");
        int genreChoice = scanner.nextInt();
        
        // Validate genre choice
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice!");
        } else {
            String favoriteGenre = genres[genreChoice - 1];
            
            // Create user profile
            UserProfile userProfile = new UserProfile(name, favoriteGenre);
            
            // Display confirmation message
            System.out.println("User profile created!");
        }
        
        scanner.close();
    }
}

