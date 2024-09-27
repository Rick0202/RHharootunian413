import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
// This program will determine if a letter entered is a vowel or a consonant.
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a letter and the program will tell you if the letter is a vowel or a consonant: ");
    char ch = scanner.next().charAt(0);
    
// Establishing a vowel and consonant Strings so the letter being entered can be compared to the vowel and consonant Strings.
    
    String vowels = "aeiouAEIOU";
    String consonant = "abcdfghjklmnpqrstvwxyzABCDFGHJKLMNPQRSTVWXYZ";
    
// Three if statements to determine if the letter is a vowel, consonant, or neither.
    
    if (vowels.contains(String.valueOf(ch))) {
        System.out.println("\n" + ch + " is a vowel.");
    } else if (consonant.contains(String.valueOf(ch))){
        System.out.println("\n" + ch + " is a consonant.");
    }else 
      System.out.println("\nYou entered an invalid charter. Try again and enter a letter.\n");
    {
      
    }
   
  }
}