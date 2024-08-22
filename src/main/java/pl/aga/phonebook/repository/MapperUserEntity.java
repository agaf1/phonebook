package pl.aga.phonebook.repository;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import pl.aga.phonebook.service.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MapperUserEntity {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "phoneNumber",target = "phoneNumber")
    User mapToUser(UserEntity userEntity);

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "phoneNumber",target = "phoneNumber")
    UserEntity mapToUserEntity(User user);

}
