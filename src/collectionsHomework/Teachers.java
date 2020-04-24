package collectionsHomework;

public class Teachers extends Human{
    private String gender;
    private String teach;

    public Teachers(String name, String surname, int age, int height, int weight, String gender, String teach) {
        super(name, surname, age, height, weight);
        this.gender = gender;
        this.teach = teach;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public void eat() {
        System.out.println("I like chocolate");
    }

    @Override
    public void move() {
        System.out.println("I like walking");
    }

    @Override
    public void toDo() {
        System.out.println("I am teaching");
    }

    @Override
    public void study() {
        System.out.println("I teaching " + teach);
    }

}
