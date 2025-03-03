package behavioralpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor =new Editor();
        editor.write("hel", false);
        editor.write("hello wo", false);
        editor.write("hello world !", true);
        editor.undo();

        editor.undo();
        editor.undo();

  
    }
}
