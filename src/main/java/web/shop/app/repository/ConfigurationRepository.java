package web.shop.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.shop.app.model.Configuration;

@Repository
public interface ConfigurationRepository extends CrudRepository<Configuration, Integer>{

}
