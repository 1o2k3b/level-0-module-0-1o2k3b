import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Scorebord {
Color[] rainbow = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(106, 13, 173)};
int[] yPos = {0, 90, 180, 460, 550, 640};
int score = 0;
Border b = BorderFactory.createLineBorder(Color.black, 5);
	public static void main(String[] args) {
	Scorebord s = new Scorebord();
	s.setup();
}
public void setup() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel[] colors = new JLabel[7];
	JLabel middle = new JLabel();
	frame.setVisible(true);
	frame.setSize(1280, 750);
	frame.add(panel);
	panel.setLayout(null);
	panel.add(middle);
	middle.setBounds(0, 270, 1280, 190);
	middle.setBackground(Color.LIGHT_GRAY);
	middle.setBorder(b);
	middle.setFont(new Font("Times New Roman",Font.PLAIN, 40));
	middle.setHorizontalAlignment(JLabel.CENTER);
	middle.setText("score: " + score);
	
	for(int i = 0; i<6; i++) {
		colors[i] = new JLabel();
		panel.add(colors[i]);
		colors[i].setOpaque(true);
		colors[i].setBounds(0, yPos[i], 1280, 90);
		colors[i].setBackground(rainbow[i]);
	}
}
}
