package pl.aga.phonebook.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserTest {

    @Test
    public void should_create_the_new_object_correctly(){
        //given
        String name = "name1";
        int phoneNumber = 111222333;
        //when
        User user = new User(null,name,phoneNumber);
        //then
        assertThat(user.name()).isEqualTo("name1");
        assertThat(user.phoneNumber()).isEqualTo(111222333);
    }

    @Test
    public void should_throw_exception_when_name_is_null_or_empty(){
        //given
        String name1 = null;
        String name2 = "";
        int phoneNumber = 11122233;
        //when
        //then
        assertThatThrownBy(() -> new User(null,name1,phoneNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("You didn't give a name");
        assertThatThrownBy(() -> new User(null,name2,phoneNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("You didn't give a name");
    }

    @Test
    public void should_throw_exception_when_phone_number_is_wrong(){
        //given
        String name = "name1";
        int phoneNumber = 100;
        //when
        //then
        assertThatThrownBy(()->new User(null,name,phoneNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("This phone number is incorrect");
    }

}