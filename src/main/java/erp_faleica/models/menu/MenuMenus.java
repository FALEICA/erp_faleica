package erp_faleica.models.menu;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MenuMenus implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer menu_Id;
	private Integer menu_CodNumber;
	private String  menu_CodSigla; 
	private String menu_Desc;
	private String menu_Link;
	private Integer modulo_CodNumber; 
	private Date dta_Incl; 
	private Date dta_Alter; 
	private Integer usu_Incl; 
	private Integer usu_Alter;
	
	public MenuMenus() {
		// TODO Auto-generated constructor stub
	}

	public MenuMenus(Integer menu_Id, Integer menu_CodNumber, String menu_CodSigla, String menu_Desc, String menu_Link,
			Integer modulo_CodNumber, Date dta_Incl, Date dta_Alter, Integer usu_Incl, Integer usu_Alter) {
		super();
		this.menu_Id = menu_Id;
		this.menu_CodNumber = menu_CodNumber;
		this.menu_CodSigla = menu_CodSigla;
		this.menu_Desc = menu_Desc;
		this.menu_Link = menu_Link;
		this.modulo_CodNumber = modulo_CodNumber;
		this.dta_Incl = dta_Incl;
		this.dta_Alter = dta_Alter;
		this.usu_Incl = usu_Incl;
		this.usu_Alter = usu_Alter;
	}

	public Integer getMenu_Id() {
		return menu_Id;
	}

	public void setMenu_Id(Integer menu_Id) {
		this.menu_Id = menu_Id;
	}

	public Integer getMenu_CodNumber() {
		return menu_CodNumber;
	}

	public void setMenu_CodNumber(Integer menu_CodNumber) {
		this.menu_CodNumber = menu_CodNumber;
	}

	public String getMenu_CodSigla() {
		return menu_CodSigla;
	}

	public void setMenu_CodSigla(String menu_CodSigla) {
		this.menu_CodSigla = menu_CodSigla;
	}

	public String getMenu_Desc() {
		return menu_Desc;
	}

	public void setMenu_Desc(String menu_Desc) {
		this.menu_Desc = menu_Desc;
	}

	public String getMenu_Link() {
		return menu_Link;
	}

	public void setMenu_Link(String menu_Link) {
		this.menu_Link = menu_Link;
	}

	public Integer getModulo_CodNumber() {
		return modulo_CodNumber;
	}

	public void setModulo_CodNumber(Integer modulo_CodNumber) {
		this.modulo_CodNumber = modulo_CodNumber;
	}

	public Date getDta_Incl() {
		return dta_Incl;
	}

	public void setDta_Incl(Date dta_Incl) {
		this.dta_Incl = dta_Incl;
	}

	public Date getDta_Alter() {
		return dta_Alter;
	}

	public void setDta_Alter(Date dta_Alter) {
		this.dta_Alter = dta_Alter;
	}

	public Integer getUsu_Incl() {
		return usu_Incl;
	}

	public void setUsu_Incl(Integer usu_Incl) {
		this.usu_Incl = usu_Incl;
	}

	public Integer getUsu_Alter() {
		return usu_Alter;
	}

	public void setUsu_Alter(Integer usu_Alter) {
		this.usu_Alter = usu_Alter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu_Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuMenus other = (MenuMenus) obj;
		return Objects.equals(menu_Id, other.menu_Id);
	}

	@Override
	public String toString() {
		return "MenuMenus [menu_Id=" + menu_Id + ", menu_CodNumber=" + menu_CodNumber + ", menu_CodSigla="
				+ menu_CodSigla + ", menu_Desc=" + menu_Desc + ", menu_Link=" + menu_Link + ", modulo_CodNumber="
				+ modulo_CodNumber + ", dta_Incl=" + dta_Incl + ", dta_Alter=" + dta_Alter + ", usu_Incl=" + usu_Incl
				+ ", usu_Alter=" + usu_Alter + "]";
	}
	
	

}
