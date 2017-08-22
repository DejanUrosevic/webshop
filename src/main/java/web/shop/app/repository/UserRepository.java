package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
