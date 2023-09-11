CREATE TABLE erp_menus (
    menu_Id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
    menu_CodNumber INTEGER NOT NULL UNIQUE,
    menu_CodSigla VARCHAR(10) NOT NULL UNIQUE,
    menu_Desc VARCHAR(255) NOT NULL UNIQUE,
    menu_Link VARCHAR(255) NOT NULL UNIQUE,
    modulo_CodNumber INTEGER NOT NULL,
    dta_Incl DATETIME NOT NULL,
    dta_Alter DATETIME NOT NULL,
    usu_Incl INTEGER NOT NULL,
    usu_Alter INTEGER NOT NULL,
    PRIMARY KEY (menu_Id),
    FOREIGN KEY (modulo_CodNumber)
        REFERENCES erp_modulos (modulo_CodNumber)
);



insert into erp_menus values
(null, 1, 'SYSCAD', 'Sistema Cadastros', 'cadastros', 1, now(), now(), 1, 1),
(null, 2, 'SYSEST', 'Sistema Estrutura', 'estrutura', 1, now(), now(), 1, 1),
(null, 3, 'PESCAD', 'Pessoas Cadastros', 'cadpessoas', 2, now(), now(), 1, 1),
(null, 4, 'PRDCAD', 'Produtos Cadastros', 'cadprodutos', 7, now(), now(), 1, 1);




