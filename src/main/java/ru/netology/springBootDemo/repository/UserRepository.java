package ru.netology.springBootDemo.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springBootDemo.controller.Authorities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "12345".equals(password)){
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        if ("user".equals(user) && "7777".equals(password)){
            return Arrays.asList(Authorities.READ, Authorities.WRITE);
        }

        if ("guest".equals(user) && "3333".equals(password)){
            return Arrays.asList(Authorities.READ);
        }
        return Collections.emptyList();
    }
}
