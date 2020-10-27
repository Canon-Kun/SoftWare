package gui;
import data.Cell;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GameMap extends JFrame {

	
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Cell c = new Cell();
		c.init();
		TimeControl tcl = new TimeControl(c);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMap frame = new GameMap(tcl);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


		
	/**
	 * Create the frame.
	 */
	public GameMap(TimeControl tcl) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 743);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	   
	    JButton[][] nGrid = new JButton[30][30];
		btnNewButton = new JButton("¿ªÊ¼");
	    btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
		tcl.TimeStart(nGrid);
		
			
			}
			
			
		});
		btnNewButton.setBounds(696, 153, 97, 77);
		
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ÔÝÍ£");
		
		btnNewButton_1.setBounds(696, 301, 97, 77);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tcl.TimeStop();
			}
		});
		
//		btnNewButton_2 = new JButton("»Ö¸´");
//		btnNewButton_2.setBounds(696, 433, 97, 77);
//		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 69, 600, 600);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(30, 30, 0, 0));
		
		
		

		for(int i=0;i<30;i++)
		{
			for(int j=0;j<30;j++)
			{
				nGrid[i][j] = new JButton("");
				nGrid[i][j].setBackground(Color.white);
				panel.add(nGrid[i][j]);
			}
		}
		
	}
	
	
	
}
