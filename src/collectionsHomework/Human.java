package collectionsHomework;

public abstract class Human implements Studyability{
    private String name;
    private String surname;
    private int age;
    private int height;  // вес
    private int weight;  // рост

public Human(String name, String surname, int age, int height, int weight) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.height = height;
    this.weight = weight;
}


    public void whoAmI() {
        if (age <= 23) {
            System.out.println("I am a student");
        } else {
            System.out.println("I am a teacher");
        }
    }

    public abstract void eat();


    public abstract void move();

    public abstract void toDo();


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
