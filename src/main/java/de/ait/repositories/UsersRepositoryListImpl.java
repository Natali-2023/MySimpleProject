package de.ait.repositories;

import de.ait.app.Main;
import de.ait.models.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository {

    public List<User> users = Arrays.asList(new User("Marsel", "Sidikov", 29, 1.85),
            new User("Maxim", "Ivanov", 19, 1.79),
            new User("Ruslan", "Kochkin", 41, 1.83));

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void save(User user) {
        if (user.getFirstName().equals("")){
            System.out.println("Вы ввели некорректные данные. Повторите ввод данных опять");
            return;
        }
        if (user.getLastName().equals("")){
            System.out.println("Вы ввели некорректные данные. Повторите ввод данных опять");
            return;
        }

        if (user.getAge()<0) {
            System.out.println("Вы ввели отрицательное значение возраста." +
                    " Повторите еще раз создание пользователя");
            return;
        }
        if (user.getHeight()>2.5){
            System.out.println("Вы ввели некорректные данные. Повторите ввод данных опять");
            return;
        }
        users.add(user);
        System.out.println("Данный пользователь успешно добавлен.");
    }



    @Override
    public void addPerson(String x) {
        try(FileWriter writer = new FileWriter("users.txt", true))
        {
            writer.write(x);


        }catch (Exception e){
            System.out.println("Ошибочка");
        }
    }

}
