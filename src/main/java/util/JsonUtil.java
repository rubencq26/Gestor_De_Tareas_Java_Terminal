package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import model.Task;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final String FILE_PATH = "tasks.json";

    public static void saveTasks(Map<Integer, Task> tasks){
        try {
            //writerWithDefaultPrettyPrinter() es para que se muestre el formato embellecido en vez de compacto
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), tasks);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static Map<Integer,Task> loadTasks(){
        File file = new File(FILE_PATH);
        if(!file.exists()) return new HashMap<>();

        try {
            return mapper.readValue(file, new TypeReference<HashMap<Integer, Task>>(){});
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
            return new HashMap<>();
        }
    }

}
