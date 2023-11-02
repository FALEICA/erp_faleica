package erp_faleica.repositorio;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.enterprise.context.ApplicationScoped;

import erp_faleica.services.ErpStartConfigsService;

@ApplicationScoped
public class ConexaoBancoDados implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	private Connection conn;
	
	public ConexaoBancoDados() {
		
	}
	
	
	public Connection ConexaoMySQl() {
		ErpStartConfigsService erpStart = new ErpStartConfigsService();	
		String ip = erpStart.getStartConfi().getSgbdIP();
		String porta = erpStart.getStartConfi().getSgbdPORT();
		
		System.out.println("IP/PORTA: "+ip+":"+porta);
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			
			
			this.conn = DriverManager.getConnection(
										
					"jdbc:mysql://"+ip+":"+porta+"/erp_faleica?useSSL=FALSE&serverTimezone=UTC", 
					"developer",
					"#$Iptw3tko");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return this.conn;
		
	}
	
	

}
