public class Human {
    //Fields or attributes
    int height;
    int weight;
    String name;
    int age;
    char gender;

    //Methods
    public void run() {
        System.out.println("I am running");
    }

    public void talk() {
        System.out.println("I am talking");
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void type() {
        System.out.println("I am typing");
    }

    //Setter method
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //Getter Methods
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    //Constructor
    public Human(int height, int weight, String name, int age, char gender) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
