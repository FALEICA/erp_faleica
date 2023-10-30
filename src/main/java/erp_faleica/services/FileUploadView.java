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
        	PatchFilesJava path = new PatchFilesJava();
        	event.getFile().write(path.getPatchPakage());
        	System.out.println(path.getPatchPakage()+event.getFile().getFileName());
        	CadastroUsuarioBean.getNewUser().setUsu_img(path.getPatchPakage()+"\\"+event.getFile().getFileName());
        	
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
