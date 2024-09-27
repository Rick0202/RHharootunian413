import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  System.out.println("This program will tell you if a letter you entered is a vowel or a consonant.  Enter a letter.\n");  
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a letter and the program will tell you if the letter is a vowel or a consonant: ");
    char ch = scanner.next().charAt(0);

    String vowels = "aeiouAEIOU";
    String consonant = "abcdfghjklmnpqrstvwxyzABCDFGHJKLMNPQRSTVWXYZ";
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