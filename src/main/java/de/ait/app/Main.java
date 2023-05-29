package de.ait.app;

import de.ait.models.User;
import de.ait.repositories.UsersRepository;
import de.ait.repositories.UsersRepositoryListImpl;
import de.ait.repositories.UsersRepositoryTextFileImpl;
import de.ait.services.UsersService;
import de.ait.services.UsersServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UsersRepository usersRepository = new UsersRepositoryTextFileImpl("users.txt");
        UsersRepository testUserRepository = new UsersRepositoryListImpl();
        UsersService usersService = new UsersServiceImpl(usersRepository);

        while (true) {
            System.out.println("1. Вывести имена всех пользователей");
            System.out.println("2. Вывести фамилию самого взрослого пользователя");

            System.out.println("3. Добавить нового пользователя");
            System.out.println("4. Вывести средний возраст всех пользователей");
            System.out.println("5. Вывести возраст самого высокого человека");
            System.out.println("6. Вывести имя и фамилию самого низкого человека");

            System.out.println("0. Выход");

            int command = scanner.nextInt();
            scanner.nextLine();


            switch (command) {
                case 1:
                    System.out.println("Выводим имена пользователей...");

                    List<String> names = usersService.getNames();
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;

                case 2:
                    System.out.println("Выводим самого взрослого пользователя");
                    String lastName = usersService.getLastNameOfMostAging();
                    System.out.println(lastName);
                    break;

                case 3:

                    UsersRepositoryListImpl.save(User(UsersServiceImpl.user));


                 /*   System.out.println("Добавление нового пользователя");
                    String writerTemp="";
                    String temp = "";
                    int tempAge =0 ;
                    double tempResult;

                    scanner = new Scanner(System.in);

                    System.out.println("Введите имя");
                    temp = scanner.nextLine();
                    writerTemp=temp + "|";

                    System.out.println("Введите фамилию");
                    temp = scanner.nextLine();
                    writerTemp=writerTemp + temp+ "|";

                    System.out.println("Введите возраст");
                    tempAge = scanner.nextInt();
                    if (tempAge<0){
                        System.out.println("Вы ввели отрицательное значение возраста." +
                                " Повторите еще раз создание пользователя");
                        break;

                    }else {
                        writerTemp = writerTemp + tempAge + "|";
                    }
                    System.out.println("Введите рост");
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        tempResult = scanner1.nextDouble();

                    }catch (Exception e){

                        System.out.println("Повторите ввод значения роста через запятую");
                        break;
                    }

                    if (tempResult>2.5){
                        System.out.println("Вы ввели некорректное значение роста." +
                                " Повторите еще раз создание пользователя");
                        break;
                    }else {
                        writerTemp = writerTemp + tempResult ;
                        usersRepository.addPerson(writerTemp);

                    }*/

                    break;

                case 4:
                    System.out.println("Выводим средний возраст всех пользователей");
                    double middleAge = usersService.getMiddleAge();
                    System.out.println(middleAge);
                    break;

                case 5:
                    System.out.println("Выводим возраст самого высокого человека");
                    int age = usersService.getAgeOfTheTallest();
                    System.out.println(age);

                    break;

                case 6:
                    System.out.println("Выводим имя и фамилию самого низкого человека");
                    String nameAndFamilyName = usersService.getNameAndFamilyNameOfShortest();
                    System.out.println(nameAndFamilyName);
                    break;


                case 0:
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Команда не распознана");
            }
        }
    }
}