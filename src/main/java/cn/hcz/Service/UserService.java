package cn.hcz.Service;

import cn.hcz.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserDao userdao;

	public UserService() {
	}

	public void UpdateUser(String name, Integer id) {
		System.out.println("ssss");
		jdbcTemplate.update("UPDATE smbms_user SET username = ? WHERE id = ?",
				name, id);
	}
}
