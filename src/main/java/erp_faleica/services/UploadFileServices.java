package erp_faleica.services;

import java.io.ByteArrayInputStream;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.CroppedImage;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.DialogFrameworkOptions;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.file.UploadedFile;

@Named
@SessionScoped
public class UploadFileServices implements Serializable {

	private static final long serialVersionUID = 1L;

	private CroppedImage croppedImage;

	private UploadedFile originalImageFile;

	public CroppedImage getCroppedImage() {
		return croppedImage;
	}

	public void setCroppedImage(CroppedImage croppedImage) {
		this.croppedImage = croppedImage;
	}

	public UploadedFile getOriginalImageFile() {
		return originalImageFile;
	}

	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("ENTREI NO handleFileUpload");
		this.originalImageFile = null;
		this.croppedImage = null;
		UploadedFile file = event.getFile();
		if (file != null && file.getContent() != null && file.getContent().length > 0 && file.getFileName() != null) {
			this.originalImageFile = file;
			System.out.println(file.getFileName());
			FacesMessage msg = new FacesMessage("Successful", this.originalImageFile.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void crop() {
		if (this.croppedImage == null || this.croppedImage.getBytes() == null
				|| this.croppedImage.getBytes().length == 0) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Cropping failed."));
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Cropped successfully."));
		}
	}

	public StreamedContent getImage() {
		return DefaultStreamedContent.builder()
				.contentType(originalImageFile == null ? null : originalImageFile.getContentType()).stream(() -> {
					if (originalImageFile == null || originalImageFile.getContent() == null
							|| originalImageFile.getContent().length == 0) {
						return null;
					}

					try {
						return new ByteArrayInputStream(originalImageFile.getContent());
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
				}).build();
	}

	public StreamedContent getCropped() {
		return DefaultStreamedContent.builder()
				.contentType(originalImageFile == null ? null : originalImageFile.getContentType()).stream(() -> {
					if (croppedImage == null || croppedImage.getBytes() == null
							|| croppedImage.getBytes().length == 0) {
						return null;
					}

					try {
						return new ByteArrayInputStream(this.croppedImage.getBytes());
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
				}).build();
	}

	public void uploadFiles() {

		System.out.println("Entrei no metodo viewTester");

		DialogFrameworkOptions options = DialogFrameworkOptions.builder().modal(true).resizable(false)
				.contentHeight("100%").contentWidth("100%").height("80%").width("80%").headerElement("customheader")
				.build();
		System.out.println(options.toString());
		PrimeFaces.current().dialog().openDynamic("uploadFiles", options, null);

	}

}