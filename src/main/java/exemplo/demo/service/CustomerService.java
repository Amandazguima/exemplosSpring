package exemplo.demo.service;

import exemplo.demo.domain.Customer;
import exemplo.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService  {

    @Autowired
    private CustomerRepository repository;

    public Customer save (Customer customer){
        return repository.save(customer);
    }

    public Customer findById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
