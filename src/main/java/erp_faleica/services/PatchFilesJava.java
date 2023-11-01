package erp_faleica.services;

import java.io.File;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PatchFilesJava implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PatchFilesJava() {
		// TODO Auto-generated constructor stub
	}
	
	public String getPatchPakage() {
		String strPath = new File("").getAbsolutePath()+"\\erp_faleica\\system\\images";
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		if(folders != null) {
			System.out.println(path.getAbsolutePath());
			return strPath;
		}else {
			System.out.println("NAO EXISTE DIRETORIO! Criacao em andamento... "+strPath);
			boolean createSuccess = new File(strPath).mkdirs();
			if(createSuccess) {
				System.out.println("Diretorio criado com sucesso!");
				return strPath;
			}else {
				System.out.println("Nao foi possivel criar diretorio!!");
				return "";
			}
		}
	}

}
