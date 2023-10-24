package erp_faleica.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import erp_faleica.models.User;
import erp_faleica.models.messages.MensagensDoSistema;
import erp_faleica.repositorio.UserDAO;

@Named(value = "cadUserBean")
@RequestScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private static User selectedUser;	
	private List<User> listUser;
	
	
	@Inject
	UserDAO userdao;

	public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
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
			addMessage(FacesMessage.SEVERITY_INFO, "ERROR!", msg.getWriteMessage());
		}
		if(msg.getTypeMessage() == 2) {
			addMessage(FacesMessage.SEVERITY_WARN, "ERROR!", msg.getWriteMessage());
			
		}
		if(msg.getTypeMessage() == 3) {
			addMessage(FacesMessage.SEVERITY_ERROR, "ERROR!", msg.getWriteMessage());
		}
		
		PrimeFaces.current().ajax().update("form:messages", "form:dt_iduser");
	}
	
	
	
	public void openNew() {
		CadastroUsuarioBean.selectedUser = new User();
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
