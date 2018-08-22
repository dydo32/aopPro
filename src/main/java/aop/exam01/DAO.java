package aop.exam01;

import java.util.ArrayList;

public interface DAO {
	public ArrayList<UserVO> getUserList(UserVO vo);
	public UserVO getUser(UserVO vo);
	public void addUser(UserVO vo);
	public void deleteUser(UserVO vo);
}
