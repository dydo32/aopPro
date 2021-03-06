package aop.exam02.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClient {
	public static void main(String[] args) {
		ApplicationContext factory
		  = new ClassPathXmlApplicationContext("config/annoaop.xml");
		DAO dao  = (DAO)factory.getBean("userdao2");
		DAO dao2  = (DAO)factory.getBean("mydao2");
		UserVO vo =  new UserVO();
		dao.getUser(vo);
		dao.getUserList(vo);
		dao.addUser(vo);
		dao2.getUserList(vo);
		
	}
}
