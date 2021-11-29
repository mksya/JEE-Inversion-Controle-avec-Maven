package launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.IBusiness;


public class LaunchWithSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext(("config.xml"));
		IBusiness business=(IBusiness) ctx.getBean("business");
		System.out.println(business.calcul());

	}

}
