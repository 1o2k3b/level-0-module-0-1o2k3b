import java.awt.Color;
import java.security.DomainCombiner;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class button implements MouseListener, ActionListener{
	int amountCost = 5;
	Random r = new Random();
	int scor = 0;
	int mult = 1;
	int goldenChance = 100;
	int goldenMulti = 2;
	int goldenCost = 50;
	int costGolden = 100;
	JFrame frame = new JFrame();
	JLabel score = new JLabel();
	JButton click = new JButton();
	JButton Mulitplier = new JButton();
	JButton goldenPossibility = new JButton();
	JButton goldenMultiplier = new JButton();
	JPanel panel = new JPanel();
	Color background = new Color(30, 80, 120);
	Color mainButtonColor = new Color(0, 130, 70);
	
public void run() {
	frame.setVisible(true);
	frame.setSize(400, 500);
	frame.add(panel);
	panel.setLayout(null);
	panel.add(click);
	panel.add(goldenPossibility);
	panel.add(goldenMultiplier);
	panel.add(score);
	panel.add(Mulitplier);
	panel.setBackground(background);
	click.setBounds(125, 100, 150, 100);
	click.setOpaque(true);
	click.setBorderPainted(true);
	click.setBackground(background);
	click.setBorderPainted(false);
	click.setBackground(mainButtonColor);
	click.addMouseListener(this);
	click.setText("CLICK");
	click.setFont(new Font(null).deriveFont(Font.BOLD, 38));
	score.setBounds(100, 20, 200, 40);
	score.setFont(new Font("Times New Roman", Font.BOLD, 30));
	score.setOpaque(true);
	Mulitplier.setBounds(125, 250, 150, 50);
	Mulitplier.addMouseListener(this);
	Mulitplier.setText("multiplier for " + amountCost);
	goldenMultiplier.setBounds(200, 325, 175, 40);
	goldenMultiplier.addMouseListener(this);
	goldenPossibility.addMouseListener(this);
	goldenPossibility.setBounds(10, 325, 175, 40);
	goldenPossibility.setText("golden chance cost: " + goldenCost);
	
}

public static void main(String[] args) {
	button b = new button();
	b.run();
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	String hi = "10";
	if(e.getSource() == click) {
		scor+=mult;
		score.setText("money = " + scor);	
		
		if(r.nextInt(goldenChance)==1) {
			scor+=mult*goldenMulti;
			score.setText("money = " + scor);
			score.setBackground(Color.yellow);
		}
	}
	if(e.getSource() == Mulitplier) {
		if(scor >= amountCost) {
			scor-=amountCost;
			amountCost+=5;
			mult+=1;
			score.setText("money =" + scor);
			Mulitplier.setText("multiplier for " + amountCost);
		}
	}
	if(e.getSource() == goldenPossibility) {
		if(scor >= goldenCost) {
			scor-=goldenCost;
			goldenCost*=3;
			goldenPossibility.setText("golden multiplier: " + goldenCost);
			goldenChance-=5;
			score.setText("money = " + scor);
		}
	}
	if(e.getSource() == goldenMultiplier) {
		if(scor >= goldenCost) {
			scor-=goldenCost;
			goldenCost*=5;
			goldenPossibility.setText("golden multiplier: " + goldenCost);
			goldenMulti++;
			score.setText("money = " + scor);
		}
	}
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	score.setBackground(mainButtonColor);
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
