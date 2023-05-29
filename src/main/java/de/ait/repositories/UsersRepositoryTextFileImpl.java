package de.ait.repositories;

import de.ait.models.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryTextFileImpl implements UsersRepository {

    private String fileName;

    public UsersRepositoryTextFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();

            while (line != null) {
                User user = parseLine(line);
                users.add(user);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Произошла ошибка");
        }

        return users;
    }

    @Override
    public void save(User user) {
        if (user.getFirstName().equals("")) {
            System.out.println("Вы ввели некорректные данные. Повторите ввод данных опять");
            return;
        }
        if (user.getLastName().equals("")) {
            System.out.println("Вы ввели некорректные данные. Повторите ввод данных опять");
            return;
        }

        if (user.getAge() < 0) {
            System.out.println("Вы ввели отрицательное значение возраста." +
                    " Повторите еще раз создание пользователя");
            return;
        }
        if (user.getHeight() > 2.5) {
            System.out.println("Вы ввели некорректные данные. Повторите ввод данных опять");
            return;
        }
       // users.add(user);
        System.out.println("Данный пользователь успешно добавлен.");
    }

    @Override
    public void addPerson(User user) {

        try (FileWriter writer = new FileWriter("users.txt", true)) {
            String result1 = user.getFirstName() +"|" + user.getLastName()+"|"
                    + user.getAge() + "|" + user.getHeight();
            writer.write("\n");
            writer.write(result1);


        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
    private static User parseLine(String line) {
        String[] parsed = line.split("\\|");
        String firstName = parsed[0];
        String lastName = parsed[1];
        int age = Integer.parseInt(parsed[2]);
        double height = Double.parseDouble(parsed[3]);

        return new User(
                firstName, lastName, age, height
        );
    }
}