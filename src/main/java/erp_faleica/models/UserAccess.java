package erp_faleica.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class UserAccess implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private	Integer	usu_Id	;
	private	Integer	usu_Cod	;
	private	Integer	cod_Modulo	;
	private	String	sigla_Modulo	;
	private	String	desc_Modulo	;
	private	String	link_Modulo	;
	private	Integer	cod_Menu	;
	private	String	sigla_Menu	;
	private	String	desc_Menu	;
	private	String	link_Menu	;
	private	Integer	cod_Componente	;
	private	String	sigla_Component	;
	private	String	desc_Componente	;
	private	String	link_Componente	;
	private	Boolean	usc_Select	;
	private	Boolean	usc_Insert	;
	private	Boolean	usc_Update	;
	private	Boolean	usc_Delete	;
	private	String	link_Geral	;

	
	public UserAccess() {
		// TODO Auto-generated constructor stub
	}


	public UserAccess(Integer usu_Id, Integer usu_Cod, Integer cod_Modulo, String sigla_Modulo, String desc_Modulo,
			String link_Modulo, Integer cod_Menu, String sigla_Menu, String desc_Menu, String link_Menu,
			Integer cod_Componente, String sigla_Component, String desc_Componente, String link_Componente,
			Boolean usc_Select, Boolean usc_Insert, Boolean usc_Update, Boolean usc_Delete, String link_Geral) {
		super();
		this.usu_Id = usu_Id;
		this.usu_Cod = usu_Cod;
		this.cod_Modulo = cod_Modulo;
		this.sigla_Modulo = sigla_Modulo;
		this.desc_Modulo = desc_Modulo;
		this.link_Modulo = link_Modulo;
		this.cod_Menu = cod_Menu;
		this.sigla_Menu = sigla_Menu;
		this.desc_Menu = desc_Menu;
		this.link_Menu = link_Menu;
		this.cod_Componente = cod_Componente;
		this.sigla_Component = sigla_Component;
		this.desc_Componente = desc_Componente;
		this.link_Componente = link_Componente;
		this.usc_Select = usc_Select;
		this.usc_Insert = usc_Insert;
		this.usc_Update = usc_Update;
		this.usc_Delete = usc_Delete;
		this.link_Geral = link_Geral;
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


	public Integer getCod_Modulo() {
		return cod_Modulo;
	}


	public void setCod_Modulo(Integer cod_Modulo) {
		this.cod_Modulo = cod_Modulo;
	}


	public String getSigla_Modulo() {
		return sigla_Modulo;
	}


	public void setSigla_Modulo(String sigla_Modulo) {
		this.sigla_Modulo = sigla_Modulo;
	}


	public String getDesc_Modulo() {
		return desc_Modulo;
	}


	public void setDesc_Modulo(String desc_Modulo) {
		this.desc_Modulo = desc_Modulo;
	}


	public String getLink_Modulo() {
		return link_Modulo;
	}


	public void setLink_Modulo(String link_Modulo) {
		this.link_Modulo = link_Modulo;
	}


	public Integer getCod_Menu() {
		return cod_Menu;
	}


	public void setCod_Menu(Integer cod_Menu) {
		this.cod_Menu = cod_Menu;
	}


	public String getSigla_Menu() {
		return sigla_Menu;
	}


	public void setSigla_Menu(String sigla_Menu) {
		this.sigla_Menu = sigla_Menu;
	}


	public String getDesc_Menu() {
		return desc_Menu;
	}


	public void setDesc_Menu(String desc_Menu) {
		this.desc_Menu = desc_Menu;
	}


	public String getLink_Menu() {
		return link_Menu;
	}


	public void setLink_Menu(String link_Menu) {
		this.link_Menu = link_Menu;
	}


	public Integer getCod_Componente() {
		return cod_Componente;
	}


	public void setCod_Componente(Integer cod_Componente) {
		this.cod_Componente = cod_Componente;
	}


	public String getSigla_Component() {
		return sigla_Component;
	}


	public void setSigla_Component(String sigla_Component) {
		this.sigla_Component = sigla_Component;
	}


	public String getDesc_Componente() {
		return desc_Componente;
	}


	public void setDesc_Componente(String desc_Componente) {
		this.desc_Componente = desc_Componente;
	}


	public String getLink_Componente() {
		return link_Componente;
	}


	public void setLink_Componente(String link_Componente) {
		this.link_Componente = link_Componente;
	}


	public Boolean getUsc_Select() {
		return usc_Select;
	}


	public void setUsc_Select(Boolean usc_Select) {
		this.usc_Select = usc_Select;
	}


	public Boolean getUsc_Insert() {
		return usc_Insert;
	}


	public void setUsc_Insert(Boolean usc_Insert) {
		this.usc_Insert = usc_Insert;
	}


	public Boolean getUsc_Update() {
		return usc_Update;
	}


	public void setUsc_Update(Boolean usc_Update) {
		this.usc_Update = usc_Update;
	}


	public Boolean getUsc_Delete() {
		return usc_Delete;
	}


	public void setUsc_Delete(Boolean usc_Delete) {
		this.usc_Delete = usc_Delete;
	}


	public String getLink_Geral() {
		return link_Geral;
	}


	public void setLink_Geral(String link_Geral) {
		this.link_Geral = link_Geral;
	}


	@Override
	public String toString() {
		return "UserAccess [usu_Id=" + usu_Id + ", usu_Cod=" + usu_Cod + ", cod_Modulo=" + cod_Modulo
				+ ", sigla_Modulo=" + sigla_Modulo + ", desc_Modulo=" + desc_Modulo + ", link_Modulo=" + link_Modulo
				+ ", cod_Menu=" + cod_Menu + ", sigla_Menu=" + sigla_Menu + ", desc_Menu=" + desc_Menu + ", link_Menu="
				+ link_Menu + ", cod_Componente=" + cod_Componente + ", sigla_Component=" + sigla_Component
				+ ", desc_Componente=" + desc_Componente + ", link_Componente=" + link_Componente + ", usc_Select="
				+ usc_Select + ", usc_Insert=" + usc_Insert + ", usc_Update=" + usc_Update + ", usc_Delete="
				+ usc_Delete + ", link_Geral=" + link_Geral + "]";
	}


	

}
