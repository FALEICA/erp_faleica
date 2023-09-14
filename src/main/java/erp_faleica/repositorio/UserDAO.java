package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erp_faleica.models.User;

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
	private Connection daoConn = new ConexaoBancoDados().ConexaoMySQl();
	
	
	
	
	
	public List<User> getUserAll() {
		
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
			System.out.println(msgOpenConn);
		 
		 
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
				System.out.println(msgCloseConn);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new ArrayList<>();
		
		
	}
	
	
	
	
	
	
	
	
	
	public String saveUser(User user) {
		
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
			return rowsAffecteds.toString()+" linhas foram afetadas";
			
			
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
		
		
		
		return "AVISO: nao houve linhas afetadas!!!!";
		
		
		
	}
	

}
