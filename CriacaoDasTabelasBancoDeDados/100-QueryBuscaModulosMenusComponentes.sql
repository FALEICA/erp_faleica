SELECT 
    md.modulo_CodNumber,
    md.modulo_Descricao,
    mn.menu_CodNumber,
    mn.menu_Desc,
    cp.compo_CodNumber,
    cp.compo_Descr,
    md.modulo_CodSigla,
    mn.menu_CodSigla,
    cp.compo_CodSigla,
    md.modulo_link,
    mn.menu_Link,
    cp.compo_Link,
    CONCAT('/erp_faleica/modulos/', md.modulo_link,
            '/',
            mn.menu_Link,
            '/',
            cp.compo_Link, ".xhtml") AS Link
FROM
    erp_modulos md
        JOIN
    erp_menus mn ON md.modulo_CodNumber = mn.modulo_CodNumber
        JOIN
    erp_componentes cp ON mn.menu_CodNumber = cp.menu_CodNumber

