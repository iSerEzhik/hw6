import java.util.Random;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
        super.incrementsK();

    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }

    @Override
    public float setJumpHeight() {
        Random jumpRandom = new Random();
        return jumpRandom.nextFloat() + jumpRandom.nextInt(2)+1;
    }

    @Override
    public float setRunLength() {
        Random runRandom = new Random();
        return runRandom.nextFloat() + runRandom.nextInt(100) + 200;
    }

    @Override
    public float setSwimLength() {
        return 0;
    }
}
