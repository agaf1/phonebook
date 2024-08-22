package pl.aga.phonebook.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.aga.phonebook.service.User;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpa userJpa;
    private final MapperUserEntity mapperUserEntity;

    @Override
    public void save(User user) {
        UserEntity userEntity = mapperUserEntity.mapToUserEntity(user);
        userJpa.save(userEntity);
    }

    @Override
    public List<User> getAll() {
        List<UserEntity> userEntities = (List<UserEntity>) userJpa.findAll();
        return userEntities.stream()
                .map(mapperUserEntity::mapToUser)
                .toList();
    }
}
