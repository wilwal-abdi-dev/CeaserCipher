import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        boolean theAppIsRunning = true;
        while (theAppIsRunning) {
            // user to pick option
            Scanner option = new Scanner(System.in);
            System.out.println("Welcome to Ceaser Cipher App : Encrypt , Decrypt or Leave");


            String choice = option.nextLine();

            if (choice.equals("Encrypt")) {
                // enter text
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a word ");
                String plainText = input.nextLine();
                System.out.println("Original plain text : " + plainText);

                // enter shift key or number
                Scanner inputKey = new Scanner(System.in);
                System.out.println("Your shift key is : ");
                int key = Integer.parseInt((inputKey.nextLine()));
                System.out.println("Your shift key is : " + key);

                // Output encoded t
                System.out.println("Your cipher text is : " + Encrypt.encrypting((plainText) , key));
            } else if (choice.equals("Decrypt")){
                // Types in the coded texts
                Scanner cipherInput =  new Scanner(System.in);
                System.out.println("Enter the coded text : ");
                String cipherText = cipherInput.nextLine();
                System.out.println("The original plain text is : " + cipherText);

                // Enter shift key or number
                Scanner cipherInPut = new Scanner(System.in);
                System.out.println("What is your shift key : ");
                int shift = Integer.parseInt((cipherInPut.nextLine()));
                System.out.println("The shift key is : " + shift);

                // OutPut Encoded text
                System.out.println("The plain text is : " + Decrypt.decrypting((cipherText), shift));

            } else if (choice.equals("Leave")) {
                System.out.println("Goodbye , thank you .");
                theAppIsRunning = false;
            } else {
                System.out.println("Invalid choice please try again !");
            }

        }
    }
}


