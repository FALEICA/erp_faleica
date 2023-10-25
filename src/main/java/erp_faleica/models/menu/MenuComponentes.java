package erp_faleica.models.menu;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MenuComponentes implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer compo_Id;
	private Integer compo_CodNumber;
	private String compo_CodSigla;
	private String compo_Descr;
	private String compo_Link;
	private Integer menu_CodNumber;
	private Date dta_Incl;
	private Date dta_Alter;
	private Integer usu_Incl; 
	private Integer usu_Alter;
	
	public MenuComponentes() {
		// TODO Auto-generated constructor stub
	}

	public MenuComponentes(Integer compo_Id, Integer compo_CodNumber, String compo_CodSigla, String compo_Descr,
			String compo_Link, Integer menu_CodNumber, Date dta_Incl, Date dta_Alter, Integer usu_Incl,
			Integer usu_Alter) {
		super();
		this.compo_Id = compo_Id;
		this.compo_CodNumber = compo_CodNumber;
		this.compo_CodSigla = compo_CodSigla;
		this.compo_Descr = compo_Descr;
		this.compo_Link = compo_Link;
		this.menu_CodNumber = menu_CodNumber;
		this.dta_Incl = dta_Incl;
		this.dta_Alter = dta_Alter;
		this.usu_Incl = usu_Incl;
		this.usu_Alter = usu_Alter;
	}

	public Integer getCompo_Id() {
		return compo_Id;
	}

	public void setCompo_Id(Integer compo_Id) {
		this.compo_Id = compo_Id;
	}

	public Integer getCompo_CodNumber() {
		return compo_CodNumber;
	}

	public void setCompo_CodNumber(Integer compo_CodNumber) {
		this.compo_CodNumber = compo_CodNumber;
	}

	public String getCompo_CodSigla() {
		return compo_CodSigla;
	}

	public void setCompo_CodSigla(String compo_CodSigla) {
		this.compo_CodSigla = compo_CodSigla;
	}

	public String getCompo_Descr() {
		return compo_Descr;
	}

	public void setCompo_Descr(String compo_Descr) {
		this.compo_Descr = compo_Descr;
	}

	public String getCompo_Link() {
		return compo_Link;
	}

	public void setCompo_Link(String compo_Link) {
		this.compo_Link = compo_Link;
	}

	public Integer getMenu_CodNumber() {
		return menu_CodNumber;
	}

	public void setMenu_CodNumber(Integer menu_CodNumber) {
		this.menu_CodNumber = menu_CodNumber;
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
		return Objects.hash(compo_Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuComponentes other = (MenuComponentes) obj;
		return Objects.equals(compo_Id, other.compo_Id);
	}

	@Override
	public String toString() {
		return "MenuComponentes [compo_Id=" + compo_Id + ", compo_CodNumber=" + compo_CodNumber + ", compo_CodSigla="
				+ compo_CodSigla + ", compo_Descr=" + compo_Descr + ", compo_Link=" + compo_Link + ", menu_CodNumber="
				+ menu_CodNumber + ", dta_Incl=" + dta_Incl + ", dta_Alter=" + dta_Alter + ", usu_Incl=" + usu_Incl
				+ ", usu_Alter=" + usu_Alter + "]";
	}
	
	
	

}
