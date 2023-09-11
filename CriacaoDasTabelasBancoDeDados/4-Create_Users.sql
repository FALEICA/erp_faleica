
CREATE TABLE erp_user (
    usu_Id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
    usu_Cod INTEGER NOT NULL UNIQUE,
    usu_Login VARCHAR(100) NOT NULL UNIQUE,
    usu_Email VARCHAR(100) NOT NULL UNIQUE,
    usu_Senha VARCHAR(100) NOT NULL,
    dta_Incl DATETIME NOT NULL,
    dta_Alter DATETIME NOT NULL,
    usu_Incl INTEGER NOT NULL,
    usu_Alter INTEGER NOT NULL,
    primary key(usu_Id)
);



insert into erp_user values
(null, 159, 'fabio.leite', 'fabio.leite.cardoso@gmail.com', '123', now(), now(), 1, 1),
(null, 1, 'ceo', 'ceo@gmail.com', '123', now(), now(), 1, 1);