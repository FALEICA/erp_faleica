package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import erp_faleica.models.User;
import erp_faleica.models.menu.EstruturaSistemaModel;


@ApplicationScoped
public class EstruturaSistemaDAO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String usu_Id = "usu_Id";
	private String usu_Cod = "usu_Cod";	
	private String cod_Modulo = "cod_Modulo";
	private String cod_Menu = "cod_Menu";
	private String cod_Componente = "cod_Componente";
	private String desc_Modulo = "desc_Modulo";
	private String desc_Menu = "desc_Menu";
	private String desc_Componente = "desc_Componente";
	private String sigla_Modulo = "sigla_Modulo";
	private String sigla_Menu = "sigla_Menu";
	private String sigla_Component = "sigla_Component";
	private String link_Modulo = "link_Modulo";
	private String link_Menu = "link_Menu";
	private String link_Componente = "link_Componente";
	private String link_Geral = "link_Geral";
	private String usc_Select = "usc_Select";
	private String usc_Insert = "usc_Insert";
	private String usc_Update = "usc_Update";
	private String usc_Delete = "usc_Delete";
	
	
	
	Connection daoConn = new ConexaoBancoDados().ConexaoMySQl();
	
	
	
	
	public List<EstruturaSistemaModel> getEstruturaSistema(User user) {
		String sqlTxt = "SELECT\r\n"
				+ "us.usu_Id,\r\n"
				+ "us.usu_Cod,\r\n"
				+ "ac.modulo_CodNumber as cod_Modulo,\r\n"
				+ "md.modulo_CodSigla as sigla_Modulo,\r\n"
				+ "md.modulo_Descricao as desc_Modulo,\r\n"
				+ "md.modulo_link as link_Modulo,\r\n"
				+ "ac.menu_CodNumber as cod_Menu,\r\n"
				+ "mn.menu_CodSigla as sigla_Menu,\r\n"
				+ "mn.menu_Desc as desc_Menu,\r\n"
				+ "mn.menu_Link as link_Menu,\r\n"
				+ "ac.compo_CodNumber as cod_Componente,\r\n"
				+ "cp.compo_CodSigla as sigla_Component,\r\n"
				+ "cp.compo_Descr as desc_Componente,\r\n"
				+ "cp.compo_Link as link_Componente,\r\n"
				+ "ac.usc_Select,\r\n"
				+ "ac.usc_Insert,\r\n"
				+ "ac.usc_Update,\r\n"
				+ "ac.usc_Delete,\r\n"
				+ "CONCAT('/erp_faleica/modulos/', md.modulo_link,\r\n"
				+ "            '/',\r\n"
				+ "            mn.menu_Link,\r\n"
				+ "            '/',\r\n"
				+ "            cp.compo_Link, \".xhtml\") as link_Geral\r\n"
				+ "\r\n"
				+ "FROM \r\n"
				+ "		erp_user us\r\n"
				+ "join	erp_user_acess ac on us.usu_Cod = ac.usu_Cod\r\n"
				+ "join	erp_modulos md on md.modulo_CodNumber = ac.modulo_CodNumber\r\n"
				+ "join	erp_menus mn on mn.menu_CodNumber = ac.menu_CodNumber\r\n"
				+ "join 	erp_componentes cp on cp.compo_CodNumber = ac.compo_CodNumber\r\n"
				+ "\r\n"
				+ "where\r\n"
				+ "us.usu_Cod = ?";
		
				
		
		try {
			
			
			
		 PreparedStatement ps = daoConn.prepareStatement(sqlTxt);
		 ps.setInt(1, user.getUsu_Cod());
		 ResultSet rs = ps.executeQuery();
		 
		 List<EstruturaSistemaModel> list = new ArrayList<>();
		 
		 while(rs.next()) {
			 EstruturaSistemaModel esm = new EstruturaSistemaModel();
			 esm.setUsu_Id(rs.getInt(usu_Id));
			 esm.setUsu_Cod(rs.getInt(usu_Cod));
			 esm.setCod_Modulo(rs.getInt(cod_Modulo));
			 esm.setCod_Menu(rs.getInt(cod_Menu));
			 esm.setCod_Componente(rs.getInt(cod_Componente));
			 esm.setDesc_Modulo(rs.getString(desc_Modulo));
			 esm.setDesc_Menu(rs.getString(desc_Menu));
			 esm.setDesc_Componente(rs.getString(desc_Componente));
			 esm.setSigla_Modulo(rs.getString(sigla_Modulo));
			 esm.setSigla_Menu(rs.getString(sigla_Menu));
			 esm.setSigla_Componente(rs.getString(sigla_Component));
			 esm.setLink_Modulo(rs.getString(link_Modulo));
			 esm.setLink_Menu(rs.getString(link_Menu));
			 esm.setLink_Componente(rs.getString(link_Componente));
			 esm.setLink_Geral(rs.getString(link_Geral));
			 esm.setUsc_Select(rs.getBoolean(usc_Select));
			 esm.setUsc_Insert(rs.getBoolean(usc_Insert));
			 esm.setUsc_Update(rs.getBoolean(usc_Update));
			 esm.setUsc_Delete(rs.getBoolean(usc_Delete));
			 list.add(esm); 	 
			 
		 }
		 
		 return list;
		 
		 
		 
		 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				daoConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		return new ArrayList<>();
		
	}
	
	
	
	/*
	public List<MenuModulos> getAllModulos(User user){
		String sqlTxt = "SELECT * FROM erp_faleica.erp_modulos;";
		
		try {
			
		 PreparedStatement ps = daoConn.prepareStatement(sqlTxt);
		 ResultSet rs = ps.executeQuery();
		 
		 List<MenuModulos> list = new ArrayList<>();
		 
		 while(rs.next()) {
			 MenuModulos mod = new MenuModulos();
			 mod.setModulo_Id(rs.getInt(modulo_Id));
			 mod.setModulo_CodNumber(rs.getInt(modulo_CodNumber));
			 mod.setModulo_CodSigla(rs.getString(modulo_CodSigla));
			 mod.setModulo_Descricao(rs.getString(modulo_Descricao));
			 mod.setModulo_link(rs.getString(modulo_link));
			 
			 list.add(mod); 	 
			 
		 }
		 
		 return list;
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				daoConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return new ArrayList<>();
	}
	*/

}
