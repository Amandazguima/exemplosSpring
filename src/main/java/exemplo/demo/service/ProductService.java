package exemplo.demo.service;

import exemplo.demo.domain.Product;
import exemplo.demo.exception.ProductNotFoundException;
import exemplo.demo.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    public Page<Product> pagination(int page, int size, double maxPrice, double minimunPrice) {
        return repository.findAll(PageRequest.of(page, size));
    }

}
