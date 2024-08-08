import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Desire extends JPanel{
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label6 = new JLabel("looking to watch today?");
    JLabel label7 = new JLabel("");
    JLabel label1 = new JLabel("Type:");
    JLabel label2 = new JLabel("Genre:");
    JLabel label3 = new JLabel("Rating:");
    JLabel label4 = new JLabel("Review:");
    String[] choices = {"Select the Type", "TV Show","Movie", "Anything"};
    String[] type = {"0", "1", "2", "0"};
    String[] choices1 = {"Select the Genre", "Comedy", "Sci-Fi", "Horror", "Romance", "Action", "Thriller", "Drama", "Mystery", "Adventure", "Fantasy", "Anything"};
    String[] genres = {"0", "35", "878", "27", "10749", "28", "53", "18", "9648", "12", "14", "0"};
    String[] genres1 = {"0", "35", "10765", "80", "10766", "10759", "99", "18", "9648", "10759", "10765", "0"};
    String[] choices2 = {"Select the Rating", "G", "PG", "PG-13", "R", "X","Anything"};
    JComboBox<String> cb = new JComboBox<String>(choices);
    JComboBox<String> cb1 = new JComboBox<String>(choices1);
    JComboBox<String> cb2 = new JComboBox<String>(choices2);
    JComboBox cb3 = new JComboBox();
    JButton button = new JButton("");
    JButton button0 = new JButton("");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    JButton button5 = new JButton("");
    ImageIcon img = new ImageIcon("Logistics/next.png");
    ImageIcon img0 = new ImageIcon("Logistics/back.png");
    ImageIcon img2 = new ImageIcon("Logistics/home.png");
    private ArrayList<String> desires;
    private Window app;
    private String name;

    public Desire(Window app1, String n, int x) {
        app = app1;
        name = n;
        desires = new ArrayList<String>();
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
        label1.setBounds(100, 250, 80, 50);
        label1.setFont(new Font("Bell MT", Font.BOLD, 23));
        label1.setForeground(Color.white);
        add(label1);
        label2.setBounds(100, 330, 80, 50);
        label2.setFont(new Font("Bell MT", Font.BOLD, 23));
        label2.setForeground(Color.white);
        add(label2);
        label3.setBounds(100, 410, 100, 50);
        label3.setFont(new Font("Bell MT", Font.BOLD, 23));
        label3.setForeground(Color.white);
        add(label3);
        label4.setBounds(100, 490, 100, 50);
        label4.setFont(new Font("Bell MT", Font.BOLD, 23));
        label4.setForeground(Color.white);
        add(label4);
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
        label7.setText(name + " what are you");
        label7.setSize(700, 300);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setVerticalAlignment(JLabel.CENTER);
        add(label7);
        button.setBounds(573, 550, 112, 102);
        button.setIcon(img);
        button.setBackground(new Color(33,158,188));
        button.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button);
        button0.setBounds(18, 568, 92, 72);
        button0.setIcon(img0);
        button0.setBackground(new Color(33,158,188));
        button0.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button0);
        button5.setBounds(615, 25, 60, 60);
        button5.setIcon(img2);
        button5.setBackground(new Color(33,158,188));
        button5.setBorder(BorderFactory.createLineBorder(new Color(33,158,188),1));
        add(button5);
        add(label7);
        cb.setBounds(200, 261, 400, 30);
        cb.setFont(new Font("Arial Rounded MT", Font.PLAIN, 21));
        cb.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        cb.setForeground(Color.black);
        add(cb);
        cb1.setBounds(200, 341, 400, 30);
        cb1.setFont(new Font("Arial Rounded MT", Font.PLAIN, 21));
        cb1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        cb1.setForeground(Color.black);
        add(cb1);
        cb2.setBounds(200, 421, 400, 30);
        cb2.setFont(new Font("Arial Rounded MT", Font.PLAIN, 21));
        cb2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        cb2.setForeground(Color.black);
        add(cb2);
        cb3.setBounds(200, 501, 400, 30);
        cb3.setFont(new Font("Arial Rounded MT", Font.PLAIN, 21));
        cb3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        cb3.setForeground(Color.black);
        cb3.setModel(loadImages());
        add(cb3);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int getArrayIndex = Arrays.asList(choices).indexOf(cb.getSelectedItem().toString());
                int getArrayIndex1 = Arrays.asList(choices1).indexOf(cb1.getSelectedItem().toString());
                desires.add(type[getArrayIndex]);
                if(cb.getSelectedItem().toString().equals("TV Show")) {
                    desires.add(genres1[getArrayIndex1]);
                } else if(cb.getSelectedItem().toString().equals("Movie")) {
                    desires.add(genres[getArrayIndex1]);
                } else if(cb.getSelectedItem().toString().equals("Anything") || cb.getSelectedItem().toString().equals("Select the Type")) {
                    desires.add(genres[getArrayIndex1]);
                }
                app.page4Click(desires);
            }
        });

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page5Click();
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page9Click();
            }
        });
    }

    private DefaultComboBoxModel<Icon> loadImages() {
        DefaultComboBoxModel<Icon> dm = new DefaultComboBoxModel<Icon>();
        dm.addElement(new ImageIcon("Reviews/fivestar1.png"));
        dm.addElement(new ImageIcon("Reviews/fourstar1.png"));
        dm.addElement(new ImageIcon("Reviews/threestar1.png"));
        dm.addElement(new ImageIcon("Reviews/twostar1.png"));
        dm.addElement(new ImageIcon("Reviews/onestar1.png"));

        return dm;
    }
}