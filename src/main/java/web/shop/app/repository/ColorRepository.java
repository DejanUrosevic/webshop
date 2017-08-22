package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.Color;

@Repository
public interface ColorRepository extends CrudRepository<Color, Integer>{

}
