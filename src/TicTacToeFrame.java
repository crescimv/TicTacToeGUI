import javax.swing.*;
import java.awt.*;

public class TicTacToeFrame extends JFrame {
    JButton[] buttons = new JButton[9];
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();

    TicTacToeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setTitle("Tic Tac Toe Game");
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        textField.setFont(new Font("Serif",Font.BOLD,50));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic-Tac-Toe");
        titlePanel.setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(3, 3));
        for(int i=0;i<9;i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
        }
        titlePanel.add(textField);
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);
    }
}
