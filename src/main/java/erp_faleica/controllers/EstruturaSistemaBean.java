package erp_faleica.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import erp_faleica.models.User;
import erp_faleica.models.menu.EstruturaSistemaModel;
import erp_faleica.repositorio.EstruturaSistemaDAO;

@Named(value = "estSisBean")
@ViewScoped
public class EstruturaSistemaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EstruturaSistemaModel estsismodel = new EstruturaSistemaModel();
	
	public EstruturaSistemaModel getEstruturaSistemaModel() {
		return estsismodel;
		
	}
	
	
	public void salvar() {
		System.out.println("Teste: ");
	}
	
	
	public List<EstruturaSistemaModel> getFindAll(){
		EstruturaSistemaDAO estDao = new EstruturaSistemaDAO();
		User user = new User();
		List<EstruturaSistemaModel> list = estDao.getEstruturaSistema(user);
		return list;
		
	}
	
	
	
	

}
