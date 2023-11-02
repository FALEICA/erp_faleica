package erp_faleica.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class FileReaderTxt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String readArchive(String txtPath) {
		String fullTxt = "";
		String line = "";
		
		try (BufferedReader buffRead = new BufferedReader(new FileReader(txtPath))) {
			while(true) {
				if(line != null) {
					fullTxt = fullTxt+line;
					
				}else break;
				
				try {
					line = buffRead.readLine();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			return fullTxt;
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado no caminho: "+e.getMessage());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return "";
	}

}
