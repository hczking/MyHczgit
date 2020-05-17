package cn.hcz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hcz.Dao.UserDao;
import cn.hcz.Mapper.UserMapper;
import cn.hcz.Pojo.User;
import cn.hcz.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value = "/update")
	public String UpdateUser(String name, Integer id) {
		userService.UpdateUser(name, id);
		return "success";
	}

	@RequestMapping(value = "/jpa")
	public User jpaUser(Integer id) {
		return userDao.getOne(id);
	}

	@RequestMapping(value = "/find")
	public User findUser(String name) {
		return userMapper.findByName(name);
	}
}
