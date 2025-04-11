package com.antra.messageservice.service.impl;

import com.antra.messageservice.pojo.Message;
import com.antra.messageservice.repository.MessageRepository;
import com.antra.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    @Override
    public void save(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void delete(String id) {
        messageRepository.deleteById(id);
    }

    @Override
    public void mod(Message message) {
        messageRepository.save(message);
    }

    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message getById(String id) {
        return messageRepository.findMessageById(id);
    }
}
