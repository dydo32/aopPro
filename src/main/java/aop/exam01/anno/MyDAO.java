package aop.exam01.anno;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
//비지니스로직 - 핵심모듈
@Repository("mydao")
public class MyDAO implements DAO{

	@Override
	public ArrayList<UserVO> getUserList(UserVO vo) {
		System.out.println("MyDAO의 getUserList()");
		return null;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

}
