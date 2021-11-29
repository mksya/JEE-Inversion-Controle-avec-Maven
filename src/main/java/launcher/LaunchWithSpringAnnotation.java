package launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import business.IBusiness;

public class LaunchWithSpringAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext("dao","business");
		IBusiness business=ctx.getBean(IBusiness.class);
		System.out.println(business.calcul());
	}

}
