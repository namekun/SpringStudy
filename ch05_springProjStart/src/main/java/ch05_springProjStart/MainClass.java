package ch05_springProjStart;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// TransformationWork transformationWork = new TransformationWork();
		// transformationWork.move();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TransportationWalk transformationWork = ctx.getBean("tWalk", TransportationWalk.class);
		transformationWork.move();
		
		ctx.close();
	}
}
