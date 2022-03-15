import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Mechanics extends JObjects {
    Mechanics() {
        mainFrame.setLayout(null);
        mainFrame.setSize(410, 460);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
    void mainMechanic() {
        mainFrame.add(buttonStart);
        buttonStart.setBounds(100, 200, 200, 60);
        buttonStart.setFont(fontForButtons);
        buttonStart.addActionListener(new StartGame());

        mainFrame.add(buttonExit);
        buttonExit.setBounds(25, 300, 350, 60);
        buttonExit.setFont(fontForButtons);
        buttonExit.addActionListener(new Exit());

        mainFrame.add(labelWelcome);
        labelWelcome.setFont(fontForLabelWelcome);
        labelWelcome.setBounds(55, 25,350,70);
        mainFrame.repaint();
    }
    private void startGame() {
        mainFrame.add(buttonGameExit);
        buttonGameExit.setBounds(260, 402, 137,20);
        buttonGameExit.addActionListener(new GameExit());
        mainFrame.add(buttonBreakButtons);
        buttonBreakButtons.setBounds(0, 402, 140,20);
        buttonBreakButtons.addActionListener(new BreakButtons());
        arrayListForButtons.add(button1);
        arrayListForButtons.add(button2);
        arrayListForButtons.add(button3);
        arrayListForButtons.add(button4);
        arrayListForButtons.add(button5);
        arrayListForButtons.add(button6);
        arrayListForButtons.add(button7);
        arrayListForButtons.add(button8);
        arrayListForButtons.add(button9);
        arrayListForButtons.add(button10);
        arrayListForButtons.add(button11);
        arrayListForButtons.add(button12);
        arrayListForButtons.add(button13);
        arrayListForButtons.add(button14);
        arrayListForButtons.add(button15);
        int n = 0;
        int h = 0;
        for (JButton button : arrayListForButtons) {
            button.setFont(fontForButtons);
            mainFrame.add(button);
            button.setBounds(n, h, 100,100);
            n += 100;
            if (n == 400) {
                if (h == 200) {
                    n = 0;
                    h = 300;
                } else if (h == 100) {
                    n = 0;
                    h = 200;
                } else if (h == 0) {
                    n = 0;
                    h = 100;
                }
            }
        }
        button1.addActionListener(new Move1());
        button2.addActionListener(new Move2());
        button3.addActionListener(new Move3());
        button4.addActionListener(new Move4());
        button5.addActionListener(new Move5());
        button6.addActionListener(new Move6());
        button7.addActionListener(new Move7());
        button8.addActionListener(new Move8());
        button9.addActionListener(new Move9());
        button10.addActionListener(new Move10());
        button11.addActionListener(new Move11());
        button12.addActionListener(new Move12());
        button13.addActionListener(new Move13());
        button14.addActionListener(new Move14());
        button15.addActionListener(new Move15());
        mainFrame.repaint();
    }

    private class StartGame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainFrame.remove(buttonStart);
            mainFrame.remove(buttonExit);
            mainFrame.remove(labelWelcome);
            startGame();
        }
    }
    private class Exit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Вы успешно вышли из приложения.");
            System.exit(0);
        }
    }
    private class GameExit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Вы успешно вышли из приложения.");
            System.exit(0);
        }
    }
    private class BreakButtons implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            isTrueGame = false;
            int w = 0;
            while (w < 1000) {
                int rand = (int) (Math.random() * 15);
                move(arrayListForButtons.get(rand));
                w++;
            }
            isTrueGame = true;
        }
    }
    private class Move1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button1);
        }
    }
    private class Move2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button2);
        }
    }
    private class Move3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button3);
        }
    }
    private class Move4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button4);
        }
    }
    private class Move5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button5);
        }
    }
    private class Move6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button6);
        }
    }
    private class Move7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button7);
        }
    }
    private class Move8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button8);
        }
    }
    private class Move9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button9);
        }
    }
    private class Move10 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button10);
        }
    }
    private class Move11 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button11);
        }
    }
    private class Move12 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button12);
        }
    }
    private class Move13 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button13);
        }
    }
    private class Move14 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button14);
        }
    }
    private class Move15 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button15);
        }
    }
    private void move(JButton button) {
        if (xEmpty - 100 == button.getX() && yEmpty == button.getY()) {
            button.setBounds(button.getX() + 100, button.getY(), 100,100);
            xEmpty -= 100;
        } else if (xEmpty + 100 == button.getX() && yEmpty == button.getY()) {
            button.setBounds(button.getX() - 100, button.getY(), 100,100);
            xEmpty += 100;
        } else if (yEmpty - 100 == button.getY() && xEmpty == button.getX()) {
            button.setBounds(button.getX(), button.getY() + 100, 100,100);
            yEmpty -= 100;
        } else if (yEmpty + 100 == button.getY() && xEmpty == button.getX()) {
            button.setBounds(button.getX(), button.getY() - 100, 100,100);
            yEmpty += 100;
        }
        if (button1.getX() == 0 && button1.getY() == 0 &&
                button2.getX() == 100 && button2.getY() == 0 &&
                button3.getX() == 200 && button3.getY() == 0 &&
                button4.getX() == 300 && button4.getY() == 0 &&
                button5.getX() == 0 && button5.getY() == 100 &&
                button6.getX() == 100 && button6.getY() == 100 &&
                button7.getX() == 200 && button7.getY() == 100 &&
                button8.getX() == 300 && button8.getY() == 100 &&
                button9.getX() == 0 && button9.getY() == 200 &&
                button10.getX() == 100 && button10.getY() == 200 &&
                button11.getX() == 200 && button11.getY() == 200 &&
                button12.getX() == 300 && button12.getY() == 200 &&
                button13.getX() == 0 && button13.getY() == 300 &&
                button14.getX() == 100 && button14.getY() == 300 &&
                button15.getX() == 200 && button15.getY() == 300 && isTrueGame) {
            for (JButton buttonF : arrayListForButtons) {
                mainFrame.remove(buttonF);
            }
            mainFrame.remove(buttonBreakButtons);
            mainFrame.remove(buttonGameExit);
            mainFrame.add(buttonExit);
            mainFrame.add(labelVictory);
            labelVictory.setFont(fontForLabelVictory);
            labelVictory.setBounds(70, 80,350,70);
            mainFrame.repaint();
        }
    }
}
