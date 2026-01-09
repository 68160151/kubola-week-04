import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab04_5 {
    public static void main(String[] args) {

        int n1 = (int)(Math.random() * 10);
        System.out.println(n1);
        int n2 = (int)(Math.random() * 10);
        System.out.println(n2);
        int ans = n1 + n2;

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);

        JPanel subwin = new JPanel();
        subwin.setBackground(new Color(102, 224, 255));

        JLabel label1 = new JLabel("" + n1);
        label1.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label1);

        JLabel label3 = new JLabel(" + ");
        label3.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label3);

        JLabel label2 = new JLabel("" + n2);
        label2.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label2);

        JLabel label4 = new JLabel(" = ");
        label4.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label4);

        JTextField t1 = new JTextField(5);
        t1.setFont(new Font("Serif", Font.PLAIN, 30));
        subwin.add(t1);

        JButton b1 = new JButton("Check");
        subwin.add(b1);

        JLabel label5 = new JLabel("");
        label5.setFont(new Font("Serif", Font.BOLD, 30));
        subwin.add(label5);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userAns = Integer.parseInt(t1.getText());
                if (userAns == ans) {
                    label5.setText("Excellent!");
                } else {
                    label5.setText("Try again");
                }
            }
        });

        win.add(subwin);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
