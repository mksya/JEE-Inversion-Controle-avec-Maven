package business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

@Service("business")
public class BusinessImpl implements IBusiness {
	
	//Couplage faible
	@Autowired
	private IDao dao=null;

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double d = dao.getData();
		double res=d*23;
		return res;
	}


	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection des dépendances");
	}
	
	public void init() {
		System.out.println("Initialisation de BusinessImpl");
	}
	
	public BusinessImpl() {
		System.out.println("Instanciation de business");
	}

	
}
