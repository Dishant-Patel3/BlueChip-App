import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.net. HttpURLConnection;
import java.net.URL;
import java.util. Scanner;

public class Rec extends JPanel{
    JLabel label = new JLabel("Blue - Chip  Entertainment");
    JLabel label0 = new JLabel("_________________");
    JLabel label1 = new JLabel("Here are our top picks for you");
    JButton button = new JButton("");
    JButton button0 = new JButton("");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button5 = new JButton("");
    ImageIcon img = new ImageIcon("Logistics/shuffle.png");
    ImageIcon img0 = new ImageIcon("Logistics/back.png");
    ImageIcon img2 = new ImageIcon("Logistics/home.png");
    Image image;

    private Window app;
    private ArrayList<Integer> services;
    private ArrayList<String> desires;
    private ArrayList<String> recs;
    private ArrayList<String> images;
    private String imageurl, imageurl1, imageurl2, imageurl3;

    public Rec(Window app1, ArrayList<Integer> s, ArrayList<String> d, int y) {
        app = app1;
        services = s;
        desires = d;
        recs = new ArrayList<String>();
        images = new ArrayList<String>();
        imageurl = "https://image.tmdb.org/t/p/w500";
        imageurl1 = "";
        imageurl2 = "";
        imageurl3 = "";
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
        label1.setFont(new Font("Bell MT", Font.BOLD, 38));
        label1.setForeground(Color.black);
        label1.setSize(700, 300);
        label1.setHorizontalAlignment(JLabel.CENTER);
        add(label1);
        button.setBounds(558, 545, 112, 102);
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
        setRecs();
        for(int x = 0; x < 3; x++) {
            if(images.size() > 2) {
                if(x == 0) {
                    int rand = (int) (Math.random()*(images.size()-1)+1);
                    imageurl1 = images.get(rand);
                    try {
                        URL url = new URL(imageurl1);
                        image = ImageIO.read(url.openStream());
                        image = image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                    } catch (IOException f) {
                        f.printStackTrace();
                    } 
                    button1.setBounds(30, 220, 200, 300);
                    button1.setIcon(new ImageIcon(image));
                    add(button1);
                    images.remove(rand);
                } else if(x == 1) {
                    int rand = (int) (Math.random()*(images.size()-1)+1);
                    imageurl2 = images.get(rand);
                    try {
                        URL url = new URL(imageurl2);
                        image = ImageIO.read(url.openStream());
                        image = image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                    } catch (IOException f) {
                        f.printStackTrace();
                    } 
                    button2.setBounds(250, 220, 200, 300);
                    button2.setIcon(new ImageIcon(image));
                    add(button2);
                    images.remove(rand);
                } else if(x == 2) {
                    int rand = (int) (Math.random()*(images.size()-1)+1);
                    imageurl3 = images.get(rand);
                    try {
                        URL url = new URL(imageurl3);
                        image = ImageIO.read(url.openStream());
                        image = image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                    } catch (IOException f) {
                        f.printStackTrace();
                    } 
                    button3.setBounds(470, 220, 200, 300);
                    button3.setIcon(new ImageIcon(image));
                    add(button3);
                    images.remove(rand);
                }
            } else if(images.size() < 3) {
                setRecs();
            }
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    app.page11Click(imageurl1);
                }
            });
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    app.page11Click(imageurl2);
                }
            });
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    app.page11Click(imageurl3);
                }
            });
        }
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                for(int x = 0; x < 3; x++) {
                    if(images.size() > 2) {
                        if(x == 0) {
                            int rand = (int) (Math.random()*(images.size()-1)+1);
                            imageurl1 = images.get(rand);
                            try {
                                URL url = new URL(imageurl1);
                                image = ImageIO.read(url.openStream());
                                image = image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                            } catch (IOException f) {
                                f.printStackTrace();
                            } 
                            button1.setBounds(30, 220, 200, 300);
                            button1.setIcon(new ImageIcon(image));
                            add(button1);
                            images.remove(rand);
                        } else if(x == 1) {
                            int rand = (int) (Math.random()*(images.size()-1)+1);
                            imageurl2 = images.get(rand);
                            try {
                                URL url = new URL(imageurl2);
                                image = ImageIO.read(url.openStream());
                                image = image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                            } catch (IOException f) {
                                f.printStackTrace();
                            } 
                            button2.setBounds(250, 220, 200, 300);
                            button2.setIcon(new ImageIcon(image));
                            add(button2);
                            images.remove(rand);
                        } else if(x == 2) {
                            int rand = (int) (Math.random()*(images.size()-1)+1);
                            imageurl3 = images.get(rand);
                            try {
                                URL url = new URL(imageurl3);
                                image = ImageIO.read(url.openStream());
                                image = image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                            } catch (IOException f) {
                                f.printStackTrace();
                            } 
                            button3.setBounds(470, 220, 200, 300);
                            button3.setIcon(new ImageIcon(image));
                            add(button3);
                            images.remove(rand);
                        }
                    } else if(images.size() < 3) {
                        setRecs();
                    }
                    button1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            app.page11Click(imageurl1);
                        }
                    });
                    button2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            app.page11Click(imageurl2);
                        }
                    });
                    button3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            app.page11Click(imageurl3);
                        }
                    });
                }
            }
        });
        
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page6Click();
                desires.clear();
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.page10Click();
            }
        });
    }

    public void setRecs() {
        if(desires.get(0).equals("1")) {
            for(int x = 1; x < 51; x++) {
                getJSONobject(services.get(0), Integer.parseInt(desires.get(1)), x);
            }
        } else if(desires.get(0).equals("2")) {
            for(int x = 1; x < 51; x++) {
                getJSONobject1(services.get(0), Integer.parseInt(desires.get(1)), x);
            }
        } else if (desires.get(0).equals("0")) {
            int rand = (int) (Math.random()*2+1);
            if(rand == 1) {
                for(int x = 1; x < 51; x++) {
                    getJSONobject(services.get(0), Integer.parseInt(desires.get(1)), x);
                }
            } else if (rand == 2) {
                for(int x = 1; x < 51; x++) {
                    getJSONobject1(services.get(0), Integer.parseInt(desires.get(1)), x);
                }
            }
        }
    }
    public void getJSONobject(int w, int g, int p) {
        try {
            String url1 = "";
            if(g == 0) {
                url1 = "https://api.themoviedb.org/3/discover/tv?api_key=b2dda13ebe4ce2966844623c1c4d1a4d&language=en-US&sort_by=popularity.desc&page=1&timezone=America%2FNew_York&include_null_first_air_dates=false&with_watch_monetization_types=buy&with_status=0&with_type=0";
            } else if(g != 0) {
                url1 = "https://api.themoviedb.org/3/discover/tv?api_key=b2dda13ebe4ce2966844623c1c4d1a4d&language=en-US&sort_by=popularity.desc&page=" + p + "&timezone=America%2FNew_York&with_genres=" + g + "&include_null_first_air_dates=false&with_watch_providers=" + w + "&with_watch_monetization_types=buy&with_status=0&with_type=0";
            }
            URL url = new URL(url1);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                String name = "";
                String image = "";
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));
                JSONArray countryData = (JSONArray) (dataObject).get("results");
                Iterator<String> unitsIterator = countryData.iterator();
                while(unitsIterator.hasNext()){         
                    Object uJson = unitsIterator.next();
                    JSONObject uj = (JSONObject) uJson;
                    name =  (String) uj.get("original_name");
                    recs.add(name);
                    image = (String) uj.get("poster_path");
                    String urlimg = "https://image.tmdb.org/t/p/w500" + image;
                    if(!(urlimg.equals("https://image.tmdb.org/t/p/w500null")) && (!(images.contains(urlimg)))){
                        images.add(urlimg);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getJSONobject1(int w, int g, int p) {
        try {
            String url1 = "";
            if(g == 0) {
                url1 = "https://api.themoviedb.org/3/discover/movie?api_key=b2dda13ebe4ce2966844623c1c4d1a4d&language=en-US&sort_by=popularity.desc&with_watch_monetization_types=buy";
            } else if(g != 0) {
                url1 = "https://api.themoviedb.org/3/discover/movie?api_key=b2dda13ebe4ce2966844623c1c4d1a4d&language=en-US&sort_by=popularity.desc&page=" + p + "&with_genres=" + g + "&with_watch_providers=" + w + "&with_watch_monetization_types=buy";
            }
            URL url = new URL(url1);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                String name = "";
                String image = "";
                JSONParser parse = new JSONParser();
                JSONObject dataObject = (JSONObject) parse.parse(String.valueOf(informationString));
                JSONArray countryData = (JSONArray) (dataObject).get("results");
                Iterator<String> unitsIterator = countryData.iterator();
                while(unitsIterator.hasNext()){         
                    Object uJson = unitsIterator.next();
                    JSONObject uj = (JSONObject) uJson;
                    name =  (String) uj.get("original_title");
                    recs.add(name);
                    image = (String) uj.get("poster_path");
                    String urlimg = "https://image.tmdb.org/t/p/w500" + image;
                    if(!(urlimg.equals("https://image.tmdb.org/t/p/w500null")) && (!(images.contains(urlimg)))){
                        images.add(urlimg);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}