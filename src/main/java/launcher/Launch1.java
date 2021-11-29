package launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import business.BusinessImpl;
import business.IBusiness;
import dao.DaoImpl;
import dao.IDao;

public class Launch1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Injection des dépendances par instanciation statique
		
		/*DaoImpl dao=new DaoImpl();
		BusinessImpl business =new BusinessImpl();
		business.setDao(dao);
		System.out.println(business.calcul());
		*/
		
		Scanner scanner=new Scanner(new File("config.txt"));
		
			String daoClassName=scanner.nextLine();
			Class cDao=Class.forName(daoClassName);
			IDao dao=(IDao) cDao.newInstance();
	
			
			String businessClassName=scanner.nextLine();
			Class cBusiness=Class.forName(businessClassName);
			IBusiness business= (IBusiness) cBusiness.newInstance();
			
			Method m=cBusiness.getMethod("setDao", IDao.class);
			m.invoke(business,dao);
			
			System.out.println(business.calcul());
		
		
	}

}
