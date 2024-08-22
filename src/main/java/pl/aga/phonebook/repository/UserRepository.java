package pl.aga.phonebook.repository;

import pl.aga.phonebook.service.User;

import java.util.List;

public interface UserRepository {

        void save(User user);
        List<User> getAll();
}
