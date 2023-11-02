package erp_faleica.models;

import java.io.Serializable;

public class ErpStartConfigsModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String pathImage;
	private String sgbdIP;
	private String sgbdPORT;
	
	
	public ErpStartConfigsModel() {
		
		
	}


	public ErpStartConfigsModel(String pathImage, String sgbdIP, String sgbdPORT) {
		super();
		this.pathImage = pathImage;
		this.sgbdIP = sgbdIP;
		this.sgbdPORT = sgbdPORT;
	}


	public String getPathImage() {
		return pathImage;
	}


	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}


	public String getSgbdIP() {
		return sgbdIP;
	}


	public void setSgbdIP(String sgbdIP) {
		this.sgbdIP = sgbdIP;
	}


	public String getSgbdPORT() {
		return sgbdPORT;
	}


	public void setSgbdPORT(String sgbdPORT) {
		this.sgbdPORT = sgbdPORT;
	}


	@Override
	public String toString() {
		return "ErpStartConfigs [pathImage=" + pathImage + ", sgbdIP=" + sgbdIP + ", sgbdPORT=" + sgbdPORT + "]";
	}
	
	

}
