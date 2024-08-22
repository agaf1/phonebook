package pl.aga.phonebook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.aga.phonebook.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.getAll();
    }

}
