package fr.univ.rouen.stbserver.exceptions;


public class IdNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	private int id;
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public IdNotFoundException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public IdNotFoundException() {
		super();
	}
}
