import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

class Log{
  public ArrayList<Character> keyPressed(KeyEvent e){
    char letter = e.getKeyChar();
    ArrayList<Character> words = new ArrayList<Character>();
    words.add(letter);
    return words;
  }
}

class KeyLoggerJava {
  public static void main(String args[]){
    Log myLog = new Log();
    ArrayList<Character> word = myLog.words;
    System.out.println(word);
  }
}
