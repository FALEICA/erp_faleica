package erp_faleica.applicationlocal;

import java.io.File;
import java.io.Serializable;

import erp_faleica.services.PatchFilesJava;

public class ApplicationTest implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		
			
			String strPath = new File("").getAbsolutePath()+"\\erpfaleica\\system\\images";
			
			File path = new File(strPath);
			
			File[] folders = path.listFiles(File::isDirectory);
			if(folders != null) {
				System.out.println(path.getAbsolutePath());
			}else {
				System.out.println("NAO EXISTE DIRETORIO! "+strPath);
				boolean createSuccess = new File(strPath).mkdirs();
				if(createSuccess) {
					System.out.println("Diretorio criado com sucesso!");
				}else {
					System.out.println("Nao foi possivel criar diretorio!!");
				}
			}
			
		
	}

}
