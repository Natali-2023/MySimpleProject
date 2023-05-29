package de.ait.repositories;

import de.ait.app.Main;
import de.ait.models.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository {
    List<User> users = new ArrayList<>();
    @Override
    public List<User> findAll() {
        User user = new User("Marsel", "Sidikov", 29, 1.85);
        User user1 = new User("Maxim", "Ivanov", 19, 1.79);
        User user2 = new User("Ruslan", "Kochkin", 41, 1.83);

        users.add(user);
        users.add(user1);
        users.add(user2);
        return users;
    }

    @Override
    public void save(User user) {
    }

    @Override
    public void addPerson(User user) {
      /*  try (FileWriter writer = new FileWriter("users.txt", true)) {
            String result1 = user.getFirstName() + "|" + user.getLastName() + "|"
                    + user.getAge() + "|" + user.getHeight();
            writer.write("\n");
            writer.write(result1);

        } catch (Exception e) {
            System.out.println("Ошибка");
        }*/
    }
}
