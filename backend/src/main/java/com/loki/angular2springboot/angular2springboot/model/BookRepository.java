package com.loki.angular2springboot.angular2springboot.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Lokesh on 03-08-2017.
 */
@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book,Long> {
}
