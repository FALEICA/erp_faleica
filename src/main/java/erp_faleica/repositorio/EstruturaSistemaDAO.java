package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erp_faleica.models.EstruturaSistemaModel;

public class EstruturaSistemaDAO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Connection daoConn = new ConexaoBancoDados().ConexaoMySQl();
	
	
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
				+ "    CONCAT(md.modulo_link,\r\n"
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
		}
		
		
		
		
		return new ArrayList<>();
		
	}
	

}
