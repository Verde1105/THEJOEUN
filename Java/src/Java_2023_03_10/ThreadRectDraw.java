package Java_2023_03_10;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

//x,y로부터 10씩 떨어진곳에 사각형(정사각)그리기

public class ThreadRectDraw extends Frame implements Runnable{
	int x = 0;
	int y = 20;
	boolean xOrient, yOrient;
	public ThreadRectDraw(String title) {
		super(title);//여기가 게임 제목
		setSize(300,200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics gr) {//여기가 도형 출력하는 곳
		Random ran = new Random();
		Dimension d = this.getSize();//전체사이즈
		if (xOrient) {
			x--;
			if (x < 0) {
				x = 0;
				xOrient = false;
			}
		}else{
			x++;
			if (x >= d.width - 20) {//사각형 크기고려
				x = d.width - 20;
				xOrient = true;
			}
		}
		if (yOrient) {
			y--;
			if (y < 0) {
				y = 0;
				yOrient = false;
			}
		}else {
			y++;
			if (y >= d.height -20) {
				y = d.height -20;
				yOrient = true;
			}
		}
		
		int r = ran.nextInt(255);
		int g = ran.nextInt(255);
		int b = ran.nextInt(255);
		Color color = new Color(r,g,b);
		gr.setColor(color);
		gr.drawRect(x, y, 20, 20);//여기가 도형 사이즈 변경, 모앵변경 가능
//		gr.drawOval(x, y, 20, 20);//동그라미
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadRectDraw t = new ThreadRectDraw("ThreadEx");
		Thread thread = new Thread(t);
		thread.start();
	}
}
