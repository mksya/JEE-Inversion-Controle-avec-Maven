package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		//Version WebService
		
		System.out.println("version web service");
		double data=12;
		return data;
	}

}
