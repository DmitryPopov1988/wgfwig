package com.code.gazer.rest;

import com.code.gazer.domain.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactMessageController {

  @PostMapping("/message")
  public final ResponseEntity<Message> sendMessage(@RequestBody final Message message) {
    System.out.println(message);

    return ResponseEntity.ok(message);
  }

}
