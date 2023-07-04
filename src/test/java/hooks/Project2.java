package hooks;
import javax.swing.*;

public class Project2 {

	public void volumeslider() {
		JFrame frame=new JFrame("Vishal");
		frame.setBounds(50, 100, 200, 30);
		frame.setSize(1000, 1000);

		// frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		frame.setLayout(null);
		frame.setVisible(true);
        JPanel p=new JPanel(); 

		p.setBounds(10,50,300,300);

		JSlider volumeslider=new JSlider(0,100,10);

		p.add(volumeslider);
		frame.add(p);

		frame.setVisible(true);
	}
	

	public static void main(String[] args) {

		Project2 p2=new Project2();
		p2.volumeslider();



	}

}
