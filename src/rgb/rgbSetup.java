package rgb;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class rgbSetup {
Random ran = new Random();
int r;
int b;
int g;
int movingR = 0;
int movingB = 0;
int movingG = 0;

Color c = new Color(0);

JFrame frame = new JFrame();
JPanel pane = new JPanel();
JLabel label = new JLabel();

public void setup() {
	r = ran.nextInt(255);
	b = ran.nextInt(255);
	g = ran.nextInt(255);
	
	frame.setVisible(true);
	frame.setSize(600, 400);
	frame.add(pane);
	pane.add(label);
	pane.setLayout(null);
	label.setSize(600, 400);
	
}
public void run() {
	if(r>movingR) {
		movingR++;
	}
	if(r<movingB) {
		movingR--;
	}
	if(b>movingB) {
		movingB++;
	}
	if(b<movingB) {
		movingB--;
	}
	if(g>movingG) {
		movingG++;
	}
	if(g<movingG) {
		movingG--;
	}
c = new Color(movingR, movingB, movingG);
	label.setOpaque(true);
	label.setBackground(c);
	
}
public void reset() throws InterruptedException {
	Thread.sleep(5000);
	
	r = ran.nextInt(255);
	b = ran.nextInt(255);
	g = ran.nextInt(255);
	
	System.out.println("r: " + movingR + "b: " + movingB + "g: " + movingG);
	
}
public static void main(String[] args) throws InterruptedException {
	rgbSetup s = new rgbSetup();
	s.setup();
	while(true) {
	s.reset();
	s.run();
	
	}
}
}
