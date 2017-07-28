public class Dog {
    int dogAge;

    public Dog(String name) {
        System.out.println("Name chosen is: " + name);
    }

    public void setAge( int age ) {
        dogAge = age;
    }

    public int getAge() {
        System.out.println("Dog's age is: " + dogAge);
        return dogAge;
    }

    public static void main(String []args) {
        Dog myDog = new Dog("Scooter");

        myDog.setAge(3);

        myDog.getAge();

        System.out.println("Variable Value: " + myDog.dogAge);
    }
}