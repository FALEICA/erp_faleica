package erp_faleica.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class UserAccess implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private Integer usc_Id;
	private Integer usu_CodNumber;
	private Integer modulo_CodNumber;
	private Integer menu_CodNumber;
	private Integer compo_CodNumber;
	private Date dta_Incl;
	private Date dta_Alter;
	private Integer usu_Incl;
	private Integer usu_Alter;
	
	
	public UserAccess() {
		
		
	}


	public UserAccess(Integer usc_Id, Integer usu_CodNumber, Integer modulo_CodNumber, Integer menu_CodNumber,
			Integer compo_CodNumber, Date dta_Incl, Date dta_Alter, Integer usu_Incl, Integer usu_Alter) {
		super();
		this.usc_Id = usc_Id;
		this.usu_CodNumber = usu_CodNumber;
		this.modulo_CodNumber = modulo_CodNumber;
		this.menu_CodNumber = menu_CodNumber;
		this.compo_CodNumber = compo_CodNumber;
		this.dta_Incl = dta_Incl;
		this.dta_Alter = dta_Alter;
		this.usu_Incl = usu_Incl;
		this.usu_Alter = usu_Alter;
	}


	public Integer getUsc_Id() {
		return usc_Id;
	}


	public void setUsc_Id(Integer usc_Id) {
		this.usc_Id = usc_Id;
	}


	public Integer getUsu_CodNumber() {
		return usu_CodNumber;
	}


	public void setUsu_CodNumber(Integer usu_CodNumber) {
		this.usu_CodNumber = usu_CodNumber;
	}


	public Integer getModulo_CodNumber() {
		return modulo_CodNumber;
	}


	public void setModulo_CodNumber(Integer modulo_CodNumber) {
		this.modulo_CodNumber = modulo_CodNumber;
	}


	public Integer getMenu_CodNumber() {
		return menu_CodNumber;
	}


	public void setMenu_CodNumber(Integer menu_CodNumber) {
		this.menu_CodNumber = menu_CodNumber;
	}


	public Integer getCompo_CodNumber() {
		return compo_CodNumber;
	}


	public void setCompo_CodNumber(Integer compo_CodNumber) {
		this.compo_CodNumber = compo_CodNumber;
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
		return Objects.hash(usc_Id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccess other = (UserAccess) obj;
		return Objects.equals(usc_Id, other.usc_Id);
	}


	@Override
	public String toString() {
		return "UserAccess [usc_Id=" + usc_Id + ", usu_CodNumber=" + usu_CodNumber + ", modulo_CodNumber="
				+ modulo_CodNumber + ", menu_CodNumber=" + menu_CodNumber + ", compo_CodNumber=" + compo_CodNumber
				+ ", dta_Incl=" + dta_Incl + ", dta_Alter=" + dta_Alter + ", usu_Incl=" + usu_Incl + ", usu_Alter="
				+ usu_Alter + "]";
	}
	
	
	

}
