package web.PP_3_1_2_SpringBoot.dao;


import web.PP_3_1_2_SpringBoot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void saveUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getAllUsers ();

    Optional<User> showUserById(long id);
}
