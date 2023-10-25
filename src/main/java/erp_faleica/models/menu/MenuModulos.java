package erp_faleica.models.menu;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MenuModulos implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer modulo_Id; 
	private Integer modulo_CodNumber;
	private String modulo_CodSigla; 
	private String modulo_Descricao;
	private String modulo_link;
	private Date dta_Incl;
	private Date dta_Alter; 
	private Integer usu_Incl; 
	private Integer usu_Alter;
	
	public MenuModulos() {
		// TODO Auto-generated constructor stub
	}

	public MenuModulos(Integer modulo_Id, Integer modulo_CodNumber, String modulo_CodSigla, String modulo_Descricao,
			String modulo_link, Date dta_Incl, Date dta_Alter, Integer usu_Incl, Integer usu_Alter) {
		super();
		this.modulo_Id = modulo_Id;
		this.modulo_CodNumber = modulo_CodNumber;
		this.modulo_CodSigla = modulo_CodSigla;
		this.modulo_Descricao = modulo_Descricao;
		this.modulo_link = modulo_link;
		this.dta_Incl = dta_Incl;
		this.dta_Alter = dta_Alter;
		this.usu_Incl = usu_Incl;
		this.usu_Alter = usu_Alter;
	}

	public Integer getModulo_Id() {
		return modulo_Id;
	}

	public void setModulo_Id(Integer modulo_Id) {
		this.modulo_Id = modulo_Id;
	}

	public Integer getModulo_CodNumber() {
		return modulo_CodNumber;
	}

	public void setModulo_CodNumber(Integer modulo_CodNumber) {
		this.modulo_CodNumber = modulo_CodNumber;
	}

	public String getModulo_CodSigla() {
		return modulo_CodSigla;
	}

	public void setModulo_CodSigla(String modulo_CodSigla) {
		this.modulo_CodSigla = modulo_CodSigla;
	}

	public String getModulo_Descricao() {
		return modulo_Descricao;
	}

	public void setModulo_Descricao(String modulo_Descricao) {
		this.modulo_Descricao = modulo_Descricao;
	}

	public String getModulo_link() {
		return modulo_link;
	}

	public void setModulo_link(String modulo_link) {
		this.modulo_link = modulo_link;
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
		return Objects.hash(modulo_Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuModulos other = (MenuModulos) obj;
		return Objects.equals(modulo_Id, other.modulo_Id);
	}

	@Override
	public String toString() {
		return "MenuModulos [modulo_Id=" + modulo_Id + ", modulo_CodNumber=" + modulo_CodNumber + ", modulo_CodSigla="
				+ modulo_CodSigla + ", modulo_Descricao=" + modulo_Descricao + ", modulo_link=" + modulo_link
				+ ", dta_Incl=" + dta_Incl + ", dta_Alter=" + dta_Alter + ", usu_Incl=" + usu_Incl + ", usu_Alter="
				+ usu_Alter + "]";
	}
	
	
	
	

}
