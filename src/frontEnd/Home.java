package frontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Home implements ActionListener{

	public static JPanel home,top, body, bottom;
	public static JFrame frame;
	URL imageURL = TopDetails.class.getResource("/resources/skymath icon.png");
	public ImageIcon skyMathIcon = new ImageIcon(new ImageIcon(imageURL).getImage()
			.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
	
	public Home()
	{
		
		try {
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(900,970);
			frame.setIconImage(skyMathIcon.getImage());
			frame.add(home());
			frame.setResizable(false);
			//frame.add(new GenerateFormula().generateFormula);
			//frame.add(new Statistics().statistics);
			//frame.add(new CentralTendency().centralTendency);
			//frame.add(new ZTest().zTest);
			//frame.add(new TTest().tTest);
			//frame.add(new FTest().fTest);
			frame.setVisible(true);
		}
		catch(Exception ee)
		{
			
		}
		
	}
	static Component home()
	{
		home = new JPanel();
		home.setBorder(BorderFactory.createLineBorder(Color.green, 0, true));;
		home.setBackground(new Color(0,255,0));
		home.setLayout(new BorderLayout());
		home.setPreferredSize(new Dimension(900,900));
		home.add(top(), BorderLayout.NORTH);
		home.add(body(), BorderLayout.CENTER);
		home.add(bottom(), BorderLayout.SOUTH);
		home.setVisible(true);
		return home;
	}
	static Component top()
	{
		top = new JPanel();
		top.setPreferredSize(new Dimension(400,146));
		top.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		top.setBackground(Color.black);
		top.setLayout(new FlowLayout(FlowLayout.CENTER));
		top.add(new TopDetails().skyMath);
		return top;	
	}
	static Component body()
	{
		body = new JPanel();
		body.setPreferredSize(new Dimension(400,501));
		body.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		body.setBackground(new Color(61,61,61));
		body.setLayout(new FlowLayout(FlowLayout.LEADING));
		body.add(new HomebodyDetails().homebodypanel);
		return body;
	}
	static Component bottom()
	{
		bottom = new JPanel();
		bottom.setPreferredSize(new Dimension(400,171));
		bottom.setBorder(BorderFactory.createLineBorder(Color.green, 10, false));
		bottom.setBackground(new Color(61,61,61));
		bottom.setLayout(new FlowLayout(FlowLayout.LEADING));
		bottom.add(new HomeBottomDetails().homebottomdetails);
		return bottom;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
