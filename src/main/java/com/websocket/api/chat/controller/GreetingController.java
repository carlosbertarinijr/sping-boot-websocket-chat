package com.websocket.api.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.websocket.api.chat.model.Greeting;
import com.websocket.api.chat.payload.request.MessageRequest;

@Controller
public class GreetingController {

	@MessageMapping("/sendMsg")
	@SendTo("/topic/greetings")
	public Greeting greeting(MessageRequest message) throws Exception {
		Thread.sleep(1000); // simulated delay
		 return new Greeting(HtmlUtils.htmlEscape(message.getFrom() + ": " + message.getContent()));
	}
}
