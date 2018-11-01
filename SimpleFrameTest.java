//package simpleFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFrameTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				SimpleFrame frame = new SimpleFrame();
				ButtonFrame b1 = new ButtonFrame(frame);

		

				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				//b1.setVisible(true);
				frame.setVisible(true);
			}
		});
	}
}

class SimpleFrame extends JFrame
{
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();

	Image img = new ImageIcon("xmas-tree.png").getImage();	
	//setIconImage(img);

	int DEFAULT_WIDTH = screenSize.width;
	int DEFAULT_HEIGHT = screenSize.height;

	public SimpleFrame()
	{
		setTitle("小萌宝");
		setIconImage(img);
		setSize(DEFAULT_WIDTH / 3,DEFAULT_HEIGHT / 3);
		setLocationByPlatform(true);
	}
}

class ButtonFrame extends JFrame
{
	private JPanel buttonPanel;
	private JButton baobao;
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 500;

	public ButtonFrame(SimpleFrame k)
	{
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		baobao = new JButton("love");

		buttonPanel = new JPanel();

		buttonPanel.add(baobao);

		k.add(buttonPanel);
		
		Some s = new Some(Color.RED);

		baobao.addActionListener(s); 
		
	}

	private class Some implements ActionListener
	{
		private Color backgroundColor;
		public Some(Color c)
		{
			backgroundColor = c;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			buttonPanel.setBackground(backgroundColor);
			//System.exit(0);
		}
	}
}
