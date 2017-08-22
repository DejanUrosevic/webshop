package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer>{

}
