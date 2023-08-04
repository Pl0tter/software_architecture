package Memento;

import java.util.ArrayList;
import java.util.UUID;

public class Memento000 {
    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        document.change("first");
        document.saveTo();
        document.change("second");
        document.saveTo();
        document.change("third");
        document.change("fourth");
        document.saveTo();

        System.out.println(">>> " + document);
        document.restoreState(1);
        System.out.println(">>> " + document);
        document.restoreState(0);
        System.out.println(">>> " + document);
        document.restoreState(2);
        System.out.println(">>> " + document);
    }

}

class TextDocument {
    private class Memento {
        private final String textState;
        private final int pagesState;

        public Memento(String text, int pages) {
            textState = text;
            pagesState = pages;
        }

        public String getTextState() {
            return textState;
        }

        public int getPagesState() {
            return pagesState;
        }
    }

    private ArrayList<Memento> mementos = new ArrayList<>();
    private final StringBuilder text;
    private int pages;

    public TextDocument() {
        text = new StringBuilder();
    }

    public String getText() {
        return this.text.toString();
    }

    public int getPages() {
        return pages;
    }

    public void change(String s) {
        if (s == null || s.equals(""))
            s = UUID.randomUUID().toString();
        text.append(s + " ");
    }

    public void saveTo() {
        Memento m = new Memento(this.getText(), this.pages);
        mementos.add(m);
    }

    public void restoreState(int index) {
        Memento state = mementos.get(index);
        this.pages = state.getPagesState();
        this.text.setLength(0);
        this.text.append(state.getTextState());
    }

    @Override
    public String toString() {
        return getText();
    }
}
