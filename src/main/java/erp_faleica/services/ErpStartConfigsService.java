package erp_faleica.services;

import java.io.File;
import java.io.Serializable;

import com.google.gson.Gson;

import erp_faleica.models.ErpStartConfigsModel;

public class ErpStartConfigsService implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private static ErpStartConfigsModel erpStartConfig;
	
	
	public ErpStartConfigsService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ErpStartConfigsService(ErpStartConfigsModel erpStartConfig) {
		super();
		ErpStartConfigsService.erpStartConfig = erpStartConfig;
	}

	public ErpStartConfigsModel getErpStartConfig() {
		return erpStartConfig;
	}


	public void setErpStartConfig(ErpStartConfigsModel erpStartConfig) {
		ErpStartConfigsService.erpStartConfig = erpStartConfig;
	}

	public ErpStartConfigsModel getStartConfi() {
		
		File path = new File("");
		File file = new File(path.getAbsolutePath()+"\\config\\"+"erpstartconfigs.txt");
		if(file.getName() != null) {
			FileReaderTxt fr = new FileReaderTxt();
			ErpStartConfigsModel obj = new Gson().fromJson(
					fr.readArchive(file.getAbsolutePath())
					, ErpStartConfigsModel.class);
			
			ErpStartConfigsService.erpStartConfig = obj;
			return ErpStartConfigsService.erpStartConfig;
		}else {
			return new ErpStartConfigsModel();
		}
		
	}

}
