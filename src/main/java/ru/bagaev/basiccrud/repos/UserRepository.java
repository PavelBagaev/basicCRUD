package ru.bagaev.basiccrud.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bagaev.basiccrud.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

