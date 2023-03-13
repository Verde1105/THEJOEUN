package Java_2023_03_13;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Java_2023_03_07.MenunIOEx;
//연습문제4 뉴파일 > 오픈파일 > 세이브파일 > 세이브에즈 > 탈출 실제로 열리도록 구현하기

public class 연습문제4 extends Frame implements ActionListener {

	public MenuBar mb;
	public Menu m;
	public MenuItem[] mi;
	public TextArea ta;
	public FileDialog fd_open, fd_save; 
	public String save_file;
	//public String save_filel
	public 연습문제4() {
		fd_open = new FileDialog(this,"파일 열기", FileDialog.LOAD);
		fd_save = new FileDialog(this,"파일 저장", FileDialog.SAVE);
		fd_save.setVisible(true);
		ta = new TextArea();
		ta.setEditable(false);
		mb = new MenuBar();
		m = new Menu("File");
		mi = new MenuItem[5];
		mi[0] = new MenuItem("New File");
		mi[1] = new MenuItem("Open File");
		mi[2] = new MenuItem("Save File");
		mi[3] = new MenuItem("Save As");
		mi[4] = new MenuItem("Exit");
		for(int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);
			if (i !=2 && i != (mi.length -1)) {
				
				m.addSeparator();
			}
		}
		mb.add(m);
		setMenuBar(mb);
		add(ta,"Center");
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MenunIOEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == mi[0]) {
			ta.setEditable(true);
			ta.setText("");
			setTitle("제목없음");
		}else if (o == mi[1]) {
			try {
			fd_open.setVisible(true);
			String open_file = fd_open.getDirectory() + fd_open.getFile();
			File fi = new File(open_file);
			FileReader fr = new FileReader(fi);
			BufferedReader br = new BufferedReader(fr);
			ta.setText("");
			while (br.ready()) {
				ta.append(br.readLine()+"\n");
			}
			br.close();
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}else if (o == mi[2]) {
		
		}else if (o == mi[3]) {
			try {
				fd_save.setVisible(true);
				String save_as_file = fd_save.getDirectory() + fd_save.getFile();
				File file = new File(save_as_file);
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(ta.getText());
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}else if (o == mi[4]) {
			System.exit(0);
		}
		
	}
}