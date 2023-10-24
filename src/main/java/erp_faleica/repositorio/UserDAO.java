package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import erp_faleica.models.User;
import erp_faleica.models.messages.MensagensDoSistema;

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
	
	String msgOpenConn = "==== Conexao ABERTA com sucesso!!! ====";
	String msgCloseConn = ">>>> Conexao FECHADA com sucesso!!! <<<<";
	
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	ConexaoBancoDados cnn;
	
	@Inject
	MensagensDoSistema msg;
	
		
	
	public List<User> getUserAll() {
		Connection daoConn = cnn.ConexaoMySQl();
		PreparedStatement ps = null ;
		ResultSet rs = null;
		 
		String sqlTxt = "SELECT\r\n"
				+ "usu_Id,\r\n"
				+ "usu_Cod,\r\n"
				+ "usu_Login,\r\n"
				+ "usu_Email,\r\n"
				+ "usu_Senha\r\n"
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
				+ "usu_Senha\r\n"
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
				ps.setInt(5, user.getUsu_Id());
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
					+ "(null, ?, ?, ?, ?, now(), now(), 1, 1)";			
			try {
				ps = daoConn.prepareStatement(sqlTxt);
				ps.setInt(1, user.getUsu_Cod());
				ps.setString(2, user.getUsu_Login());
				ps.setString(3, user.getUsu_Email());
				ps.setString(4, user.getUsu_Senha());
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
