package com.websocket.api.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.websocket.api.chat.bean.MessageBean;

@Controller
public class SocketController {
	@MessageMapping("/user-all")
	@SendTo("/topic/user")
	public MessageBean send(@Payload MessageBean message) throws InterruptedException {
		Thread.sleep(1000); // simulated delay
		return message;
	}
}
