package frontEnd;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeBottomDetails {

	static URL imageURL = HomeBottomDetails.class.getResource("/resources/skymath icon.png");
	public static JPanel homebottomdetails = new JPanel();
	public static JLabel imageicon= new JLabel();
	public static ImageIcon skyMathIcon = new ImageIcon(new ImageIcon(imageURL).getImage()
			.getScaledInstance(60, 60, Image.SCALE_DEFAULT));
	public static JLabel contactUs,gmailPhone;
	HomeBottomDetails()
	{
		try {
			homebottomdetails.setPreferredSize(new Dimension(500,130));
			homebottomdetails.setBackground(new Color(61,61,61));
			homebottomdetails.setLayout(null);
			homebottomdetails.add(imageicon());
			homebottomdetails.add(contactUs());
			homebottomdetails.add(gmailPhone());
		}catch(Exception ee) {
			
		}
		
	}
	static Component imageicon() 
	{
		imageicon.setBounds(20,20,60,60);
		imageicon.setBackground(new Color(61,61,61));
		imageicon.setIcon(skyMathIcon);
		imageicon.setOpaque(true);
		return imageicon;	
	}
	static Component contactUs()
	{
		contactUs = new JLabel();
		contactUs.setBounds(100, 20, 200, 30);
		contactUs.setText("Contact Us");
		contactUs.setFont(new Font("TimesRoman BOLD", Font.BOLD,20));
		contactUs.setForeground(new Color(52,145,255));
		contactUs.setBackground(new Color(61,61,61));
		contactUs.setOpaque(true);
		return contactUs;
	}
	static Component gmailPhone()
	{
		gmailPhone = new JLabel();
		gmailPhone.setBounds(100, 30, 400, 100);
		gmailPhone.setBackground(new Color(61,61,61));
		gmailPhone.setOpaque(true);
		gmailPhone.setForeground(Color.white);
		gmailPhone.setText("<html>GMAIL: carl.galvan@neu.edu.ph"
				+"<br/>        carl2.galvan@neu.edu.ph<br/><br/>Phone: +63 975 538 3809</html>");
		return gmailPhone;
	}
}
