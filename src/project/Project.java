package project;

public class Project extends Task{
    private String title;
    private float completionPercentage;
    private int taskAmount;
    private Task task;
    private Task task1;
    private Task task2;
    private Task task3;
    public Project(String title, float completionPercentage, int taskAmount, Task task, Task task1, Task task2, Task task3){
        this.title=title;
        this.completionPercentage=completionPercentage;
        this.taskAmount=taskAmount;
        this.task=task;
        this.task1=task1;
        this.task2=task2;
        this.task3=task3;
    }
}
