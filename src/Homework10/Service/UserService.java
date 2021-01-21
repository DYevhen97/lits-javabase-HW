package Homework10.Service;

import Homework10.Repository.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public void getAllUsers() {
        System.out.println(userRepository);
    }

}

