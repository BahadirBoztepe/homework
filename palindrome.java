import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String giriniz");
        String ifade = input.nextLine();

        boolean palindrome = true ;

        String tersCevirme = "";
        for (int i = ifade.length() - 1; i >= 0; i--) {
            tersCevirme += ifade.charAt(i);
        }

        for (int i = 0; i < ifade.length(); i++) {
            if (ifade.charAt(i) != tersCevirme.charAt(i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(ifade + " palindromdur.");
        } else {
            System.out.println(ifade + " palindrom değildir.");
        }
    }
}

