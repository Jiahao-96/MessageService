package com.antra.messageservice.repository;

import com.antra.messageservice.pojo.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
    Message findMessageByContent(String content);
    Message findMessageBySender(String sender);
    Message findMessageById(String id);
}
