package exemplo.demo.repository;

import exemplo.demo.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price <= :max AND p.price >= :min ")
    Page<Product> findAll(int page, int size, double max, double min);
}
