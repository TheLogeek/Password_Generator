import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {
    static Random random = new Random();
    public static void main(String[] args){
        // set variables
        // create password generator method
        // accept user input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of passwords to generate: ");
        int numPasswords = scanner.nextInt();

        System.out.print("Enter length of each password: ");
        int lenPassword = scanner.nextInt();

        System.out.println("\nPASSWORDS: ");
        String[] passwords = passGen(lenPassword,numPasswords);
        printPasswords(passwords);

        scanner.close();
    }
    static String[] passGen(int length, int number){
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C',
        'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0','@','#','£','_','&','-','+','(',')','/','*',':',';','!','?','$','€','¥','^','='};

        String[] passwords = new String[number];

        for(int i = 0; i < number; i++){
            String password = "";
            for(int j = 0; j < length; j++) {
                char letter = alphabets[random.nextInt(alphabets.length)];
                password += letter;
            }
            passwords[i] = password;
        }

        return passwords;
    }
    static void printPasswords(String[] passwords){
        System.out.println(String.join("\n", passwords));
    }
}