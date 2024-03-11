import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bir string giriniz: ");
        String cumle = scanner.nextLine();


        String[] kelimeler = cumle.split(" ");


        Map<String, Integer> kelimeSayilari = new HashMap<>();
        for (String kelime : kelimeler) {
            if (kelimeSayilari.containsKey(kelime)) {
                int sayi = kelimeSayilari.get(kelime);
                kelimeSayilari.put(kelime, sayi + 1);
            } else {
                kelimeSayilari.put(kelime, 1);
            }
        }


        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
