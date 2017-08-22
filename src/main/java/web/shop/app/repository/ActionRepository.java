package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.Action;

@Repository
public interface ActionRepository extends CrudRepository<Action, Integer>{

}
