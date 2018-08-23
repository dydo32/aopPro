package aop.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClient {
	public static void main(String[] args) {
		ApplicationContext factory
		  = new ClassPathXmlApplicationContext("config/aopconfig02.xml");
		DAO dao  = (DAO)factory.getBean("dao");
		DAO dao2  = (DAO)factory.getBean("dao2");
		UserVO vo =  new UserVO();
		dao.getUser(vo);
		dao.getUserList(vo);
		dao.addUser(vo);
		dao2.getUserList(vo);
		
	}
}
