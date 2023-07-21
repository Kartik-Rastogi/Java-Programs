import java.awt.*;
import java.awt.event.*;

public class GP4 {
    private static Dialog d;
    private static int c;

    GP4(String str) {

        Frame f = new Frame();
        f.setVisible(false);
        d = new Dialog(f, "Message Box", false);
        d.setLayout(new FlowLayout());
        d.setSize(400, 150);
        d.setVisible(true);
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");
        TextField message = new TextField();
        message.setText(str);

        d.add(message);
        d.add(ok);
        d.add(cancel);

        ok.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Frame s = new Frame();
                        s.setSize(300, 300);
                        s.setLayout(null);
                        s.setVisible(true);
                        s.setTitle("Message Display");
                        Label lbl = new Label("User Pressed Okay. Message:-");
                        lbl.setBounds(20, 80, 500, 30);
                        s.add(lbl);
                        Label display = new Label(message.getText());
                        display.setBounds(20, 120, 100, 30);
                        s.add(display);
                        s.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent e) {
                                s.dispose();
                            }
                        });
                    }
                });

        cancel.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("User Pressed CANCEL Button");
                        System.out.println("GUI Closed");
                        d.dispose();
                        f.dispose();
                    }
                });

    }

    public static void main(String args[]) {
        new GP4("Hello");
        if (c == 1) {

        }
    }
}
