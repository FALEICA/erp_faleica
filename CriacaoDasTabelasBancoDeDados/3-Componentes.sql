CREATE TABLE erp_componentes (
    compo_Id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
    compo_CodNumber INTEGER NOT NULL UNIQUE,
    compo_CodSigla VARCHAR(10) NOT NULL UNIQUE,
    compo_Descr VARCHAR(255) NOT NULL UNIQUE,
    compo_Link VARCHAR(255) NOT NULL UNIQUE,
    menu_CodNumber INTEGER NOT NULL,
    dta_Incl DATETIME NOT NULL,
    dta_Alter DATETIME NOT NULL,
    usu_Incl INTEGER NOT NULL,
    usu_Alter INTEGER NOT NULL,
    PRIMARY KEY (compo_Id),
    FOREIGN KEY (menu_CodNumber)
        REFERENCES erp_menus (menu_CodNumber)
);



insert into erp_componentes values
(null, 1, 'SYSCMP001', 'Cadastro de Usuarios', 'syscmp001cadastrousuarios', 1, now(), now(), 1, 1),
(null, 2, 'PESCMP001', 'Cadastro de Pessoas', 'pescmp001cadastropessoas', 3, now(), now(), 1, 1),
(null, 3, 'PESCMP002', 'Cadastro de Curriculos', 'pescmp002cadastrocurriculos', 3, now(), now(), 1, 1),
(null, 4, 'PRDCMP001', 'Cadastro de Produtos', 'prdcmp001cadastroprodutos', 4, now(), now(), 1, 1);