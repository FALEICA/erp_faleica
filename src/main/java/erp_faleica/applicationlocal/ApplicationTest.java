package erp_faleica.applicationlocal;

import java.io.File;
import java.io.Serializable;

import com.google.gson.Gson;

import erp_faleica.models.ErpStartConfigsModel;
import erp_faleica.services.FileReaderTxt;

public class ApplicationTest implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		File file = new File("X:\\ProjetosJavaWeb2023\\erp_faleica\\src\\main\\java\\erp_faleica\\config\\erpstartconfigs.txt");
		FileReaderTxt fr = new FileReaderTxt();
		ErpStartConfigsModel obj = new Gson().fromJson(
				fr.readArchive(file.getAbsolutePath())
				, ErpStartConfigsModel.class);
		System.out.println(obj);
		
		System.out.println(obj.getPathImage());
	}

}
