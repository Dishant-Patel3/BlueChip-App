import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mood extends JPanel{
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label6 = new JLabel("How are you feeling today?");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    ImageIcon img = new ImageIcon("Logistics/next.png");
    ImageIcon img1 = new ImageIcon("Moods/happy.png");
    ImageIcon img2 = new ImageIcon("Moods/decent.png");
    ImageIcon img3 = new ImageIcon("Moods/mid.png");
    ImageIcon img4 = new ImageIcon("Moods/sad.png");
    JLabel label7 = new JLabel();

    private Window app;
    private String name;

    public Mood(Window app1, String n) {
        app = app1;
        name = n;
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
        label6.setFont(new Font("Book Antiqua", Font.BOLD, 27));
        label6.setBackground(new Color(33,158,188));
        label6.setForeground(Color.black);
        label6.setSize(700, 400);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setVerticalAlignment(JLabel.CENTER);
        add(label6);
        label7.setFont(new Font("Book Antiqua", Font.BOLD, 27));
        label7.setBackground(new Color(33,158,188));
        label7.setForeground(Color.black);
        label7.setText("Hey " + name + "!");
        label7.setSize(700, 300);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setVerticalAlignment(JLabel.CENTER);
        add(label7);
        button1.setBounds(60, 440, 130, 130);
        button1.setIcon(img1);
        button1.setBackground(new Color(33,158,188));
        button1.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button2.setBounds(210, 440, 130, 130);
        button2.setIcon(img2);
        button2.setBackground(new Color(33,158,188));
        button2.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button3.setBounds(350, 440, 130, 130);
        button3.setIcon(img3);
        button3.setBackground(new Color(33,158,188));
        button3.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button4.setBounds(490, 440, 130, 130);
        button4.setIcon(img4);
        button4.setBackground(new Color(33,158,188));
        button4.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page2Click(1);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page2Click(2);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page2Click(3);
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page2Click(4);
            }
        });
    }
}