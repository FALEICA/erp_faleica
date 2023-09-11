package erp_faleica.models;

import java.io.Serializable;

public class EstruturaSistemaModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer cod_Modulo;
	private Integer cod_Menu;
	private Integer cod_Componente;
	private String desc_Modulo;
	private String desc_Menu;
	private String desc_Componente;
	private String sigla_Modulo;
	private String sigla_Menu;
	private String sigla_Componente;
	private String link_Modulo;
	private String link_Menu;
	private String link_Componente;
	private String link_Geral;
	
	
	public EstruturaSistemaModel() {
		
	}


	public EstruturaSistemaModel(Integer cod_Modulo, Integer cod_Menu, Integer cod_Componente, String desc_Modulo,
			String desc_Menu, String desc_Componente, String sigla_Modulo, String sigla_Menu, String sigla_Componente,
			String link_Modulo, String link_Menu, String link_Componente, String link_Geral) {
		super();
		this.cod_Modulo = cod_Modulo;
		this.cod_Menu = cod_Menu;
		this.cod_Componente = cod_Componente;
		this.desc_Modulo = desc_Modulo;
		this.desc_Menu = desc_Menu;
		this.desc_Componente = desc_Componente;
		this.sigla_Modulo = sigla_Modulo;
		this.sigla_Menu = sigla_Menu;
		this.sigla_Componente = sigla_Componente;
		this.link_Modulo = link_Modulo;
		this.link_Menu = link_Menu;
		this.link_Componente = link_Componente;
		this.link_Geral = link_Geral;
	}


	public Integer getCod_Modulo() {
		return cod_Modulo;
	}


	public void setCod_Modulo(Integer cod_Modulo) {
		this.cod_Modulo = cod_Modulo;
	}


	public Integer getCod_Menu() {
		return cod_Menu;
	}


	public void setCod_Menu(Integer cod_Menu) {
		this.cod_Menu = cod_Menu;
	}


	public Integer getCod_Componente() {
		return cod_Componente;
	}


	public void setCod_Componente(Integer cod_Componente) {
		this.cod_Componente = cod_Componente;
	}


	public String getDesc_Modulo() {
		return desc_Modulo;
	}


	public void setDesc_Modulo(String desc_Modulo) {
		this.desc_Modulo = desc_Modulo;
	}


	public String getDesc_Menu() {
		return desc_Menu;
	}


	public void setDesc_Menu(String desc_Menu) {
		this.desc_Menu = desc_Menu;
	}


	public String getDesc_Componente() {
		return desc_Componente;
	}


	public void setDesc_Componente(String desc_Componente) {
		this.desc_Componente = desc_Componente;
	}


	public String getSigla_Modulo() {
		return sigla_Modulo;
	}


	public void setSigla_Modulo(String sigla_Modulo) {
		this.sigla_Modulo = sigla_Modulo;
	}


	public String getSigla_Menu() {
		return sigla_Menu;
	}


	public void setSigla_Menu(String sigla_Menu) {
		this.sigla_Menu = sigla_Menu;
	}


	public String getSigla_Componente() {
		return sigla_Componente;
	}


	public void setSigla_Componente(String sigla_Componente) {
		this.sigla_Componente = sigla_Componente;
	}


	public String getLink_Modulo() {
		return link_Modulo;
	}


	public void setLink_Modulo(String link_Modulo) {
		this.link_Modulo = link_Modulo;
	}


	public String getLink_Menu() {
		return link_Menu;
	}


	public void setLink_Menu(String link_Menu) {
		this.link_Menu = link_Menu;
	}


	public String getLink_Componente() {
		return link_Componente;
	}


	public void setLink_Componente(String link_Componente) {
		this.link_Componente = link_Componente;
	}


	public String getLink_Geral() {
		return link_Geral;
	}


	public void setLink_Geral(String link_Geral) {
		this.link_Geral = link_Geral;
	}


	@Override
	public String toString() {
		return "Model_Sistema_Estrutura [cod_Modulo=" + cod_Modulo + ", cod_Menu=" + cod_Menu + ", cod_Componente="
				+ cod_Componente + ", desc_Modulo=" + desc_Modulo + ", desc_Menu=" + desc_Menu + ", desc_Componente="
				+ desc_Componente + ", sigla_Modulo=" + sigla_Modulo + ", sigla_Menu=" + sigla_Menu
				+ ", sigla_Componente=" + sigla_Componente + ", link_Modulo=" + link_Modulo + ", link_Menu=" + link_Menu
				+ ", link_Componente=" + link_Componente + ", link_Geral=" + link_Geral + "]";
	}
	
	
	
	
	
	
	

}
