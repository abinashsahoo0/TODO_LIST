package org.jt.todoapp.Repository;

import org.jt.todoapp.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo,String >{
    
}
