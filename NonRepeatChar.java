public class NonRepeatChar {
    public static void main(String[] args) {
        String ifade = "Bahadır";

        boolean[] karakterler = new boolean[256];
        for (int i = 0; i < karakterler.length; i++) {
            karakterler[i] = false;
        }
        for (int i = 0; i < ifade.length(); i++) {

            char karakter = ifade.charAt(i);

            if (!karakterler[karakter]) {
                System.out.println("tekrar etmeyen ilk karakter " + karakter);

                karakterler[karakter]=true;

                break;
            }

        }
    }
}
