

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
public class timerycode extends JFrame {


public static void main(String[] args) {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
	JLabel timer = new JLabel();
	JLabel penalty = new JLabel();
	JPanel time = new JPanel();
	
	for(int sec = 59; sec>-1; sec--) {
		String s = String.valueOf(sec);
		timer.setText(s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	penalty.setText("penalty");
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	frame.setSize(600, 400);
	button.add(penalty);
	time.add(timer);
	frame.add(time);
	
	
	
}

}

