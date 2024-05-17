package exemplo.demo.service;

import exemplo.demo.domain.Address;
import exemplo.demo.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AdressRepository repository;

    public Address save(Address address){
        return repository.save(address);
    }

}
