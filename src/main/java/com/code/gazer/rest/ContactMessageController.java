package com.code.gazer.rest;

import com.code.gazer.domain.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ContactMessageController {

  @PostMapping("/message")
  public final ResponseEntity<Message> sendMessage(@RequestBody final Message message) {
    log.info(message.toString());
    return ResponseEntity.ok(message);
  }

}
