package com.websocket.api.chat.payload.request;

public class MessageRequest {

	private String from;
	private String content;

	public MessageRequest() {

	}

	public MessageRequest(String from, String content) {
		this.setFrom(from);
		this.setContent(content);
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
