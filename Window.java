import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Window extends JFrame {
    ImageIcon img = new ImageIcon("Logistics/bluechip.png");
    private Bluechip page1 = new Bluechip(this);
    private Mood page2;
    private Home page6;
    private Services page3;
    private Desire page4;
    private Rec page5;
    private Entertainment page7;
    private String name, url;
    private ArrayList<Integer> services;
    private ArrayList<String> desires;
    private int mood;
    public Window() {
        setTitle("Blue-Chip Entertainment");
        setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setIconImage(img.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        name = "";
        mood = 0;
        services = new ArrayList<Integer>();
        desires = new ArrayList<String>();
        add(page1);
        setVisible(true);
    }

    public void pageClick() {
        page6.setVisible(false);
        page1.setVisible(true);
    }
    
    public void page1Click(String name) {
        this.name = name;
        page2 = new Mood(this, name);
        add(page2);
        page1.setVisible(false);
        page2.setVisible(true);
    }
    public void page2Click(int x) {
        mood = x;
        page6 = new Home(this, x, name);
        page3 = new Services(this, x);
        page4 = new Desire(this, name, x);
        add(page6);
        page2.setVisible(false);
        page6.setVisible(true);
    }
    public void page7Click(){
        add(page3);
        page6.setVisible(false);
        page3.setVisible(true);
    }
    public void page3Click(ArrayList<Integer> s) {
        services = s;
        add(page4);
        page3.setVisible(false);
        page4.setVisible(true);
    }
    public void page4Click(ArrayList<String> d) {
        desires = d;
        page5 = new Rec(this, services, desires, mood);
        add(page5);
        page5.setVisible(true);
        page4.setVisible(false);
    }
    public void page5Click() {
        page3.setVisible(true);
        page4.setVisible(false);
    }
    public void page6Click() {
        page5.setVisible(false);
        page4.setVisible(true);
    }

    public void page8Click() {
        page6.setVisible(true);
        page3.setVisible(false);
    }

    public void page9Click() {
        page6.setVisible(true);
        page4.setVisible(false);
    }

    public void page10Click() {
        page6.setVisible(true);
        page5.setVisible(false);
    }

    public void page11Click(String url) {
        this.url = url;
        page7 = new Entertainment(this, url, name);
        add(page7);
        page7.setVisible(true);
        page5.setVisible(false);
    }
}