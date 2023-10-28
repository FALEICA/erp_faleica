package erp_faleica.controllers;

import java.io.Serializable;

import javax.faces.bean.RequestScoped;
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
	private Integer contModulo = 0;
	private Integer contMenu = 0;
	private Integer contcomp = 0;
	
	
	public MenuBean() {
	
		model = new DefaultMenuModel();
		User user = new User();
		user.setUsu_Cod(159);
		
		for (EstruturaSistemaModel modulo : new EstruturaSistemaDAO().getModulos(user)) {
			
			if(modulo.getCod_Modulo() != contModulo) {
				DefaultSubMenu firstsubmenu = DefaultSubMenu.builder()
						.label(modulo.getDesc_Modulo())
						.build();
				DefaultMenuColumn menucol = DefaultMenuColumn.builder()
						.build();
				firstsubmenu.getElements().add(menucol);
				
				
						for (EstruturaSistemaModel menu : new  EstruturaSistemaDAO().getMenus(user, modulo.getCod_Modulo())){
							
							if(menu.getCod_Menu() != contMenu) {
								DefaultSubMenu secondsubmenu = DefaultSubMenu.builder()
										.label(menu.getDesc_Menu())
										.build();
								menucol.getElements().add(secondsubmenu);							
								
								
								for(EstruturaSistemaModel comp : new EstruturaSistemaDAO().getComponentes(user, menu.getCod_Modulo(), menu.getCod_Menu())) {
																		
									if(comp.getCod_Componente() != contcomp) {
										DefaultMenuItem itens = DefaultMenuItem.builder()
												.value(comp.getDesc_Componente())
												.url(comp.getLink_Geral())
												.build();
										secondsubmenu.getElements().add(itens);
										
										
										contcomp = comp.getCod_Componente();
									}						
								}
							contMenu = menu.getCod_Menu();
							}
						}
			contModulo = modulo.getCod_Modulo();
			model.getElements().add(firstsubmenu);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
			
		
			
		
	}
	
	public MenuModel getModel() {
		return model;
	}

	
	
	
	
	
	
	
	

}
