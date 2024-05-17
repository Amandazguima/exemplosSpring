package exemplo.demo.controller;

import exemplo.demo.domain.Address;
import exemplo.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/address")
@RestController
public class AdressController {

    @Autowired
    AddressService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Address save(@RequestBody Address address){
        return service.save(address);
    }


}
