package com.example.grocery.customeResponse;

public class ResponseMessage<T> {

	private String message;
	private T data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ResponseMessage(String message, T data) {
		super();
		this.message = message;
		this.data = data;
	}
	public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseMessage [message=" + message + ", data=" + data + "]";
	}
	
	
}
