package com.basis.teste.consummer.rabbittest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class MessageListener {
    private static Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @RabbitListener(queues = MQMessageConfig.QUEUE)
    public void listener(Message message) throws Exception {
        LocalDateTime lt = LocalDateTime.now();
        logger.info("-----------------------"+ lt + "------------------------");
        //System.out.println("Reprocessando mensagem: " + message.getMessage());
        throw new Exception("Não consuma a mensagem!");
    }
}
