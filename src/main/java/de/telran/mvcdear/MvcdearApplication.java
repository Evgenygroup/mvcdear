package de.telran.mvcdear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcdearApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcdearApplication.class, args);
    }

}

//используя MVC написать следующую программу:
//1.выводит на экран приветствие "Dear User!"
//2.имеет домашнюю страницу по адресу localhost8080, на которой
// предусмотрен переход на страницу dear user
//3. есть возможность замены user на любое имя, отправленное пользователем
