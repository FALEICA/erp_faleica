CREATE TABLE erp_modulos (
    modulo_Id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
    modulo_CodNumber INTEGER NOT NULL UNIQUE,
    modulo_CodSigla VARCHAR(10) NOT NULL UNIQUE,
    modulo_Descricao VARCHAR(255) NOT NULL UNIQUE,
    modulo_link VARCHAR(255) NOT NULL UNIQUE,
    dta_Incl DATETIME NOT NULL,
    dta_Alter DATETIME NOT NULL,
    usu_Incl INTEGER NOT NULL,
    usu_Alter INTEGER NOT NULL,
    PRIMARY KEY (modulo_Id)
);



insert into erp_modulos values
(null, 1, 'SYS', 'SISTEMA','sistema', now(), now(), 1, 1),
(null, 2, 'PES', 'PESSOAS', 'pessoas', now(), now(), 1, 1),
(null, 3, 'FIS', 'FISCAL', 'fiscal', now(), now(), 1, 1),
(null, 4, 'FIN', 'FINANCEIRO', 'financeiro', now(), now(), 1, 1),
(null, 5, 'CTB', 'CONTABILIDADE', 'contabil', now(), now(), 1, 1),
(null, 6, 'SUP', 'SUPRIMENTOS', 'suprimentos', now(), now(), 1, 1),
(null, 7, 'PRD', 'PRODUTOS', 'produtos', now(), now(), 1, 1);





