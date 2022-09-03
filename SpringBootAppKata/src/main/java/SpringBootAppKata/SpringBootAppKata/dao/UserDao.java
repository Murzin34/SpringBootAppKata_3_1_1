package SpringBootAppKata.SpringBootAppKata.dao;

import SpringBootAppKata.SpringBootAppKata.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    User getUserById(int id);

    void save(User user);

    void update(User user);

    void delete (int id);
}
