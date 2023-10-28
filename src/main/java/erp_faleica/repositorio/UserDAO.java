package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import erp_faleica.models.User;
import erp_faleica.models.UserAccess;
import erp_faleica.models.messages.MensagensDoSistema;


@ApplicationScoped
public class UserDAO implements Serializable {
	
	String usu_Id = "usu_Id";
	String usu_Cod = "usu_Cod";
	String usu_Login = "usu_Login";
	String usu_Email = "usu_Email";
	String usu_Senha = "usu_Senha";
	String dta_Incl = "dta_Incl";
	String dta_Alter = "dta_Alter";
	String usu_Incl = "usu_Incl";
	String usu_Alter = "usu_Alter";	
	String	cod_Modulo	= "cod_Modulo";
	String	sigla_Modulo = "sigla_Modulo";
	String	desc_Modulo	=	"desc_Modulo";
	String	link_Modulo	=	"link_Modulo";
	String	cod_Menu	=	"cod_Menu";
	String	sigla_Menu	=	"sigla_Menu";
	String	desc_Menu	=	"desc_Menu";
	String	link_Menu	=	"link_Menu";
	String	cod_Componente	=	"cod_Componente";
	String	sigla_Component	=	"sigla_Component";
	String	desc_Componente	=	"desc_Componente";
	String	link_Componente	=	"link_Componente";
	String	usc_Select	=	"usc_Select";
	String	usc_Insert	=	"usc_Insert";
	String	usc_Update	=	"usc_Update";
	String	usc_Delete	=	"usc_Delete";
	String	link_Geral	=	"link_Geral";
	String 	usu_img = "usu_img";

	
	
	String msgOpenConn = "==== Conexao ABERTA com sucesso!!! ====";
	String msgCloseConn = ">>>> Conexao FECHADA com sucesso!!! <<<<";
	
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	ConexaoBancoDados cnn;
	
	@Inject
	MensagensDoSistema msg;
	
	
	
	
	public List<UserAccess> getUserAccess(User user) {
		Connection daoConn = cnn.ConexaoMySQl();
		PreparedStatement ps = null ;
		ResultSet rs = null;
		 
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
				+ "us.usu_Cod = ?;";	
				
		
		try {
			ps = daoConn.prepareStatement(sqlTxt);
			ps.setInt(1, user.getUsu_Cod());
			rs = ps.executeQuery();		 
		 
		 List<UserAccess> list = new ArrayList<>();
		 
		 while(rs.next()) {
			 UserAccess access = new UserAccess();
			 	access.setUsu_Id(rs.getInt(usu_Id));
			 	access.setUsu_Cod(rs.getInt(usu_Cod));
			 	access.setCod_Modulo(rs.getInt(cod_Modulo));
			 	access.setSigla_Modulo(rs.getString(sigla_Modulo));
			 	access.setDesc_Modulo(rs.getString(desc_Modulo));
			 	access.setLink_Modulo(rs.getString(link_Modulo));
			 	access.setCod_Menu(rs.getInt(cod_Menu));
			 	access.setSigla_Menu(rs.getString(sigla_Menu));
			 	access.setDesc_Menu(rs.getString(desc_Menu));
			 	access.setLink_Menu(rs.getString(link_Menu));
			 	access.setCod_Componente(rs.getInt(cod_Componente));
			 	access.setSigla_Component(rs.getString(sigla_Component));
			 	access.setDesc_Componente(rs.getString(desc_Componente));
			 	access.setLink_Componente(rs.getString(link_Componente));
			 	access.setUsc_Select(rs.getBoolean(usc_Select));
			 	access.setUsc_Insert(rs.getBoolean(usc_Insert));
			 	access.setUsc_Update(rs.getBoolean(usc_Update));
			 	access.setUsc_Delete(rs.getBoolean(usc_Delete));
			 	access.setLink_Geral(rs.getString(link_Geral));
			 list.add(access); 	 
			 
		 }
		 
		 return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				daoConn.close();
				//System.out.println(msgCloseConn);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new ArrayList<>();
		
		
	}
		
	
	public List<User> getUserAll() {
		Connection daoConn = cnn.ConexaoMySQl();
		PreparedStatement ps = null ;
		ResultSet rs = null;
		 
		String sqlTxt = "SELECT\r\n"
				+ "usu_Id,\r\n"
				+ "usu_Cod,\r\n"
				+ "usu_Login,\r\n"
				+ "usu_Email,\r\n"
				+ "usu_Senha,\r\n"
				+ "usu_img\r\n"
				+ "FROM erp_faleica.erp_user;";	
				
		
		try {
			ps = daoConn.prepareStatement(sqlTxt);
			rs = ps.executeQuery();
			//System.out.println(msgOpenConn);
		 
		 
		 List<User> list = new ArrayList<>();
		 
		 while(rs.next()) {
			 User user = new User();
			 user.setUsu_Id(rs.getInt(usu_Id));
			 user.setUsu_Cod(rs.getInt(usu_Cod));
			 user.setUsu_Login(rs.getString(usu_Login));
			 user.setUsu_Email(rs.getString(usu_Email));
			 user.setUsu_Senha(rs.getString(usu_Senha));
			 user.setUsu_img(rs.getString(usu_img));
			 
			 list.add(user); 	 
			 
		 }
		 
		 return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				daoConn.close();
				//System.out.println(msgCloseConn);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new ArrayList<>();
		
		
	}
	
	
	public User findById(Integer findUsuId) {
		Connection daoConn = cnn.ConexaoMySQl();
		PreparedStatement ps = null ;
		ResultSet rs = null;
		 
		String sqlTxt = "SELECT\r\n"
				+ "usu_Id,\r\n"
				+ "usu_Cod,\r\n"
				+ "usu_Login,\r\n"
				+ "usu_Email,\r\n"
				+ "usu_Senha,\r\n"
				+ "usu_img\r\n"
				+ "FROM erp_faleica.erp_user "
				+ "WHERE usu_Id = "+findUsuId+";";	
				
		
		try {
			ps = daoConn.prepareStatement(sqlTxt);
			rs = ps.executeQuery();
			//System.out.println(msgOpenConn);
		 
		
		User user = new User();
		
		 while(rs.next()) {			 
			 user.setUsu_Id(rs.getInt(usu_Id));
			 user.setUsu_Cod(rs.getInt(usu_Cod));
			 user.setUsu_Login(rs.getString(usu_Login));
			 user.setUsu_Email(rs.getString(usu_Email));
			 user.setUsu_Senha(rs.getString(usu_Senha));
			 user.setUsu_img(rs.getString(usu_img));
			 
		 }
		 
		 return user;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				daoConn.close();
				//System.out.println(msgCloseConn);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new User();
		
		
	}
	
		
	public MensagensDoSistema saveUser(User user) {
		Connection daoConn = cnn.ConexaoMySQl();
		
		String txtMessage = "";
		
		
		if(findById(user.getUsu_Id()).getUsu_Id() != null) {
			System.out.println(user.getUsu_Id().toString()+" "
					+ " : usuario encontrado, vou ALTERAR " + user.toString());
			
			PreparedStatement ps = null ;
			String sqlTxt = "update erp_user \r\n"
					+ "set \r\n"
					+ "	usu_Cod = ?, \r\n"
					+ "    usu_Login = ?, \r\n"
					+ "    usu_Email = ?, \r\n"
					+ "    usu_Senha = ?,\r\n"
					+ "    usu_img = ?,\r\n"
					+ "    dta_Alter = now(),\r\n"
					+ "    usu_Alter = 1\r\n"
					+ "\r\n"
					+ "where\r\n"
					+ "	usu_Id = ?;";			
			try {
				ps = daoConn.prepareStatement(sqlTxt);
				ps.setInt(1, user.getUsu_Cod());
				ps.setString(2, user.getUsu_Login());
				ps.setString(3, user.getUsu_Email());
				ps.setString(4, user.getUsu_Senha());
				ps.setString(5, user.getUsu_img());
				ps.setInt(6, user.getUsu_Id());
				Integer rowsAffecteds =  ps.executeUpdate();
				txtMessage = ("DONE! "+rowsAffecteds.toString()+" linhas foram ALTERADAS com sucesso!");
				System.out.println(txtMessage);
				
				msg.setTypeMessage(1);
				msg.setWriteMessage(txtMessage);
				return msg;
				
			}catch (SQLIntegrityConstraintViolationException e) {
				txtMessage = e.getMessage();
				msg.setTypeMessage(3);
				msg.setWriteMessage(txtMessage);				
				System.out.println(txtMessage);
				return msg;
				
			} catch (SQLException e) {
				txtMessage = e.getMessage();
				msg.setTypeMessage(3);
				msg.setWriteMessage(txtMessage);				
				System.out.println(txtMessage);
				return msg;
							
				
			}finally {
				try {
					ps.close();
					daoConn.close();
					
				} catch (SQLException e) {
					txtMessage = e.getMessage();
					msg.setTypeMessage(3);
					msg.setWriteMessage(txtMessage);				
					System.out.println(txtMessage);
					return msg;
				}
				
			}
			
			
			
		}else {
			System.out.println(user.getUsu_Id().toString()+" "
					+ " : nao encontrei o ID no banco, vou INSERIR um novo registro" + user.toString());
			
			
			PreparedStatement ps = null ;
			String sqlTxt = "insert into erp_user values\r\n"
					+ "(null, ?, ?, ?, ?, ?, now(), now(), 1, 1)";			
			try {
				ps = daoConn.prepareStatement(sqlTxt);
				ps.setInt(1, user.getUsu_Cod());
				ps.setString(2, user.getUsu_Login());
				ps.setString(3, user.getUsu_Email());
				ps.setString(4, user.getUsu_Senha());
				ps.setString(5, user.getUsu_img());
				Integer rowsAffecteds =  ps.executeUpdate();
				txtMessage = ("DONE! "+rowsAffecteds.toString()+" linhas foram INSERIDAS com sucesso!");
				System.out.println(txtMessage);
				msg.setTypeMessage(1);
				msg.setWriteMessage(txtMessage);				
				return msg;
				
			}catch(SQLIntegrityConstraintViolationException e) {	
				txtMessage = "ATENÇÃO!: Dados do usuario ja existem: " + e.getMessage();
				msg.setTypeMessage(3);
				msg.setWriteMessage(txtMessage);
				return msg;
			} catch (SQLException e) {
				txtMessage = "ERROR!: " + e.getMessage();
				msg.setTypeMessage(3);
				msg.setWriteMessage(txtMessage);
				return msg;
				
			}finally {
				try {
					ps.close();
					daoConn.close();
					
				} catch (SQLException e) {
					txtMessage = "ERROR!: " + e.getMessage();
					msg.setTypeMessage(3);
					msg.setWriteMessage(txtMessage);
					return msg;
					
				}
				
			}
		}
		
		
	}
	
	
	public String deleteUser(User user) {
		Connection daoConn = cnn.ConexaoMySQl();
		String message = "Nenhum ID foi encontrado, nehum registro foi excluido!";
		if(user.getUsu_Id() != null) {
			
			PreparedStatement ps = null ;
			String sqlTxt = "delete from erp_user where usu_Id = ? and usu_Cod = ?";			
			try {
				ps = daoConn.prepareStatement(sqlTxt);
				ps.setInt(1, user.getUsu_Id());
				ps.setInt(2, user.getUsu_Cod());
				Integer rowsAffecteds =  ps.executeUpdate();
				message = ("DONE! "+rowsAffecteds.toString()+" linhas foram EXCLUIDA(s) com sucesso!");
				System.out.println(message);
				return message;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					ps.close();
					daoConn.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		return message;
		
	}
	

}
