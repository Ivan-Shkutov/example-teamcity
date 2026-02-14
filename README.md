## Домашнее задание "Teamcity"

## Шкутов Иван Владимирович

### Решение:

  1. Сделал fork репозитория example-teamcity в свой аккаунт

  2. В TeamCity:

    Создал новый проект на основе fork
    Включил конфигурацию Maven
    Добавил шаги сборки для Maven
    Провел первую сборку ветки master

  3. Загрузил settings.xml в TeamCity Maven Settings

  4. Прописал креды для доступа к Nexus (логин/пароль)

  5. В pom.xml обновил ссылки на Nexus репозиторий

  6. Запустил сборку master. Убедился, что все тесты проходят и артефакт .jar появился в Nexus

  7. В TeamCity (Administration → Project → Versioned Settings) выбрал Save settings in VCS. В качестве репозитория использовал https://github.com/Ivan-Shkutov/example-teamcity.git

  8. Создание ветки feature/add_reply

    git checkout -b feature/add_reply

  9. Добавление нового метода в Welcomer.java

    @Test
    public void testSayHunterReplyContainsHunter() {
        Welcomer welcomer = new Welcomer();
        String reply = welcomer.sayHunterReply();
        assertTrue(reply.toLowerCase().contains("hunter"));
    }

  10. Подготовка к push ветки feature/add_reply

    git add .
    git commit -m "Добавил метод sayHunterReply и тест"

  11. Push и автоматическая сборка

    git push origin feature/add_reply

  12. TeamCity автоматически запустила сборку. Тесты прошли успешно. Артефактов .jar не собиралось, так как это feature-ветка.

  13. Слияние изменений в master. Сделал merge ветки feature/add_reply в master

  14. Настройка артефактов сборки в TeamCity (Build Configuration → General Settings → Artifact Paths)

    target/*.jar => .

  15. Запустил сборку master. Сборка прошла успешно. jar артефакты появились в TeamCity. Артефакт также автоматически загружается в Nexus через mvn deploy.

  16. Схема:

      ![18](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/18.png)


![1](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/1.png)

![2](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/2.png)

![3](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/3.png)

![4](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/4.png)

![5](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/5.png)

![6](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/6.png)

![7](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/7.png)

![8](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/8.png)

![9](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/9.png)

![10](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/10.png)

![11](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/11.png)

![12](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/12.png)

![13](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/13.png)

![14](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/14.png)

![15](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/15.png)

![16](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/16.png)

![17](https://github.com/Ivan-Shkutov/example-teamcity/blob/master/img/17.png)




