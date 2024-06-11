import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class timerycode extends JFrame implements ActionListener, MouseListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();
    JButton hint = new JButton();
    JPanel panel = new JPanel();
    JLabel timer = new JLabel();
    JLabel penalty = new JLabel();
    JTextField input = new JTextField();
    JButton check = new JButton();
    JLabel output = new JLabel();
    JLabel out = new JLabel();
    JLabel code = new JLabel();
    String hintInput = "";

    long time = System.currentTimeMillis();
    int re = 25;
    int gree = 150;
    int blu = 70;
    float[] hs = Color.RGBtoHSB(re, gree, blu, null);
    float hu = hs[0];
    float sat = hs[1];
    float bright = hs[2];
    int r = 150;
    int gre = 40;
    int bl = 70;
    float[] h = Color.RGBtoHSB(r, gre, bl, null);
    float hua = h[0];
    float sa = h[1];
    float brigh = h[2];
    int minutes = 44;
    int sec;
    int red = 15;
    int green = 80;
    int blue = 160;
    float[] hsb = Color.RGBtoHSB(red, green, blue, null);
    float hue = hsb[0];
    float saturation = hsb[1];
    float brightness = hsb[2];

    public void run() {
        Border line = BorderFactory.createLineBorder(Color.BLACK, 3);
        frame.add(panel);
        frame.setVisible(true);
        penalty.setText("penalty");
        panel.add(button);
        panel.add(timer);
        panel.add(input);
        panel.add(check);
        panel.add(output);
        panel.add(out);
        panel.add(code);
        panel.add(hint);
        panel.setLayout(null);
        timer.setFont(timer.getFont().deriveFont(Font.BOLD, 30));

        System.out.println("RGB [" + red + "," + green + "," + blue + "] converted to HSB: " + hue + " , " + saturation + " , " + brightness);

        check.setBounds(255, 180, 80, 30);
        check.setText("check");
        check.addActionListener(this);
        check.setOpaque(true);
        check.setBorderPainted(true);
        check.setBackground(new Color(40, 160, 40));
        check.setBorder(line);

        out.setVisible(true);
        out.setText("output");
        out.setOpaque(true);
        out.setBounds(0, 280, 600, 100);
        out.setBackground(Color.black);
        out.setFont(out.getFont().deriveFont(Font.BOLD, 12));
        out.setForeground(Color.WHITE);
        out.setHorizontalAlignment(SwingConstants.CENTER);

        output.setVisible(true);
        output.setText("code");
        output.setOpaque(false);
        output.setBounds(250, 115, 80, 40);
        output.setFont(output.getFont().deriveFont(Font.BOLD, 15));
        output.setHorizontalAlignment(SwingConstants.CENTER);

        input.setBounds(190, 152, 200, 30);

        panel.setLayout(null);
        panel.setBackground(Color.getHSBColor(hue, saturation, brightness));

        button.setBounds(250, 242, 95, 28);
        button.setText("penalty");
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setOpaque(true);
        button.addMouseListener(this);
        button.setBorder(line);
        button.setBorderPainted(true);
        button.setBackground(new Color(160, 20, 20));

        hint.setBounds(520, 100, 80, 40);
        hint.setText("Hint");
        hint.setOpaque(true);
        hint.setBorder(line);
        hint.setBorderPainted(true);
        hint.setBackground(new Color(40, 160, 40));
        hint.addActionListener(this);  // Add an action listener for hint button

        timer.setHorizontalAlignment(SwingConstants.CENTER);
        timer.setBounds(0, 0, 600, 100);
        timer.setOpaque(true);
        timer.setBackground(Color.yellow);

        frame.pack();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        new Thread(() -> {
            try {
                for (sec = 59; sec > -1; sec--) {
                    String s = String.valueOf(sec);
                    timer.setText(minutes + " : " + s);
                    Thread.sleep(1000);
                    if (sec == 0) {
                        sec = 59;
                        minutes -= 1;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void check() {
        switch (hintInput) {
            case "1":
            	minutes-=3;
            	out.setText("Symmetry is key");
                break;
            case "2":
            	minutes-=3;
            	out.setText("may I remind you that bouncing bullets still kill guards, as well as you");
                break;
            case "3":
            	minutes-=3;
            	out.setText("Avoid the many penalty slips, and search");
                break;
            case "4":
            	minutes-=3;
            	out.setText("Shed light not upon the shadows, instead, on the thing that causes the shadows");
                break;
            case "5":
                out.setText("Perhaps the UV light has multiple uses?");
                minutes-=3;
                break;
            case "6":
            	minutes-=3;
            	out.setText("Choose wisely, think about your remaining time, and then choose the difficulty you want.");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        timerycode code = new timerycode();
        code.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == check) {
            String yes = input.getText();
            if (yes.equals("radiation danger")) {
                out.setText("7492, but be safe, high danger");
                panel.setBackground(Color.getHSBColor(hu, sat, bright));
            } else if (yes.equals("reset")) {
                panel.setBackground(Color.getHSBColor(hue, saturation, brightness));
                out.setText("output");
            } else if (yes.equals("759375024731")) {
                out.setText("come in V.I.P., the code is 7304.");
                panel.setBackground(Color.getHSBColor(hu, sat, bright));
            } else {
                out.setText("nice try, now press penalty");
                panel.setBackground(Color.getHSBColor(hua, sa, brigh));
            }
        } else if (e.getSource() == hint) {
            hintInput = JOptionPane.showInputDialog("Type 1 for security cameras, 2 for guard shootout, 3 for magnet puzzle, 4 for UV light puzzle, 5 for colored key puzzle, and 6 for the choice");
            check();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == button) {
            minutes -= 3;
            panel.setBackground(Color.getHSBColor(hue, saturation, brightness));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

