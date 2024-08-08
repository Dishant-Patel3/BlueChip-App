import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel{
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label1 = new JLabel("");
    JLabel label2 = new JLabel("");
    JLabel label3 = new JLabel("");
    JLabel label4 = new JLabel("");
    JButton button = new JButton("");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    ImageIcon img = new ImageIcon("Logistics/change.png");
    ImageIcon img1 = new ImageIcon("Logistics/find.png");
    ImageIcon img2 = new ImageIcon("Logistics/home.png");

    private Window app;
    private int mood;

    public Home(Window app1, int mood, String name) {
        app = app1;
        this.mood = mood;
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
        label4.setText(name); 
        label4.setFont(new Font("Book Antiqua", Font.BOLD, 27));
        label4.setForeground(Color.black);
        label4.setSize(700, 300);
        label4.setHorizontalAlignment(JLabel.CENTER);
        add(label4);
        setMood();
        button1.setBounds(390, 400, 170, 120);
        button1.setIcon(img1);
        button1.setBackground(new Color(33,158,188));
        button1.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button2.setBounds(615, 25, 60, 60);
        button2.setIcon(img2);
        button2.setBackground(new Color(33,158,188));
        button2.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button.setBounds(150, 400, 170, 120);
        button.setIcon(img);
        button.setBackground(new Color(33,158,188));
        button.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button);
        add(button1);
        add(button2);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.pageClick();
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page7Click();
            }
        });
    }

    public void setMood(){
        if(mood == 1) {
            label1.setText("We hope our entertainment can");
            label1.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label1.setForeground(Color.black);
            label1.setSize(700, 400);
            label1.setHorizontalAlignment(JLabel.CENTER);
            add(label1);
            label2.setText("continue to make your day amazing");
            label2.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label2.setForeground(Color.black);
            label2.setSize(700, 500);
            label2.setHorizontalAlignment(JLabel.CENTER);
            add(label2);
        } else if(mood == 2) {
            label1.setText("We hope our entertainment can");
            label1.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label1.setForeground(Color.black);
            label1.setSize(700, 400);
            label1.setHorizontalAlignment(JLabel.CENTER);
            add(label1);
            label2.setText("finish off your day on a strong feeling");
            label2.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label2.setForeground(Color.black);
            label2.setSize(700, 500);
            label2.setHorizontalAlignment(JLabel.CENTER);
            add(label2);
        } else if(mood == 3) {
            label1.setText("We hope our entertainment can");
            label1.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label1.setForeground(Color.black);
            label1.setSize(700, 400);
            label1.setHorizontalAlignment(JLabel.CENTER);
            add(label1);
            label2.setText("add some happiness in your day"); 
            label2.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label2.setForeground(Color.black);
            label2.setSize(700, 500);
            label2.setHorizontalAlignment(JLabel.CENTER);
            add(label2);
        } else if(mood == 4) {
            label1.setText("We hope our entertainment can");
            label1.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label1.setForeground(Color.black);
            label1.setSize(700, 400);
            label1.setHorizontalAlignment(JLabel.CENTER);
            add(label1);
            label2.setText("lighten up your average day");
            label2.setFont(new Font("Book Antiqua", Font.BOLD, 27));
            label2.setForeground(Color.black);
            label2.setSize(700, 500);
            label2.setHorizontalAlignment(JLabel.CENTER);
            add(label2);
        }
    }

    
}