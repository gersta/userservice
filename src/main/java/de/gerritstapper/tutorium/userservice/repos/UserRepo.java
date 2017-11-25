package de.gerritstapper.tutorium.userservice.repos;

import org.springframework.data.repository.CrudRepository;

import de.gerritstapper.tutorium.userservice.model.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
