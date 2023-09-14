package erp_faleica.applicationlocal;

import java.io.Serializable;

import erp_faleica.models.User;
import erp_faleica.repositorio.UserDAO;

public class ApplicationTest implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		UserDAO userdao = new UserDAO();
		UserDAO userdao2 = new UserDAO();
		User us1 = new User();
		us1.setUsu_Cod(996);
		us1.setUsu_Login("usutester02");
		us1.setUsu_Email("usutester02@gmail.com");
		us1.setUsu_Senha("1234");
		
		
		System.out.println(userdao.saveUser(us1));
		
		System.out.println(userdao2.getUserAll());
		
		
		
		
		

	}

}
