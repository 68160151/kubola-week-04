import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab04_8 {
    public static void main(String[] args) {

        JFrame win = new JFrame("BMI Calculator");
        win.setBounds(100, 100, 450, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(204, 255, 204));
        panel.setLayout(null);

        JLabel title = new JLabel("BMI Calculator Program");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setBounds(90, 10, 300, 30);
        panel.add(title);

        JLabel lbWeight = new JLabel("Weight (kg):");
        lbWeight.setFont(new Font("Serif", Font.PLAIN, 18));
        lbWeight.setBounds(50, 60, 120, 30);
        panel.add(lbWeight);

        JTextField txtWeight = new JTextField();
        txtWeight.setBounds(180, 60, 150, 30);
        panel.add(txtWeight);

        JLabel lbHeight = new JLabel("Height (cm):");
        lbHeight.setFont(new Font("Serif", Font.PLAIN, 18));
        lbHeight.setBounds(50, 100, 120, 30);
        panel.add(lbHeight);

        JTextField txtHeight = new JTextField();
        txtHeight.setBounds(180, 100, 150, 30);
        panel.add(txtHeight);

        JButton btn = new JButton("Calculate BMI");
        btn.setBounds(150, 140, 150, 35);
        panel.add(btn);

        JLabel lbBMI = new JLabel("BMI = ");
        lbBMI.setFont(new Font("Serif", Font.PLAIN, 18));
        lbBMI.setBounds(50, 190, 300, 30);
        panel.add(lbBMI);

        JLabel lbResult = new JLabel("Result: ");
        lbResult.setFont(new Font("Serif", Font.BOLD, 18));
        lbResult.setBounds(50, 220, 350, 30);
        panel.add(lbResult);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double weight = Double.parseDouble(txtWeight.getText());
                double height = Double.parseDouble(txtHeight.getText()) / 100;

                double bmi = weight / (height * height);
                lbBMI.setText(String.format("BMI = %.2f", bmi));

                if (bmi < 18.5) {
                    lbResult.setText("Result: Underweight");
                } else if (bmi < 23) {
                    lbResult.setText("Result: Normal");
                } else if (bmi < 25) {
                    lbResult.setText("Result: Overweight");
                } else if (bmi < 30) {
                    lbResult.setText("Result: Obese");
                } else {
                    lbResult.setText("Result: Very Obese");
                }
            }
        });

        win.add(panel);
        win.setVisible(true);
    }
}
