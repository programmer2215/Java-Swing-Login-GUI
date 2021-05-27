import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JTextField user_text;
    private static JPasswordField pass_text;
    private static JLabel success_text;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button = new JButton("LOGIN");
        button.setBounds(10, 90, 80, 30);
        button.addActionListener(new GUI());

        JLabel label_user = new JLabel("USER:");
        JLabel label_pass = new JLabel("PASS:");
        label_user.setBounds(10, 20, 80, 25);
        label_pass.setBounds(10, 50, 80, 25);

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("My GUI");
        frame.add(panel);
        panel.setLayout(null);
        panel.add(label_user);
        panel.add(label_pass);
        panel.add(button);

        user_text = new JTextField();
        user_text.setBounds(100, 20, 165, 25);
        panel.add(user_text);

        pass_text = new JPasswordField();
        pass_text.setBounds(100, 50, 165, 25);
        panel.add(pass_text);

        success_text = new JLabel("");
        success_text.setBounds(10, 130, 400, 20);
        panel.add(success_text);



        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user_inp = user_text.getText();
        String user_default = "Mark Madhukar";
        String pass_inp = String.valueOf(pass_text.getPassword());
        String pass_default = "password";

        if (user_inp.equals(user_default) && pass_inp.equals(pass_default)){
            success_text.setText("| ACCESS GRANTED |");
            System.out.println("| ACCESS GRANTED |");
            success_text.setForeground(Color.decode("#32a852"));
        }else {
            success_text.setText("| ACCESS DENIED |");
            System.out.println("| ACCESS DENIED |");
            success_text.setForeground(Color.decode("#eb4034"));
        }

    }
}
