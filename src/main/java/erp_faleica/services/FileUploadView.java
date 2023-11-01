package erp_faleica.services;

import java.io.File;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;

import erp_faleica.controllers.CadastroUsuarioBean;

@Named
@RequestScoped
public class FileUploadView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private UploadedFile file;
	
	
	
    public void handleFileUpload(FileUploadEvent event) {
    	
    	
    	
        FacesMessage message = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        
        try {
        	File file = new File("");
        	String tomCatOFICIAL = "C:\\tomcat\\apache-tomcat-9.0.82\\bin";
        	
        	System.out.println("ABSOLUTE PATH: "+file.getAbsolutePath());
        	System.out.println("TOMCAT STRING: "+tomCatOFICIAL);
        	
			
        	if(file.getAbsolutePath() != tomCatOFICIAL) {
        		event.getFile().write("X:\\ProjetosJavaWeb2023\\erp_faleica\\src\\main\\webapp\\img");
        		System.out.println("SALVO NA PASTA de desenvolvimento");
        	}else {
        		event.getFile().write("C:\\tomcat\\apache-tomcat-9.0.82\\webapps\\erp_faleica\\img");
        		System.out.println("SALVO NA PASTA TOMCAT OFICIAL");
        	}
			
        	
        	CadastroUsuarioBean.getNewUser().setUsu_img("/erp_faleica/img/"+event.getFile().getFileName());
        	
        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

}
