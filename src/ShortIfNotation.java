public class ShortIfNotation {
    public static void main(String[] args) {
        String someExampleText = "hello!";

        boolean endsWithInrerjection = someExampleText.endsWith("!");

        // warunek logiczny ? sekcja gdy true : sekcja gdy false;

        String message = someExampleText.length() >= 5 ?
                "wieksze niz 5" : "mniejsze niz 5";

        int lengthOfString = someExampleText.length();
    }
}
