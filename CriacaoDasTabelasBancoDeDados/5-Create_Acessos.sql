create table erp_faleica.erp_user_acess(
usu_Cod int not null, 
modulo_CodNumber int not null, 
menu_CodNumber int not null, 
compo_CodNumber int not null,
usc_Select boolean not null, 
usc_Insert boolean not null, 
usc_Update boolean not null, 
usc_Delete boolean not null,
usu_Incl int not null, 
usu_Alter int not null,
dta_Incl datetime not null, 
dta_Alter datetime not null,
constraint PK_UsuModMnuCom primary key (usu_Cod, modulo_CodNumber, menu_CodNumber, compo_CodNumber),
constraint FK_Modulo foreign key(modulo_CodNumber) references erp_modulos(modulo_CodNumber),
constraint FK_Menu foreign key(menu_CodNumber) references erp_menus(menu_CodNumber),
constraint FK_Componente foreign key(compo_CodNumber) references erp_componentes(compo_CodNumber)
);

SELECT * FROM erp_faleica.erp_user_acess;


