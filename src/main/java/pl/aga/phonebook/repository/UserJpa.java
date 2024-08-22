package pl.aga.phonebook.repository;

import org.springframework.data.repository.CrudRepository;

public interface UserJpa extends CrudRepository<UserEntity, Integer> {
}
