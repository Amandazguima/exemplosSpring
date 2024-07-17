package exemplo.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import exemplo.demo.dto.OrderRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Publisher {


    @Autowired
    private RabbitTemplate template;
    private String exchange =  "exemplo.supreme";
    private String routingKey = "exemplo";
    @Autowired
    private ObjectMapper mapper;


    public void send (OrderRequest order){
            try {
                var orderJson = mapper.writeValueAsString(order);

                template.convertAndSend(exchange,routingKey, orderJson);

            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
    }

}
