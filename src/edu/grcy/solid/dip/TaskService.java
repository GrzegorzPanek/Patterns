package edu.grcy.solid.dip;
// jeszcze bardziej ogolna uslugowa klasa ktora ma wywolac odpowiednie zadanie na fileRepository
public class TaskService {
    private FileRepository repository = new FileRepository();

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }
}
