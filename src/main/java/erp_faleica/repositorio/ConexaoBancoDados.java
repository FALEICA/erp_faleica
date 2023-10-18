package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	
	public ConexaoBancoDados() {
		
	}
	
	
	public Connection ConexaoMySQl() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			
			
			this.conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.1.10:3306/erp_faleica?useSSL=FALSE&serverTimezone=UTC", 
					"developer",
					"#$Iptw3tko");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return this.conn;
		
	}
	
	

}
