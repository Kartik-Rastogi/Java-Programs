import javax.swing.*;
import java.sql.*;

public class StudentForm extends JFrame {
    private JButton addButton;
    private JButton modifyButton;
    private JTextField textField1;
    private JTextField textField5;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField6;
    private JButton searchButton;
    private JPanel mainPanel;

    String sid, sname, address, mob, email;
    private final String url = "oracle.jdbc.driver.OracleDriver";
    private final String user = "root";
    private final String password = "lucifer_9717";
    PreparedStatement statement = null;

    private void connect() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to PostgreSQL server successfully!");
            } else {
                System.out.println("Failed to connect PostgreSQL server");
            }

            addButton.addActionListener(v -> {
                if (textField1.getText().equals("") || textField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Empty Field Detected!",
                            "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                sid = textField1.getText().trim();
                sname = textField2.getText().trim();
                address = textField3.getText().trim();
                mob = textField4.getText().trim();
                email = textField5.getText().trim();

                try {
                    assert connection != null;
                    statement = connection.prepareStatement("select sid from Student where sid=(?)");
                    statement.setInt(1, Integer.parseInt(sid));
                    ResultSet rs = statement.executeQuery();

                    if (!rs.next()) {
                        statement = connection.prepareStatement("insert into Student values(?,?,?,?,?)");

                        statement.setInt(1, Integer.parseInt(sid));
                        statement.setString(2, sname);
                        statement.setString(3, address);
                        statement.setString(4, mob);
                        statement.setString(5, email);

                        int i = statement.executeUpdate();
                        System.out.println(i + " records inserted");
                    } else {
                        JOptionPane.showMessageDialog(this, "Details Already Available!",
                                "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });

            modifyButton.addActionListener(v -> {
                if (textField1.getText().equals("") || textField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Empty Field Detected!",
                            "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                sid = textField1.getText().trim();
                sname = textField2.getText().trim();
                address = textField3.getText().trim();
                mob = textField4.getText().trim();
                email = textField5.getText().trim();

                try {
                    assert connection != null;
                    statement = connection.prepareStatement("select sid from Student where sid=(?)");
                    statement.setInt(1, Integer.parseInt(sid));
                    int tempSid = Integer.parseInt(sid);
                    ResultSet rs = statement.executeQuery();

                    if (rs.next()) {
                        statement = connection.prepareStatement("UPDATE Student SET sid=(?), sname=(?), address=(?)," +
                                " mob_no=(?), email=(?) where sid =(?)");

                        statement.setInt(1, Integer.parseInt(sid));
                        statement.setString(2, sname);
                        statement.setString(3, address);
                        statement.setString(4, mob);
                        statement.setString(5, email);
                        statement.setInt(6, tempSid);

                        int i = statement.executeUpdate();
                        System.out.println(i + " records Updated!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Details Not Available, Please Add First!",
                                "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });

            searchButton.addActionListener(v -> {
                if (textField6.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Empty Field Detected!",
                            "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                sid = textField6.getText().trim();
                try {
                    assert connection != null;
                    statement = connection.prepareStatement("select * from Student where sid=(?)");
                    statement.setInt(1, Integer.parseInt(sid));
                    ResultSet rs = statement.executeQuery();
                    boolean temp = true;
                    while (rs.next()) {
                        temp = false;
                        System.out.println(rs.getInt(1) + " " + rs.getString(2));

                        JFrame frame = new JFrame("Swing Tester");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        JPanel panel = new JPanel();
                        panel.setLayout(null);

                        JLabel label1 = new JLabel();
                        label1.setBounds(0, 0, 200, 20);
                        label1.setText("ID: " + rs.getInt(1));

                        JLabel label2 = new JLabel();
                        label2.setBounds(0, 20, 200, 20);
                        label2.setText("Name: " + rs.getString(2));

                        JLabel label3 = new JLabel();
                        label3.setBounds(0, 40, 200, 20);
                        label3.setText("Address: " + rs.getString(3));

                        JLabel label4 = new JLabel();
                        label4.setBounds(0, 60, 200, 20);
                        label4.setText("Mobile: " + rs.getString(4));

                        JLabel label5 = new JLabel();
                        label5.setBounds(0, 80, 200, 20);
                        label5.setText("Email: " + rs.getString(5));

                        frame.add(label1);
                        frame.add(label2);
                        frame.add(label3);
                        frame.add(label4);
                        frame.add(label5);
                        frame.setTitle("Student Details");
                        frame.setSize(400, 220);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                    }

                    if (temp) {
                        JOptionPane.showMessageDialog(this, "Details Not Available!",
                                "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    StudentForm() {
        setContentPane(mainPanel);
        setTitle("Student Form");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        connect();
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
