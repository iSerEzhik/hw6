import java.util.Random;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
        super.incrementsK();
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
        ;
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }

    @Override
    public float setJumpHeight() {
        Random jumpRandom = new Random();
        return (float)(jumpRandom.nextInt(5)+2)/10;
    }

    @Override
    public float setRunLength() {
        Random runRandom = new Random();
        return runRandom.nextFloat() + runRandom.nextInt(100) + 200;
    }

    @Override
    public float setSwimLength() {
        Random swimRandom = new Random();
        return swimRandom.nextFloat() + swimRandom.nextInt(2) + 9;
    }
}
