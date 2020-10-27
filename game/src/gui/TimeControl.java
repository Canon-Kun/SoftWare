package gui;

import java.awt.Color;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;

import data.Cell;

public class TimeControl {
	private Cell Tc;
	private Timer timer = new Timer() ;


	
	TimeControl(Cell c)
	{
	Tc = c;
		
	}
//¿ªÊ¼¼ü	
	public  void TimeStart(JButton[][] nGrid) {
	
	 
	   timer.schedule(new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for(int i=1;i<31;i++) {
				for(int j=1;j<31;j++) {
					if(Tc.flag[i][j]==1) {nGrid[i-1][j-1].setBackground(Color.black);}
					else {nGrid[i-1][j-1].setBackground(Color.white);}
				}
				}
			try {
				Tc.update();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}, 1000,1000);
   }
//ÔÝÍ£¼ü
	public void TimeStop() {
	timer.cancel();
	}

	
	
	
	
}
