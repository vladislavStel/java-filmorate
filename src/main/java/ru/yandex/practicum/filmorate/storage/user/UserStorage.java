package ru.yandex.practicum.filmorate.storage.user;

import ru.yandex.practicum.filmorate.model.User;

import java.util.Collection;
import java.util.List;

public interface UserStorage {

    User add(User user);

    User update(User user);

    Collection<User> getAllUsers();

    User getUserById(Long id);

    void addFriend(Long userID, Long friendID);

    void removeFriend(Long userID, Long friendID);

    List<User> getFriends(Long id);

    boolean isExistsUser(Long id);
}