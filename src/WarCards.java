import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class WarCards implements MouseListener {

	int one = 0;
	int two = 0;
	int FirstLeft = 28;
	int SecondLeft = 28;
	Random r = new Random();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel playerOne = new JLabel();
	JLabel playerTwo = new JLabel();
	JLabel OneCards = new JLabel();
	JLabel TwoCards = new JLabel();
	JLabel Fight = new JLabel();
	public void setup() {
		frame.setVisible(true);
	frame.setSize(400, 600);
	frame.add(panel);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	panel.add(playerOne);
	panel.add(playerTwo);
	panel.add(OneCards);
	panel.add(TwoCards);
	panel.add(Fight);
	panel.setLayout(null);
	
	playerOne.setBounds(137, 450, 125, 150);
	playerOne.setOpaque(true);
	playerOne.setBackground(new Color(160, 20, 20));
	playerOne.setText("0");
	playerOne.setFont(new Font("Times New Roman", Font.BOLD, 50));
	playerOne.setHorizontalAlignment(JLabel.CENTER);
	playerOne.setBorder(BorderFactory.createLineBorder(Color.black, 8));
	
	playerTwo.setBounds(137, -10, 125, 150);
	playerTwo.setOpaque(true);
	playerTwo.setHorizontalAlignment(JLabel.CENTER);
	playerTwo.setBackground(new Color(20, 60, 100));
	playerTwo.setText("0");
	playerTwo.setFont(new Font("Times New Roman", Font.BOLD, 50));
	playerTwo.setBorder(BorderFactory.createLineBorder(Color.black, 8));
	
	OneCards.setBounds(150, 375, 100, 50);
	OneCards.setOpaque(false);
	OneCards.setHorizontalAlignment(JLabel.CENTER);
	OneCards.setBackground(new Color(20, 60, 100));
	OneCards.setText("28");
	OneCards.setFont(new Font("Times New Roman", Font.BOLD, 50));
	
	TwoCards.setBounds(150, 175, 100, 50);
	TwoCards.setOpaque(false);
	TwoCards.setHorizontalAlignment(JLabel.CENTER);
	TwoCards.setBackground(new Color(20, 60, 100));
	TwoCards.setText("28");
	TwoCards.setFont(new Font("Times New Roman", Font.BOLD, 50));
	
	Fight.setBounds(137, 267, 125, 75);
	Fight.setOpaque(true);
	Fight.setHorizontalAlignment(JLabel.CENTER);
	Fight.setBackground(new Color(20, 140, 70));
	Fight.setText("FIGHT");
	Fight.setFont(new Font("Times New Roman", Font.BOLD, 34));
	Fight.setBorder(BorderFactory.createLineBorder(Color.black, 8));
	Fight.addMouseListener(this);
	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		one = r.nextInt(14)+3;
		two = r.nextInt(14)+3;
		
		if(one>10) {
			if(one == 11) {
				playerOne.setText("J");
			}
			if(one == 12) {
				playerOne.setText("Q");
			}
			if(one == 13) {
				playerOne.setText("K");
			}
			if(one == 14) {
				playerOne.setText("A");
			}
		} else if(one<=10) {
			playerOne.setText("" + one);
		}
		if(two>10) {
			if(two == 11) {
				playerTwo.setText("J");
			}
			if(two == 12) {
				playerTwo.setText("Q");
			}
			if(two == 13) {
				playerTwo.setText("K");
			}
			if(two == 14) {
				playerTwo.setText("A");
			}
		} else if(two<=10) {
			playerTwo.setText("" + two);
		}		
		if(two>one) {
			FirstLeft+=1;
			SecondLeft-=1;
			TwoCards.setText("" + FirstLeft);
			OneCards.setText("" + SecondLeft);
	}
		if(one>two) {
			FirstLeft-=1;
			SecondLeft+=1;
			TwoCards.setText("" + FirstLeft);	
			OneCards.setText("" + SecondLeft);
	}
		if(one == 0) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "player two wins");
		}
		if(two == 0) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "player one wins");
		}
}

	
	
	
	public static void main(String[] args) {
		WarCards card = new WarCards();
	card.setup();	
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
