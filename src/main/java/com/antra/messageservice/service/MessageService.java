package com.antra.messageservice.service;


import com.antra.messageservice.pojo.Message;

import java.util.List;

/**
 * Massage Service
 */
public interface MessageService {

    void save(Message message);

    void delete(String id);

    void mod(Message message);

    List<Message> getAll();
}