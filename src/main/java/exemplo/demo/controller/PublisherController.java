package exemplo.demo.controller;

import exemplo.demo.dto.OrderRequest;
import exemplo.demo.service.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired

    private Publisher service;

    @PostMapping
    public void publisher(@RequestBody OrderRequest order){
        service.send(order);
    }



}
