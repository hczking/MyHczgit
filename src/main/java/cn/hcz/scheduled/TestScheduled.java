package cn.hcz.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduled {
	@Scheduled(fixedRate = 3000)
	public void test() {
		System.out.println("我叫王大锤");
	}
}
