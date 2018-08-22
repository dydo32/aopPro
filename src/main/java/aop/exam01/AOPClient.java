package aop.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClient {
	public static void main(String[] args) {
		ApplicationContext factory
		  = new  ClassPathXmlApplicationContext("config/aopconfig01.xml");
		DAO dao  = (DAO)factory.getBean("dao");
		UserVO vo =  new UserVO();
		dao.getUser(vo);
		dao.getUserList(vo);
		dao.addUser(vo);
		

	}

}
