package Home_work_2;
// task_4
// Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_4 {
    private static final Logger LOGGER = Logger.getLogger(task_4.class.getName());

    public static void main(String[] args) {
        String url = "https://example.com/file.txt";
        String name = "John Doe";
        String content = "";
        try {
            // Загрузка файла по указанной URL и чтение его содержимого
            content = downloadFile(url);

            // Изменение содержимого файла подставляя имя
            content = String.format(content, name);

            // Сохранение файла локально
            String fileName = "saved_file.txt";
            saveToFile(fileName, content);

            // Чтение сохраненного файла и вывод содержимого в лог
            String savedContent = readFile(fileName);
            LOGGER.info("File content:\n" + savedContent);

            // Удаление сохраненного файла
            deleteFile(fileName);
        } catch (IOException e) {
            // Логирование ошибок
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }

    public static String downloadFile(String url) throws IOException {
        URL fileUrl = new URL(url);
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileUrl.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public static void saveToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    public static String readFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static void deleteFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.delete()) {
            LOGGER.info("File " + fileName + " deleted successfully");
        } else {
            LOGGER.warning("Failed to delete file " + fileName);
        }
    }
}
