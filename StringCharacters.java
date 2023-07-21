public class StringCharacters {
    public static void main(String args[]) {
        String text = "To be or not to be, that is the question;"
                + "Whether this nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;
        String textlc = text.toLowerCase();
        // System.out.println(textlc);

        for (int i = 0; i < textlc.length(); i++) {
            if (textlc.charAt(i) == ' ') {
                spaces++;
            }

            else if (textlc.charAt(i) == 'a' || textlc.charAt(i) == 'e'
                    || textlc.charAt(i) == 'i' || textlc.charAt(i) == 'o'
                    || textlc.charAt(i) == 'u') {
                vowels++;
            }

            else if (textlc.charAt(i) >= 'a' && textlc.charAt(i) <= 'z') {
                letters++;
            }
        }
        System.out.println("Consonants in Text:- " + letters);
        System.out.println("Vowels in Text:- " + vowels);
        System.out.println("Spaces in Text:- " + spaces);
    }
}