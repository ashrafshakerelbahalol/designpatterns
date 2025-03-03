package behavioralpatterns.memento;

public class TextArea {
    private String text;
    private boolean bold;

    public String getText() {
        return text;
    }

    public boolean isBold() {
        return bold;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
        this.bold = memento.getBold();

    }

    public Memento takeSnapShot() {
        return new Memento(this.text, this.bold);
    }

    public static class Memento {
        private  String text;
        private  boolean bold;

        private Memento(String text, boolean bold) {
            this.text = text;
            this.bold = bold;
        }

        private String getSavedText() {
            return text;
        }

        private boolean getBold() {
            return bold;
        }
    }

}
