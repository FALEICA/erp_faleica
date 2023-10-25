package erp_faleica.applicationlocal;

import java.io.Serializable;

import erp_faleica.models.User;
import erp_faleica.models.menu.MenuModulos;
import erp_faleica.repositorio.EstruturaSistemaDAO;

public class ApplicationTest implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
			
		EstruturaSistemaDAO dao = new EstruturaSistemaDAO();
		User user = new User();
		
		for (MenuModulos	model : dao.getAllModulos(user)) {
			System.out.println(model.getModulo_Descricao());
			
		}		

	}

}
