import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class JObjects {
    boolean isTrueGame = false;
    int xEmpty = 300;
    int yEmpty = 300;

    ArrayList<JButton> arrayListForButtons = new ArrayList<>();
    Font fontForButtons = new Font("", Font.BOLD, 30);
    Font fontForLabelWelcome = new Font("", Font.BOLD, 50);
    Font fontForLabelVictory = new Font("", Font.BOLD, 50);

    JFrame mainFrame = new JFrame("Пятнашки");

    JButton buttonStart = new JButton("Играть");
    JButton buttonExit = new JButton("Выйти из игры");
    JButton buttonGameExit = new JButton("Выйти из игры");
    JButton buttonBreakButtons = new JButton("Перемешать");

    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");
    JButton button11 = new JButton("11");
    JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");
    JButton button14 = new JButton("14");
    JButton button15 = new JButton("15");

    JLabel labelWelcome = new JLabel("Пятнашки");

    JLabel labelVictory = new JLabel("Победа!!!");
}
