import javax.swing.*;
import java.awt.*;

public class messageBox extends Frame {

    messageBox(String str) {
        JFrame frame = new JFrame("MessageBox Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 200, 30);

        String[] options = { "OK", "Cancel" };
        int result = JOptionPane.showOptionDialog(
                frame,
                str,
                "Swing DialogBox",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // no custom icon
                options, // button titles
                options[0] // default button
        );
        if (result == JOptionPane.YES_OPTION) {
            label.setText("Pressed: OK");
        } else if (result == JOptionPane.NO_OPTION) {
            frame.dispose();
            frame.getContentPane().add(null, false);
        } else {
            label.setText("None Pressed!");
        }
        panel.add(label);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new messageBox("Test String!");
    }
}