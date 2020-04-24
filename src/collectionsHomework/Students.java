package collectionsHomework;

public class Students extends Human {
    private String gender;
    private String faculty;

    public Students(String name, String surname, int age, int height, int weight, String gender, String faculty) {
        super(name, surname, age, height, weight);
        this.gender = gender;
        this.faculty = faculty;
    }

    public String getGender() {
        return gender;
    }


    @Override
    public void eat() {
        System.out.println("I like sweet");
    }

    @Override
    public void move() {
        System.out.println("I like running");
    }

    @Override
    public void toDo() {
        System.out.println("I am learning");
    }

    @Override
    public void study() {
        System.out.println("I study to " + faculty);
    }
}
