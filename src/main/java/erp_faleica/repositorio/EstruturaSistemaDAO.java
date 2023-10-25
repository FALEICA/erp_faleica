package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import erp_faleica.models.EstruturaSistemaModel;
import erp_faleica.models.User;
import erp_faleica.models.menu.MenuModulos;


@ApplicationScoped
public class EstruturaSistemaDAO implements Serializable {
	
	private String modulo_Id = "modulo_Id" ; 
	private String modulo_CodNumber = "modulo_CodNumber";
	private String modulo_CodSigla = "modulo_CodSigla"; 
	private String modulo_Descricao = "modulo_Descricao";
	private String modulo_link = "modulo_link";
	private String dta_Incl = "dta_Incl";
	private String dta_Alter = "dta_Alter"; 
	private String usu_Incl = "usu_Incl"; 
	private String usu_Alter = "usu_Alter";
	
	private static final long serialVersionUID = 1L;
	
	
	
	Connection daoConn = new ConexaoBancoDados().ConexaoMySQl();
	
	
	
	
	public List<EstruturaSistemaModel> getEstruturaSistema() {
		String sqlTxt = "SELECT \r\n"
				+ "    md.modulo_CodNumber,\r\n"
				+ "    md.modulo_Descricao,\r\n"
				+ "    mn.menu_CodNumber,\r\n"
				+ "    mn.menu_Desc,\r\n"
				+ "    cp.compo_CodNumber,\r\n"
				+ "    cp.compo_Descr,\r\n"
				+ "    md.modulo_CodSigla,\r\n"
				+ "    mn.menu_CodSigla,\r\n"
				+ "    cp.compo_CodSigla,\r\n"
				+ "    md.modulo_link,\r\n"
				+ "    mn.menu_Link,\r\n"
				+ "    cp.compo_Link,\r\n"
				+ "    CONCAT('/erp_faleica/modulos/', md.modulo_link,\r\n"
				+ "            '/',\r\n"
				+ "            mn.menu_Link,\r\n"
				+ "            '/',\r\n"
				+ "            cp.compo_Link, \".xhtml\") AS LinkGeral\r\n"
				+ "FROM\r\n"
				+ "    erp_modulos md\r\n"
				+ "        JOIN\r\n"
				+ "    erp_menus mn ON md.modulo_CodNumber = mn.modulo_CodNumber\r\n"
				+ "        JOIN\r\n"
				+ "    erp_componentes cp ON mn.menu_CodNumber = cp.menu_CodNumber ";
		
				
		
		try {
			
		 PreparedStatement ps = daoConn.prepareStatement(sqlTxt);
		 ResultSet rs = ps.executeQuery();
		 
		 List<EstruturaSistemaModel> list = new ArrayList<>();
		 
		 while(rs.next()) {
			 EstruturaSistemaModel esm = new EstruturaSistemaModel();
			 esm.setCod_Modulo(rs.getInt("modulo_CodNumber"));
			 esm.setCod_Menu(rs.getInt("menu_CodNumber"));
			 esm.setCod_Componente(rs.getInt("compo_CodNumber"));
			 esm.setDesc_Modulo(rs.getString("modulo_Descricao"));
			 esm.setDesc_Menu(rs.getString("menu_Desc"));
			 esm.setDesc_Componente(rs.getString("compo_Descr"));
			 esm.setSigla_Modulo(rs.getString("modulo_CodSigla"));
			 esm.setSigla_Menu(rs.getString("menu_CodSigla"));
			 esm.setSigla_Componente(rs.getString("compo_CodSigla"));
			 esm.setLink_Modulo(rs.getString("modulo_link"));
			 esm.setLink_Menu(rs.getString("menu_Link"));
			 esm.setLink_Componente(rs.getString("compo_Link"));
			 esm.setLink_Geral(rs.getString("LinkGeral"));
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
	

}
