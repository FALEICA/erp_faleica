package erp_faleica.applicationlocal;

import java.io.Serializable;

import erp_faleica.models.User;
import erp_faleica.repositorio.UserDAO;

public class ApplicationTest implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
			
		User us = new User();
		us.setUsu_Cod(159);
		
		UserDAO usdao = new UserDAO();
		
		System.out.println(usdao.getUserAll());
	}

}
