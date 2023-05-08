package thejoeun.Servlet2023_04_19;

import java.nio.file.FileSystem;

import org.apache.catalina.core.*;

public class MessageMain {
	public static void main(String[] args) {
	/*
		MessageBean bean = new MessageBeanKr();
		bean.sayHello("spring");
		bean = new MessageBeanEn();
		bean.sayHello("spring");
	 */
	
	ApplicationContext factory = new FileSystemXmlApplicationContext("beans.xml");
	MessageBean bean = factory.getBean("messageBean",MessageBeanEn.class);
	bean.sayHello("spring");
	MessageBean beanKr=factory.getBean("messageBean",MessageBeanKr.class);
	beanKr.sayHello("spring");
	
	}
}
