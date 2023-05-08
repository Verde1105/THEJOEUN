package Java_2023_03_14;

import java.net.ServerSocket;
import java.util.Vector;

public class ChatServer {
	private Vector handlers;
	
	public ChatServer(int port) {
		try {
			ServerSocket server = new ServerSocket(port);
			handlers = new Vector<>();
			System.out.println("ChatServer is ready");
			while (true) {
				ChatHandler바꿔보기 handler = new ChatHandler바꿔보기(this, server.accept());
				handler.start();
			}
		} catch (Exception e) {}
	}
	public Object getHandler(int index) {
		return handlers.elementAt(index);
	}
	public void register(ChatHandler바꿔보기 c) {
		handlers.addElement(c);
	}
	public void unregister(Object o) {
		handlers.removeElement(o);
	}
	public void broadcast(String message) {
		synchronized (handlers) {
			int n = handlers.size();
			for (int i = 0; i < n; i++) {
				ChatHandler바꿔보기 c = (ChatHandler바꿔보기) handlers.elementAt(i);
				try {
					c.println(message);
				} catch (Exception e) {	}
			}
		}	
	}
	
	public static void main(String[] args) {
		new ChatServer(7979);
	}
}


