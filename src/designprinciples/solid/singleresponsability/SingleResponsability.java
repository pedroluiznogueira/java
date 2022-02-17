package designprinciples.solid.singleresponsability;

public class SingleResponsability {

    /**
     * - a class should have only one reason to change
     * - like the Date class for data related features only
     * - a feeling of "and"
     *
     * business rule
     * - we have a class TextManipulator that have two concerns
     * and responsabilities
     * - 1. manipulating the text and 2. printing the text
     *
     * - we should be careful to avoid overthinking
     * - following the SRP principle, our class will adhere to
     * one functionality, so their methods and data will be
     * concerned with one clear purpose
     * - this means high cohesion
     * - we should avoid breaking up stuff that we might think it
     * is a responsability
     * - for example:
     * - WriteText and UpdateText wouldn't follow the SRP principle
     * since they together are two tightly coupled, will probably
     * be always used together
     * - these methods may perform different operations, but they
     * serve only one single purpose, text manipulation
     *
    */
    public static void main(String[] args) {

    }
}

class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    public void printText() {
        System.out.println(text);
    }
}

class TextPrinter {
    TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(textManipulator.getText());
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}