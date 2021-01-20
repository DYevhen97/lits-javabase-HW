package Homework10.Repository;

import Homework10.Models.Role;
import Homework10.Models.User;

import java.util.ArrayList;

public class UserRepository {

    ArrayList<User> userList;

    public UserRepository (){
        userList = new ArrayList<>();
        userList.add(new User("Yevhen", "Damrin", 23, "QA", "+380950708146","zenulche97@gmail.com","Striy", Role.Admin));
        userList.add(new User("Oleh", "Vitrikush", 26, "dog", "++380950708147","zenuche98@gmail.com","Striy", Role.User));
        userList.add(new User("Seriy", "Durmanov", 46, "Musician", "+380950708148","zenulche99@gmail.com","Striy", Role.User));
    }

    public void addUser(String name,String surname,int age, String title, String phoneNumber, String email, String address, Role role){
        userList.add(new User(name, surname, age, title, phoneNumber,email,address, role));

    }

    public void removeUser(String email){

        int index = findUser(email);
        if ( index > -1){
            userList.remove(index);
            System.out.println("User " +email+ " has been removed");
        }
        else{
            System.out.println("User was not found");
        }
    }

    public int findUser(String email){
        int index = -1;
        for(int i=0; i<userList.size(); i++){
            if( userList.get(i).getEmail().equals(email)){
                index = i;
            }
        }
        return index;

    }

    public User getUser(int index){
        return userList.get(index);
    }
}
