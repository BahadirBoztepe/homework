import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bir string giriniz: ");
        String ifade = scanner.nextLine();


        Map<Character, Integer> karakterSayilari = new HashMap<>();
        for (char karakter : ifade.toCharArray()) {
            if (karakterSayilari.containsKey(karakter)) {
                int sayi = karakterSayilari.get(karakter);
                karakterSayilari.put(karakter, sayi + 1);
            } else {
                karakterSayilari.put(karakter, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : karakterSayilari.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
