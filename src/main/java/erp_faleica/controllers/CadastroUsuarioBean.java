package erp_faleica.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import erp_faleica.models.User;
import erp_faleica.repositorio.UserDAO;

@Named(value = "cadUserBean")
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	
	private User user = new User();
	private UserDAO userDao;
	
	
	
	public void saveUser() {
		userDao = new UserDAO();
		userDao.saveUser(user);		
	}
	
	public User getUser() {
		return user;
	}
	
	public List<User> getAllUsers(){
		userDao = new UserDAO();
		 return userDao.getUserAll();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
