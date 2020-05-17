package cn.hcz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
//@ComponentScan("cn.hcz")
@EnableJpaRepositories("cn.hcz.Dao")
//jpa扫包范围
@SpringBootApplication
//@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class} )
@EntityScan("cn.hcz.Pojo")
@MapperScan("cn.hcz.Mapper")
//@EnableScheduling
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		/*int n=5;
		App a= new App();
		int s=a.foo(n);
		System.out.println(s);*/

	}
	int foo(int n){
		if(n<2){
			return n;
		}
		return foo(n-1)+foo(n-2);
	}
}
