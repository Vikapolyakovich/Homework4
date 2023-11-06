package org.example;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserController {
    UserService userService = new UserService();

    public User createUser() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Фамилия Имя Отчество датарождения номертелефона пол через пробел: ");
        String strline = scanner.nextLine();
        String[] listArray = strline.split(" ");

        user.setSurname(userService.validateSurname(listArray[0]));
        user.setName(userService.validateName(listArray[1]));
        user.setPatronymic(userService.validatePatronymic(listArray[2]));
        user.setDateofbirth(userService.validateDateBirth(listArray[3]));
        user.setNumber(userService.validateNumberPhone(listArray[4]));
        user.setGender(userService.validateGender(listArray[5]));

        System.out.println(user);
        return user;
    }

    public File createFile(User user) {
        try {
            String path = user.getSurname() + ".txt";
            File file = new File(path);
            if (file.createNewFile()) {
                writeNewFile(user, file, path);
                System.out.println("Файл создан. Данные записаны");
            } else {
                writeOldFile(user, file, path);
                System.out.println("Файл уже существует. Данные перезаписаны");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
        return null;
    }

    public static File writeNewFile(User user, File file, String path) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(user.getSurname()+ " " + user.getName() + " " + user.getPatronymic() + " "
                    + new SimpleDateFormat("dd.mm.yyyy").format(user.getDateofbirth()) + " " + user.getNumber() + " " + user.getGender() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
        return file;
    }

    public static File writeOldFile(User user, File file, String path) {
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(user.getSurname()+ " " + user.getName() + " " + user.getPatronymic() + " "
                    + new SimpleDateFormat("dd.mm.yyyy").format(user.getDateofbirth()) + " " + user.getNumber() + " " + user.getGender() + "\n");
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
        return file;
    }
}
