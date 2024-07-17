package exemplo.demo.controller;

import exemplo.demo.domain.Product;
import exemplo.demo.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable long id) {
        return ResponseEntity.status(200).body(service.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Product save(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<Product> pagination(@RequestParam int page, @RequestParam int size, @RequestParam double maxPrice, @RequestParam double minimumPrice) {
        return service.pagination(page, size, maxPrice, minimumPrice);
    }
}
