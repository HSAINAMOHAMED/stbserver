package fr.univ.rouen.stbserver.exceptions;

public class ErrorResponse {
	private int id;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int errorCode) {
		this.id = errorCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String message) {
		this.status = message;
	}
}
