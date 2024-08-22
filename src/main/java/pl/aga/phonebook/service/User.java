package pl.aga.phonebook.service;

public record User(Integer id,String name,int phoneNumber) {

    public User{
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("You didn't give a name");
        }
        if(phoneNumber > 999999999 || phoneNumber < 100000000){
            throw new IllegalArgumentException("This phone number is incorrect");
        }
    }
}
