import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Bluechip extends JPanel {
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label1 = new JLabel("Let's decide on what");
    JLabel label2 = new JLabel(" to watch!");
    JLabel label3 = new JLabel("Name:");
    JTextField label4 = new JTextField("");
    JButton button = new JButton("");
    JButton button1 = new JButton("");
    ImageIcon img = new ImageIcon("Logistics/next.png");
    Image image;
    private Window app;

    public Bluechip(Window app1) {
        app = app1;
        setLayout(null);
        setSize(680, 680);
        setBounds(0, 0, 700, 670);
        setBackground(new Color(33,158,188));
        setBorder(BorderFactory. createLineBorder(Color.WHITE,15));
        label.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        label.setForeground(Color.WHITE);
        label.setSize(700, 100);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        label0.setFont(new Font("Bookman Old Style", Font.BOLD, 50));
        label0.setForeground(Color.black);
        label0.setSize(700, 110);
        label0.setHorizontalAlignment(JLabel.CENTER);
        add(label0);
        label1.setFont(new Font("Book Antiqua", Font.BOLD, 27));
        label1.setForeground(Color.black);
        label1.setSize(700, 400);
        label1.setHorizontalAlignment(JLabel.CENTER);
        add(label1);
        label2.setFont(new Font("Book Antiqua", Font.BOLD, 27));
        label2.setForeground(Color.black);
        label2.setSize(700, 500);
        label2.setHorizontalAlignment(JLabel.CENTER);
        add(label2);
        label3.setFont(new Font("Bell MT", Font.BOLD, 21));
        label3.setForeground(Color.white);
        label3.setSize(700, 850);
        label3.setHorizontalAlignment(JLabel.CENTER);
        add(label3);
        label4.setBounds(270, 450, 170, 30);
        label4.setFont(new Font("Arial Rounded MT", Font.PLAIN, 21));
        label4.setForeground(Color.black);
        add(label4);
        button.setBounds(578, 568, 92, 72);
        button.setIcon(img);
        button.setBackground(new Color(33,158,188));
        button.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(label4.getText().isEmpty()) {
                    label4.setBorder(BorderFactory. createLineBorder(Color.RED,3));
                } else {
                    app.page1Click(label4.getText());
                    label4.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
                }
            }
        });
    }
}
 