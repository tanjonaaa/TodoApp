package App;
/*
* A Class that represents a Todo with all its properties
*/
public class Todo {
    private int id;
    private String title;
    private String description;
    private String deadline;
    private int priority;

    public Todo(int id, String title, String description, String deadline, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }
}
