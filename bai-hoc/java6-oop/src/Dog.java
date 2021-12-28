public class Dog {
    public String breed;
    public Size size;
    public String color;
    public int age;

    public Dog(String breed, Size size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size=" + size.getValue() +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
