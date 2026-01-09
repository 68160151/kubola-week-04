import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab04_1 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("Hello Chin Nobpharut Srisangthong 68160151 n2");
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());

        JLabel label1 = new JLabel();
        label1.setText("Enter name");
        f.add(label1);

        JTextField namebox = new JTextField(5);
        f.add(namebox);

        JButton b1 = new JButton();
        b1.setText("send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = namebox.getText();
                JOptionPane.showMessageDialog(null, "hello " + str);
            }
        });

        f.add(b1);

        f.setVisible(true);
    }
}
