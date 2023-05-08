package Java_2023_03_17;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemListener;

import com.sun.media.sound.Toolkit;

public class ImageEx extends Frame implements ItemListener, Appendable{
	
	Image im;
	String pi = "H:\\STS3";//이미지가 존재하는 주소
	
	public img(String str) {
		super(str);
		init();
		start();
		this.setLocation(100,100);//프레임 시작 위치
		super.setVisible(true);//실제로 프레임을 화면에 출력
		super.setSize(400,400);//프레임의 처음 크기
		super.setResizable(true);//프레임 사이즈 조절
		
		im = Toolkit.getDefaultToolkit().getImage(pic);
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(img,0,0,this);
	}
	
}
