package ch06_makeAnotherProj;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportaionWalk transformationWork = ctx.getBean("tWalk", TransportaionWalk.class);
		transformationWork.move();

		// 사용한 자원의 반납.
		ctx.close();
	}
}
