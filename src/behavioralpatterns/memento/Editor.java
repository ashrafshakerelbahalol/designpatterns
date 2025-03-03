package behavioralpatterns.memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import behavioralpatterns.memento.TextArea.Memento;

public class Editor {
    private Stack <Memento> stateHistory;
    private TextArea textArea;
    public Editor(){
        stateHistory=new Stack();
        textArea = new TextArea();
    }
    public void write(String text,boolean bold){
        textArea.setText(text);
        textArea.setBold(bold);
        stateHistory.add(textArea.takeSnapShot());
    }
    public void undo(){
        textArea.restore(stateHistory.pop());
        System.out.println(textArea.getText()+" "+textArea.isBold());
    }
}
