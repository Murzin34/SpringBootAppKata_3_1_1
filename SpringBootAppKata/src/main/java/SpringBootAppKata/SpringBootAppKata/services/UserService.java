package SpringBootAppKata.SpringBootAppKata.services;


import SpringBootAppKata.SpringBootAppKata.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();


    User getUserById(int id);


    void save(User user);


    void update(int id, User user);


    void delete(int id);
}
