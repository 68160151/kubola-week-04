import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab04_7 {

    static int n1, n2, ans;
    static char op;
    static int count = 0;
    static int score = 0;

    public static void main(String[] args) {

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 550, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 224, 255));

        JLabel lbQ = new JLabel("");
        lbQ.setFont(new Font("Serif", Font.PLAIN, 40));
        panel.add(lbQ);

        JTextField txtAns = new JTextField(5);
        txtAns.setFont(new Font("Serif", Font.PLAIN, 30));
        panel.add(txtAns);

        JButton btn = new JButton("Check");
        panel.add(btn);

        JLabel lbResult = new JLabel("");
        lbResult.setFont(new Font("Serif", Font.BOLD, 25));
        panel.add(lbResult);

        JLabel lbScore = new JLabel("");
        lbScore.setFont(new Font("Serif", Font.BOLD, 25));
        panel.add(lbScore);

        newQuestion(lbQ);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int userAns = Integer.parseInt(txtAns.getText());

                if (userAns == ans) {
                    score++;
                    lbResult.setText("Correct!");
                } else {
                    lbResult.setText("Wrong!");
                }

                count++;
                txtAns.setText("");

                if (count < 10) {
                    newQuestion(lbQ);
                } else {
                    lbQ.setText("Finish!");
                    lbResult.setText("");
                    lbScore.setText("Score = " + score + " / 10");
                    btn.setEnabled(false);
                }
            }
        });

        win.add(panel);
        win.setVisible(true);
    }

    static void newQuestion(JLabel lbQ) {
        n1 = (int)(Math.random() * 10);
        n2 = (int)(Math.random() * 10);
        int opRand = (int)(Math.random() * 3);

        if (opRand == 0) {
            op = '+';
            ans = n1 + n2;
        } else if (opRand == 1) {
            op = '-';
            ans = n1 - n2;
        } else {
            op = '*';
            ans = n1 * n2;
        }

        lbQ.setText(n1 + " " + op + " " + n2 + " = ");
    }
}
