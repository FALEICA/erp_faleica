SELECT * 

FROM 
		erp_user us
join	erp_user_acess ac on us.usu_Cod = ac.usu_Cod
join	erp_modulos md on md.modulo_CodNumber = ac.compo_CodNumber
join	erp_menus mn on mn.menu_CodNumber = ac.menu_CodNumber
join 	erp_componentes cp on cp.compo_CodNumber = ac.compo_CodNumber

where
us.usu_Cod = 159