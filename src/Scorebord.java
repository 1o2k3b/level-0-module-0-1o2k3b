import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.*;


public class Scorebord implements ActionListener {
Color[] rainbow1 = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(106, 13, 173)};
Color[] rainbow2 = {new Color(106, 13, 173), Color.red, Color.orange, Color.yellow, Color.green, Color.blue};
Color[] rainbow3 = {Color.blue, new Color(106, 13, 173), Color.red, Color.orange, Color.yellow, Color.green};
Color[] rainbow4 = {Color.green, Color.blue, new Color(106, 13, 173), Color.red, Color.orange, Color.yellow};
Color[] rainbow5 = {Color.yellow, Color.green, Color.blue, new Color(106, 13, 173), Color.red, Color.orange};
Color[] rainbow6 = {Color.orange, Color.yellow, Color.green, Color.blue, new Color(106, 13, 173), Color.red};
int[] yPos = {0, 90, 180, 460, 550, 640};
int oneScore = 0;
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel[] colors = new JLabel[7];
JLabel middle = new JLabel();
JLabel pOne = new JLabel();
JLabel pTwo = new JLabel();
JButton oneAdd = new JButton();
JButton twoAdd = new JButton();
int f = 0;
int twoScore = 0;
Border b = BorderFactory.createLineBorder(Color.black, 5);
	public static void main(String[] args) throws InterruptedException  {
	Scorebord s = new Scorebord();
	s.setup();
	while(true) {
s.spin();
	}
}
public void setup() throws InterruptedException {
	frame.setVisible(true);
	frame.setSize(1280, 750);
	frame.add(panel);
	panel.setLayout(null);
	panel.add(pOne);
	panel.add(pTwo);
	panel.add(oneAdd);
	panel.add(twoAdd);
	panel.add(middle);
	
	middle.setBounds(0, 270, 1280, 190);
	middle.setBackground(Color.LIGHT_GRAY);
	middle.setBorder(b);
	middle.setHorizontalAlignment(JLabel.CENTER);
	pOne.setBounds(150, 340, 400, 50);
	pOne.setFont(new Font("Times New Roman",Font.PLAIN, 40));
	pOne.setHorizontalAlignment(JLabel.CENTER);
	pOne.setText("Player One: " + oneScore);
	pTwo.setBounds(750, 340, 400, 50);
	pTwo.setFont(new Font("Times New Roman",Font.PLAIN, 40));
	pTwo.setHorizontalAlignment(JLabel.CENTER);
	pTwo.setText("Player Two: " + twoScore);
	oneAdd.setBounds(487, 340, 100, 50);
	oneAdd.setFont(new Font("Times New Roman",Font.BOLD, 80));
	oneAdd.setHorizontalAlignment(JLabel.CENTER);
	oneAdd.setText("+");
	oneAdd.addActionListener(this);
	twoAdd.setBounds(700, 340, 100, 50);
	twoAdd.setFont(new Font("Times New Roman",Font.BOLD, 80));
	twoAdd.setHorizontalAlignment(JLabel.CENTER);
	twoAdd.setText("+");
	twoAdd.addActionListener(this);
	for(int i = 0; i<6; i++) {
		colors[i] = new JLabel();
		panel.add(colors[i]);
		colors[i].setOpaque(true);
		colors[i].setBounds(0, yPos[i], 1280, 90);
		colors[i].setBackground(rainbow1[i]);
	}
	if(oneScore == 5) {
	
}
	
			if(twoScore == 5) {
		
}
}

	public void spin() throws InterruptedException {
		if(oneScore==5) {
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow1[i]);	
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow2[i]);	
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow3[i]);
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow4[i]);
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow5[i]);
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow6[i]);
			Thread.sleep(50);
		}
		if(twoScore==5) {
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow1[i]);	
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow2[i]);	
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow3[i]);
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow4[i]);
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow5[i]);
			Thread.sleep(50);	
		}
		for(int i = 0; i<6; i++) {
			colors[i].setBackground(rainbow6[i]);
			Thread.sleep(50);
		}
		}
		}
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	


	if(e.getSource() == oneAdd) {
		oneScore++;
		pOne.setText("Player One: " + oneScore);
	}
	if(e.getSource() == twoAdd) {
		twoScore++;
		pTwo.setText("Player Two: " + twoScore);
	}
	

}
		
	

}

