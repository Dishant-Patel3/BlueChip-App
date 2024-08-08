import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Services extends JPanel implements ActionListener{
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label1 = new JLabel("Select Streaming Services:");
    JLabel label2 = new JLabel("");
    JButton button = new JButton("");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    JButton button5 = new JButton("");
    ImageIcon img = new ImageIcon("Logistics/next.png");
    ImageIcon img1 = new ImageIcon("Services/amazon1.png");
    ImageIcon img2 = new ImageIcon("Services/netflix1.png");
    ImageIcon img3 = new ImageIcon("Services/apple1.png");
    ImageIcon img4 = new ImageIcon("Services/disney1.png");
    ImageIcon img5 = new ImageIcon("Logistics/home.png");

    private Window app;
    private boolean check1, check2, check3, check4;
    private ArrayList<Integer> services;

    public Services(Window app1, int x) {
        app = app1;
        check4 = true;
        check1 = true;
        check2 = true;
        check3 = true;
        services = new ArrayList<Integer>();
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
        label1.setSize(700, 300);
        label1.setHorizontalAlignment(JLabel.CENTER);
        add(label1);
        label2.setBounds(145, 200, 400, 400);
        add(label2);
        button1.setBounds(145, 200, 200, 200);
        button1.setIcon(img1);
        button1.setBackground(new Color(33,158,188));
        button1.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button2.setBounds(345, 200, 200, 200);
        button2.setIcon(img2);
        button2.setBackground(new Color(33,158,188));
        button2.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button3.setBounds(145, 400, 200, 200);
        button3.setIcon(img3);
        button3.setBackground(new Color(33,158,188));
        button3.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button4.setBounds(345, 400, 200, 200);
        button4.setIcon(img4);
        button4.setBackground(new Color(33,158,188));
        button4.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button5.setBounds(615, 25, 60, 60);
        button5.setIcon(img5);
        button5.setBackground(new Color(33,158,188));
        button5.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        button.setBounds(583, 568, 92, 72);
        button.setIcon(img);
        button.setBackground(new Color(33,158,188));
        button.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(services.isEmpty()) {
                    label2.setBorder(BorderFactory. createLineBorder(Color.RED,7));
                } else {
                    app.page3Click(services);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page8Click();
            }
        });

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            if(check1) {
                button1.setBorder(BorderFactory.createLineBorder(Color.WHITE,7));
                check1 = false;
                services.add(9);
            } 
            else  {
                button1.setBorder(BorderFactory. createLineBorder(new Color(33,158,188),1));
                check1 = true;
                services.remove(services.indexOf(9));
            }
        } 
        if(e.getSource() == button2) {
            if(check2) {
                button2.setBorder(BorderFactory.createLineBorder(Color.WHITE,7));
                check2 = false;
                services.add(8);
            } 
            else {
                button2.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
                check2 = true;
                services.remove(services.indexOf(8));
            }
        } if(e.getSource() == button3) {
            if(check3) {
                button3.setBorder(BorderFactory. createLineBorder(Color.WHITE,7));
                check3 = false;
                services.add(350);
            } else  {
                button3.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
                check3 = true;
                services.remove(services.indexOf(350));
            }
        } if(e.getSource() == button4) {
            if(check4) {
                button4.setBorder(BorderFactory. createLineBorder(Color.WHITE,7));
                check4 = false;
                services.add(337);
            } else  {
                button4.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
                check4 = true;
                services.remove(services.indexOf(337)); 
            }
        }
    }
}