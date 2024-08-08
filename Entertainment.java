import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.net.URL;

public class Entertainment extends JPanel{
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JButton button = new JButton("");
    JButton button1 = new JButton("");
    ImageIcon img1 = new ImageIcon("Logistics/close.png");
    Image image;

    private Window app;
    private String imageurl;

    public Entertainment(Window app1, String url, String name) {
        app = app1;
        imageurl = url;
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
        label1.setText(name + " enjoy our entertainment!");
        label1.setFont(new Font("Book Antiqua", Font.BOLD, 27));
        label1.setForeground(Color.black);
        label1.setSize(700, 220);
        label1.setHorizontalAlignment(JLabel.CENTER);
        add(label1);
        label2.setText("Thank You for your time today!");
        label2.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        label2.setForeground(Color.black);
        label2.setSize(700, 1200);
        label2.setHorizontalAlignment(JLabel.CENTER);
        add(label2);
        try {
            URL url1 = new URL(imageurl);
            image = ImageIO.read(url1.openStream());
            image = image.getScaledInstance(370, 370,  java.awt.Image.SCALE_SMOOTH);
        } catch (IOException f) {
            f.printStackTrace();
        } 
        button.setBounds(170, 170, 370, 370);
        button.setIcon(new ImageIcon(image));
        add(button);
        button1.setBounds(615, 25, 60, 60);
        button1.setIcon(img1);
        button1.setBackground(new Color(33,158,188));
        button1.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button1);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}