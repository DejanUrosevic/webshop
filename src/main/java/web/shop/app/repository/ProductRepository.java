package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
