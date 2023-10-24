package erp_faleica.models.messages;

import java.io.Serializable;

public class MensagensDoSistema implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer typeMessage;
	private String writeMessage;
	
	
	public MensagensDoSistema() {
		
	}


	public MensagensDoSistema(Integer typeMessage, String writeMessage) {
		super();
		this.typeMessage = typeMessage;
		this.writeMessage = writeMessage;
	}


	public Integer getTypeMessage() {
		return typeMessage;
	}


	public void setTypeMessage(Integer typeMessage) {
		this.typeMessage = typeMessage;
	}


	public String getWriteMessage() {
		return writeMessage;
	}


	public void setWriteMessage(String writeMessage) {
		this.writeMessage = writeMessage;
	}


	@Override
	public String toString() {
		return "MensagensDoSistema [typeMessage=" + typeMessage + ", writeMessage=" + writeMessage + "]";
	}
	
	

}
