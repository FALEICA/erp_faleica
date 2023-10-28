package erp_faleica.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer usu_Id;
	private Integer usu_Cod;
	private String usu_Login;
	private String usu_Email;
	private String usu_Senha;
	private Date dta_Incl;
	private Date dta_Alter;
	private Integer usu_Incl;
	private Integer usu_Alter;
	private String usu_img;
		
	
	public User() {
		
	}


	public User(Integer usu_Id, Integer usu_Cod, String usu_Login, String usu_Email, String usu_Senha, Date dta_Incl,
			Date dta_Alter, Integer usu_Incl, Integer usu_Alter, String usu_img) {
		super();
		this.usu_Id = usu_Id;
		this.usu_Cod = usu_Cod;
		this.usu_Login = usu_Login;
		this.usu_Email = usu_Email;
		this.usu_Senha = usu_Senha;
		this.dta_Incl = dta_Incl;
		this.dta_Alter = dta_Alter;
		this.usu_Incl = usu_Incl;
		this.usu_Alter = usu_Alter;
		this.usu_img = usu_img;
	}


	public Integer getUsu_Id() {
		return usu_Id;
	}


	public void setUsu_Id(Integer usu_Id) {
		this.usu_Id = usu_Id;
	}


	public Integer getUsu_Cod() {
		return usu_Cod;
	}


	public void setUsu_Cod(Integer usu_Cod) {
		this.usu_Cod = usu_Cod;
	}


	public String getUsu_Login() {
		return usu_Login;
	}


	public void setUsu_Login(String usu_Login) {
		this.usu_Login = usu_Login;
	}


	public String getUsu_Email() {
		return usu_Email;
	}


	public void setUsu_Email(String usu_Email) {
		this.usu_Email = usu_Email;
	}


	public String getUsu_Senha() {
		return usu_Senha;
	}


	public void setUsu_Senha(String usu_Senha) {
		this.usu_Senha = usu_Senha;
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


	public String getUsu_img() {
		return usu_img;
	}


	public void setUsu_img(String usu_img) {
		this.usu_img = usu_img;
	}


	@Override
	public int hashCode() {
		return Objects.hash(usu_Cod, usu_Id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(usu_Cod, other.usu_Cod) && Objects.equals(usu_Id, other.usu_Id);
	}


	@Override
	public String toString() {
		return "User [usu_Id=" + usu_Id + ", usu_Cod=" + usu_Cod + ", usu_Login=" + usu_Login + ", usu_Email="
				+ usu_Email + ", usu_Senha=" + usu_Senha + ", dta_Incl=" + dta_Incl + ", dta_Alter=" + dta_Alter
				+ ", usu_Incl=" + usu_Incl + ", usu_Alter=" + usu_Alter + ", usu_img=" + usu_img + "]";
	}
	
		
	
	

}
