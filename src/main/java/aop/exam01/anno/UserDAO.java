package aop.exam01.anno;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

//비지니스로직 - 핵심모듈(core concern)
@Repository("userdao")
public class UserDAO implements DAO {
	public ArrayList<UserVO> getUserList(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### getUserList()#####");
		System.out.println("########################");
		return null;
	}
	public UserVO getUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### getUser()    #####");
		System.out.println("########################");
		return null;
	}
	public void addUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### addUser()    #####");
		System.out.println("########################");
	}	
	public void deleteUser(UserVO vo) {
		System.out.println("########################");
		System.out.println("##### deleteUser() #####");
		System.out.println("########################");
	}
}
