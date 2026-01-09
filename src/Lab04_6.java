import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab04_6 {
    public static void main(String[] args) {

        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);

        int opRand = (int)(Math.random() * 3); // 0,1,2
        char op;
        int ans;

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

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 224, 255));

        JLabel lb1 = new JLabel("" + n1);
        lb1.setFont(new Font("Serif", Font.PLAIN, 40));
        panel.add(lb1);

        JLabel lbOp = new JLabel(" " + op + " ");
        lbOp.setFont(new Font("Serif", Font.PLAIN, 40));
        panel.add(lbOp);

        JLabel lb2 = new JLabel("" + n2);
        lb2.setFont(new Font("Serif", Font.PLAIN, 40));
        panel.add(lb2);

        JLabel lbEq = new JLabel(" = ");
        lbEq.setFont(new Font("Serif", Font.PLAIN, 40));
        panel.add(lbEq);

        JTextField txtAns = new JTextField(5);
        txtAns.setFont(new Font("Serif", Font.PLAIN, 30));
        panel.add(txtAns);

        JButton btn = new JButton("Check");
        panel.add(btn);

        JLabel lbResult = new JLabel("");
        lbResult.setFont(new Font("Serif", Font.BOLD, 30));
        panel.add(lbResult);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userAns = Integer.parseInt(txtAns.getText());
                if (userAns == ans) {
                    lbResult.setText("Excellent!");
                } else {
                    lbResult.setText("Try again");
                }
            }
        });

        win.add(panel);
        win.setVisible(true);
    }
}
