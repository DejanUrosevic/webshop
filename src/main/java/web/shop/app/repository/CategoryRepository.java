package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
