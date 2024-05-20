import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class WhackAMole implements ActionListener {
	Random r = new Random();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int score = 0;
	JLabel time = new JLabel();
	JLabel penalty = new JLabel();
	JButton[] Buttons = new JButton[21];
	Color color = new Color(165, 42, 42);
	int i = 1;
	int tim = 60;
	public void drawButtons() throws InterruptedException {
frame.add(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


for(i = 0; i<21; i++) {
	Buttons[i] = new JButton();
	Buttons[i].setOpaque(true);
	Buttons[i].setBorderPainted(false);
	Buttons[i].setBackground(Color.black);
	Buttons[i].addActionListener(this);
	panel.add(Buttons[i]);
}
frame.setVisible(true);
frame.setSize(300, 350);
panel.add(time);
time.setOpaque(true);
time.setBackground(Color.gray);

while(true) {
	i = r.nextInt(21);
Buttons[i].setBackground(color);
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
Buttons[i].setBackground(Color.black);
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
tim--;
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
tim--;
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
tim--;
Thread.sleep(1000);
tim--;
System.out.println("time: " + tim + "score: " + score);
if(tim == 0) {
	break;
}

}
	}

		
	

public static void main(String[] args) throws InterruptedException {
	WhackAMole smack = new WhackAMole();
	smack.drawButtons();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(Buttons[i])) {
		Buttons[i].setBackground(Color.black);
		score++;
	} else {
		score--;
	}
}
}
