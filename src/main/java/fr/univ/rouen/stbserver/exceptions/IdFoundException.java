package fr.univ.rouen.stbserver.exceptions;

public class IdFoundException extends Exception{
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
	public IdFoundException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public IdFoundException() {
		super();
	}
}
