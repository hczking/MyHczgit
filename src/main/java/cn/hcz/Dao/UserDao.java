package cn.hcz.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.hcz.Pojo.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}
