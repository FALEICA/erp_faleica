USE erp_faleica;
SELECT
us.usu_Id,
us.usu_Cod,
ac.modulo_CodNumber as cod_Modulo,
md.modulo_CodSigla as sigla_Modulo,
md.modulo_Descricao as desc_Modulo,
md.modulo_link as link_Modulo,
ac.menu_CodNumber as cod_Menu,
mn.menu_CodSigla as sigla_Menu,
mn.menu_Desc as desc_Menu,
mn.menu_Link as link_Menu,
ac.compo_CodNumber as cod_Componente,
cp.compo_CodSigla as sigla_Component,
cp.compo_Descr as desc_Componente,
cp.compo_Link as link_Componente,
ac.usc_Select,
ac.usc_Insert,
ac.usc_Update,
ac.usc_Delete,
CONCAT('/erp_faleica/modulos/', md.modulo_link,
            '/',
            mn.menu_Link,
            '/',
            cp.compo_Link, ".xhtml") as link_Geral

FROM 
		erp_user us
join	erp_user_acess ac on us.usu_Cod = ac.usu_Cod
join	erp_modulos md on md.modulo_CodNumber = ac.modulo_CodNumber
join	erp_menus mn on mn.menu_CodNumber = ac.menu_CodNumber
join 	erp_componentes cp on cp.compo_CodNumber = ac.compo_CodNumber

where
us.usu_Cod = 159;