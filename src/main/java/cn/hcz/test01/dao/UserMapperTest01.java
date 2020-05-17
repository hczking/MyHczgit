package cn.hcz.test01.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.hcz.Pojo.User;

public interface UserMapperTest01 {
	@Select("SELECT * FROM USERS WHERE NAME = #{name}")
	User findByName(@Param("name") String name);

	@Insert("INSERT INTO USERS(ID,USERNAME) VALUES(#{ID}, #{name})")
	int insert(@Param("name") String name, @Param("id") Integer id);
}
