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
	
	private List<User> users;
	private User selectedUser;
	private List<User> selectedUsers;
	
	
	
	
	

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		UserDAO usdao = new UserDAO();
		return usdao.getUserAll();
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * @return the selectedUser
	 */
	public User getSelectedUser() {
		return selectedUser;
	}

	/**
	 * @param selectedUser the selectedUser to set
	 */
	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

	/**
	 * @return the selectedUsers
	 */
	public List<User> getSelectedUsers() {
		return selectedUsers;
	}

	/**
	 * @param selectedUsers the selectedUsers to set
	 */
	public void setSelectedUsers(List<User> selectedUsers) {
		this.selectedUsers = selectedUsers;
	}
	
	
	
	

}
