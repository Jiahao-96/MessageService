package com.antra.messageservice.controller;

import com.antra.messageservice.pojo.Message;
import com.antra.messageservice.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Message Controller
 */
@Slf4j
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * add Message
     * @param message
     */
    @PostMapping
    public ResponseEntity<String> addMessage(@RequestBody Message message){
        messageService.save(message);
        return new ResponseEntity<>("add a new message!", HttpStatus.OK);
    }

    /**
     * delete message
     * @param id
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMessage(@PathVariable String id){
        messageService.delete(id);
        return new ResponseEntity<>("delete a new message!", HttpStatus.OK);
    }

    /**
     * modify message
     * @param message
     */
    @PutMapping
    public ResponseEntity<String> modifyMessage(@RequestBody Message message){
        messageService.mod(message);
        return new ResponseEntity<>("mod a message!", HttpStatus.OK);
    }

    /**
     * get all messages
     */
    @GetMapping()
    public ResponseEntity<List<Message>> getAllMessage(){
        List<Message> messages = messageService.getAll();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

}
