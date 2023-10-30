package erp_faleica.controllers;

import java.awt.MenuComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import erp_faleica.models.User;
import erp_faleica.models.UserAccess;
import erp_faleica.models.menu.MenuMenus;
import erp_faleica.models.menu.MenuModulos;
import erp_faleica.models.messages.MensagensDoSistema;
import erp_faleica.repositorio.UserDAO;

@Named(value = "cadUserBean")
@RequestScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private	static User newUser = new User();
	private static User selectedUser;
	private static MenuModulos modulos;
	private static MenuMenus menus;
	private static MenuComponent componentes;
	private List<User> listUser;
	private static List<UserAccess> userAcess;
	
	
	@Inject
	UserDAO userdao;
	
	
	
	
	public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }
	
	public List<UserAccess> getUserAcess() {
		if(selectedUser.getUsu_Cod() != null) {
			CadastroUsuarioBean.userAcess = userdao.getUserAccess(selectedUser);
		} else {
			CadastroUsuarioBean.userAcess = new  ArrayList<UserAccess>();
		}
		return userAcess;
	}
	
	public void setUserAcess(List<UserAccess> userAcess) {
		CadastroUsuarioBean.userAcess = userAcess;
	}
	
	public List<User> getListUser() {
		this.listUser = userdao.getUserAll();
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public User getSelectedUser() {		
		return selectedUser;
	}
	

	public static MenuModulos getModulos() {
		return modulos;
	}


	public static void setModulos(MenuModulos modulos) {
		CadastroUsuarioBean.modulos = modulos;
	}


	public static MenuMenus getMenus() {
		return menus;
	}


	public static void setMenus(MenuMenus menus) {
		CadastroUsuarioBean.menus = menus;
	}


	public static MenuComponent getComponentes() {
		return componentes;
	}


	public static void setComponentes(MenuComponent componentes) {
		CadastroUsuarioBean.componentes = componentes;
	}
	
	public static User getNewUser() {
		return newUser;
	}

	public static void setNewUser(User newUser) {
		CadastroUsuarioBean.newUser = newUser;
	}

	public void setSelectedUser(User selectedUser) {
		CadastroUsuarioBean.selectedUser = selectedUser;
	}
	
	public void saveUser() {
		System.out.println("Entrou no saveUser");
		if(selectedUser.getUsu_Id() == null) {
			selectedUser.setUsu_Id(0);
		}
		MensagensDoSistema msg = userdao.saveUser(selectedUser);
		if(msg.getTypeMessage() == 1) {
			addMessage(FacesMessage.SEVERITY_INFO, "SUCESSO!", msg.getWriteMessage());
		}
		if(msg.getTypeMessage() == 2) {
			addMessage(FacesMessage.SEVERITY_WARN, "ATENCÃO!", msg.getWriteMessage());
			
		}
		if(msg.getTypeMessage() == 3) {
			addMessage(FacesMessage.SEVERITY_ERROR, "ERRO!", msg.getWriteMessage());
		}
		
		PrimeFaces.current().ajax().update("form:messages", "form:dt_iduser");
	}
	
	
	
	
	public void openNew() {
		
		if(newUser.getUsu_img() == null) {
			System.out.println("entrou em openNew");
			CadastroUsuarioBean.newUser.setUsu_img("../Users/fabio/Desktop/erpfaleica/system/images/Fabio.jpg");
			System.out.println("SEM IMAGEM: "+newUser.getUsu_img());
		}else {
			System.out.println("COM IMAGEM: "+newUser.getUsu_img());
		}
		
		
		CadastroUsuarioBean.selectedUser = CadastroUsuarioBean.newUser;
	
		
	}
	
	
	
	
	public void deleteItem() {
		System.out.println("Passei aqui no deleteItem");
		if(selectedUser.getUsu_Id() != null && selectedUser.getUsu_Cod() != null) {
			String message = userdao.deleteUser(selectedUser);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
			PrimeFaces.current().ajax().update("form:messages", "form:dt_iduser");
		}
		
	}

	

}
