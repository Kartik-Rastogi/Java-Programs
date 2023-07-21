import java.awt.*;
import java.awt.event.*;

public class GP3_AwtForm extends Frame implements ActionListener {

    TextField firstNameTF;
    TextField lastNameTF;
    TextField dobTF;

    GP3_AwtForm() {

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setTitle("AWT Form");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Label firstName = new Label("First Name");
        firstName.setBounds(20, 50, 80, 20);

        Label lastName = new Label("Last Name");
        lastName.setBounds(20, 80, 80, 20);

        Label dob = new Label("Date of Birth");
        dob.setBounds(20, 110, 80, 20);

        firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 160, 80, 30);
        sbmt.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String fnString = firstNameTF.getText();
                        String lnString = lastNameTF.getText();
                        String dobString = dobTF.getText();
                        GP3_AwtForm awt2 = new GP3_AwtForm(fnString, lnString, dobString);
                    }
                });

        Button reset = new Button("Reset");
        reset.setBounds(140, 160, 80, 30);
        reset.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        firstNameTF.setText(null);
                        lastNameTF.setText(null);
                        dobTF.setText(null);
                    }
                });

        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);

    }

    GP3_AwtForm(String fnString, String lnString, String dobString) {

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setTitle("AWT Form Display");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Label displayFirst = new Label("First Name: ");
        displayFirst.setBounds(20, 50, 80, 20);

        Label displayFName = new Label(fnString);
        displayFName.setBounds(100, 50, 80, 20);

        Label displayLast = new Label("Last Name: ");
        displayLast.setBounds(20, 80, 80, 20);

        Label displayLName = new Label(lnString);
        displayLName.setBounds(100, 80, 80, 20);

        Label displayDob = new Label("Date of Birth: ");
        displayDob.setBounds(20, 110, 80, 20);

        Label displayDobS = new Label(dobString);
        displayDobS.setBounds(100, 110, 80, 20);

        add(displayFirst);
        add(displayFName);
        add(displayLast);
        add(displayLName);
        add(displayDob);
        add(displayDobS);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) {
        GP3_AwtForm awt = new GP3_AwtForm();
    }
}
