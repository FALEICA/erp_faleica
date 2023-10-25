package erp_faleica.controllers;

import java.io.Serializable;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuColumn;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import erp_faleica.models.User;
import erp_faleica.models.menu.EstruturaSistemaModel;
import erp_faleica.repositorio.EstruturaSistemaDAO;


@Named(value = "menuBean")
@RequestScoped
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private MenuModel model;
	
	
	EstruturaSistemaDAO estDao = new EstruturaSistemaDAO();
	
	public MenuBean() {
	
		model = new DefaultMenuModel();
		User user = new User();
		user.setUsu_Cod(102);
		
		for (EstruturaSistemaModel estmodel : estDao.getEstruturaSistema(user)) {
			
			
			
			DefaultSubMenu firstsubmenu = DefaultSubMenu.builder()
					.label(estmodel.getDesc_Modulo())
					.build();
			
			DefaultMenuColumn menucol = DefaultMenuColumn.builder()
					.build();
			
			DefaultSubMenu secondsubmenu = DefaultSubMenu.builder()
					.label(estmodel.getDesc_Menu())
					.build();
			
			DefaultMenuItem itens = DefaultMenuItem.builder()
					.value(estmodel.getDesc_Componente())
					.url(estmodel.getLink_Geral())
					.build();
			
			secondsubmenu.getElements().add(itens);
			menucol.getElements().add(secondsubmenu);
			firstsubmenu.getElements().add(menucol);
			
			model.getElements().add(firstsubmenu);
		}
		
		
			
		
			
		
	}
	
	public MenuModel getModel() {
		return model;
	}

	
	
	
	
	
	
	
	

}
