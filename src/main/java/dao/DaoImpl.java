package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		//je me connecte à la bdd
		double data=98;
		return data;
	}
	
	public void init() {
		System.out.println("Instanciation de DaoImpl");
	}

}
