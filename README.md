## Проект 'Работа с пользователями'




## Участники проекта:
- Siedakov Serhii
- Nataliia Pohrebniak
- Yuliia Tsaruk
- Aleksandra Trimailova(Отсутствовала)
# Цели проекта:
* '1' Вывести имена всех пользователей
* '2' Вывести фамилию самого взрослого пользователя
* '3' Добавить нового пользователя
* '4' Вывести средний возраст всех пользователей
* '5' Вывести возраст самого высокого человека
* '6' Вывести имя и фамилию самого низкого человека

## Структура java-проекта

* `de.ait`
    * `app` - здесь размещается точка входа в приложение (`main`)
    * `models` - модели предметной области
    * `repositories` - классы, которые отвечают за получение данных `findAll` (работу с хранилищем - файлом)
    * `service` - бизнес-логика вашего проекта `getNames` - получение имен

* Общая логика работы -
    1.  Считывание строк из файла, преобразование их в список User.
    2. Извлечение списка пользователей, отбор имён пользователей.
    3. Извлечение имён пользователей из списка и их печать в консоль.

# Распределение обязаностей по задачам
* '1' и '2' реализовали в классе
* '3' Siedakov Serhii,Nataliia Pohrebniak,Yuliia Tsaruk
* '4' Nataliia Pohrebniak
* '5' Yuliia Tsaruk 
* '6' Siedakov Serhii


# Работа с проектом:
* Обсуждение структуры проекта.
* Распределение задач между участниками проекта.
* Создание необходимых методов для реализации проекта
* Создание тестов для проверки работы методов проекта.



# Результат
* Мы имеем приложение, которое работает с файлом:
* - Выводит имена всех пользователей
* - Выводит фамилию самого взрослого пользователя
* - Добавляет нового пользователя(добавляет уже к имеющимся пользователям, оставляя старых) с учётом следующих параметров: рост - не более 2.5 м, возраст - неотрицательное число
* - Выводит средний возраст всех пользователей
* - Выводит возраст самого высокого человека
* - Выводит имя и фамилию самого низкого человека