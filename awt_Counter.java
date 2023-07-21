import java.awt.*;
import java.awt.event.*;

public class awt_Counter extends Frame implements ActionListener {
    private Label lblCount; // Declare component Label
    private TextField tfCount; // Declare component TextField
    private Button btnCount; // Declare component Button
    private int count = 0; // counter's value

    // Constructor to setup UI components and event handlers
    public awt_Counter() {
        setLayout(new FlowLayout());
        // "super" Frame sets layout to FlowLayout, which arranges
        // Components from left-to-right, then top-to-bottom.

        lblCount = new Label("Counter"); // Construct component Label
        add(lblCount); // "super" Frame adds Label

        tfCount = new TextField(count + "", 20); // Construct component TextField
        tfCount.setEditable(false); // read-only
        add(tfCount); // "super" Frame adds TextField

        btnCount = new Button("Count"); // Construct component Button
        add(btnCount); // "super" Frame adds Button
        btnCount.addActionListener(this);
        // btnCount is the source object that fires ActionEvent when clicked.
        // The source add "this" instance as an ActionEvent listener, which provides
        // an ActionEvent handler called actionPerformed().
        // Clicking btnCount invokes actionPerformed().

        setSize(350, 100); // "super" Frame sets initial size
        setTitle("AWT Counter"); // "super" Frame sets title
        setVisible(true); // show "super" Frame
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // ActionEvent handler - Called back when the button is clicked.
    public void actionPerformed(ActionEvent evt) {
        count++; // Incrase the counter value
        tfCount.setText(count + ""); // Display on the TextField
        // setText() takes a String
    }

    // The entry main() method
    public static void main(String[] args) {
        // Invoke the constructor by allocating an anonymous instance
        new awt_Counter();
    }
}