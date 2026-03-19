package service;

import model.Task;
import util.JsonUtil;

import java.util.HashMap;
import java.util.Map;

public class GestorTareas {

    private Map<Integer, Task> tasks;
    private int nextId;
    public GestorTareas(){
        tasks = JsonUtil.loadTasks();
        int maxId = 0;
        for (Integer i : tasks.keySet()) {
            if ( i > maxId ) maxId = i;
        }
        nextId = maxId + 1;
    }

    public void añadirTarea(String nombre){
        Task nuevaTarea = new Task(nextId, nombre);
        tasks.put(nextId, nuevaTarea);
        JsonUtil.saveTasks(tasks);
        nextId++;
    }

    public void listarTareas(){
        tasks.forEach((id, task) -> System.out.println(task));
    }

    public void marcarComoCompletado(int id){
        Task t = tasks.get(id);
        if (t != null) {
            t.setCompleted(true);
            JsonUtil.saveTasks(tasks); // ¡No olvides guardar el cambio!
        } else {
            System.err.println("Error: No existe una tarea con ID " + id);
        }
    }

    public void borrarTarea(int id){
        tasks.remove(id);
        JsonUtil.saveTasks(tasks);
    }

}
