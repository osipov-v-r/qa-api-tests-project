# Тестовой проект
Проект состоит из:
- _Java_ - как язык разработки автотестов;
- _REST Assured_ - как инструмент тестирования API;
- _Junit_ - фреймворк для автоматизации;
- _Gradle_ - сборщик проекта;
- _Allure_ - инструмент для пострения отчетов;
- За основу для разработки автоматизированных тестовых  сценариев API взяты тренажеры API - http://85.192.34.140:8080/swagger-ui/index.html#/ и https://reqres.in/

## Для локального тестов
Для запуска всех тестов можно использовать такую команду
```bash
$ ./gradlew clean test
```
Для запуска тестов только на "чтение" можно использовать такую команду
```bash
$ ./gradlew clean testReadOnly
```
## Построение отчета
Для построения локального отчета о прохождении тестов можно запустить команду
```bash
$ ./gradlew allureServe
```
