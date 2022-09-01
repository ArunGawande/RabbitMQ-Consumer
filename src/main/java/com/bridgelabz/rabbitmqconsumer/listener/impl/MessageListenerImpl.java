package com.bridgelabz.rabbitmqconsumer.listener.impl;

import com.bridgelabz.rabbitmqconsumer.listener.MessageListener;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class MessageListenerImpl implements MessageListener {
    @Override
    public void onMessage(String message) {
        System.out.println(new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Message Received:"+message);
        System.out.println(new Date());

    }
}
