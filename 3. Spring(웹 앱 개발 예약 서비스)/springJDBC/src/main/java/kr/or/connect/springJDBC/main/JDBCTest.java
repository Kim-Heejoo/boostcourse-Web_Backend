package kr.or.connect.springJDBC.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.springJDBC.config.ApplicationConfig;
import kr.or.connect.springJDBC.dao.RoleDao;
import kr.or.connect.springJDBC.dto.Role;

public class JDBCTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		role.setRoleId(600);
		role.setDescription("PROGRAMMER");
		
		int count = roleDao.insert(role);
		System.out.println(count + "건 입력하였습니다.");
			
		role.setDescription("PROGRAMMER22");
		count = roleDao.update(role);
		System.out.println(count +  "건 수정하였습니다.");
		
		
		Role resultRole = roleDao.selectById(201);
		System.out.println(resultRole);
				
		int deleteCount = roleDao.deleteById(500);
		System.out.println(deleteCount + "건 삭제하였습니다.");
			
		Role resultRole2 = roleDao.selectById(500);
		System.out.println(resultRole2);
	}

}