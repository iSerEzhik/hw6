import java.text.DecimalFormat;


public abstract class Animal {
    protected final String name;
    protected final int age;
    protected final String color;
    protected final float maxJumpHeight;
    protected final float maxRunLength;
    protected final float maxSwimLength;
    private static int k;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunLength = setRunLength();
        this.maxJumpHeight = setJumpHeight();
        this.maxSwimLength = setSwimLength();

    }

    @Override
    public String toString() {
        DecimalFormat floatFormat=new DecimalFormat("###.##");
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", maxJumpHeight=" + floatFormat.format(maxJumpHeight) +
                ", maxRunLength=" + floatFormat.format(maxRunLength) +
                ", maxSwimLength=" + floatFormat.format(maxSwimLength) +
                '}';
    }



    public abstract void voice();

    public int getK() {
        return k;
    }

    public void incrementsK() {
        k++;
    }

    public abstract float setJumpHeight();
//    {
//        System.out.println("Введите высоту прыжка " + this.name + ": ");
//        Random jumpRandom = new Random();
//        return jumpRandom.nextFloat() + jumpRandom.nextInt(5);
//    }

    public abstract float setRunLength();
//    {
//        System.out.println("Введите как далеко может убежать " + this.name + ": ");
//        Random runRandom = new Random();
//        return runRandom.nextFloat() + runRandom.nextInt(100) + 200;
//    }

    public abstract float setSwimLength();
//    {
//        System.out.println("Введите сколько может проплыть " + this.name + ": ");
//        Random swimRandom = new Random();
//        return swimRandom.nextFloat() + swimRandom.nextInt(5) + 1;
//    }

    public String testJump(float jumpHeight) {
        if (jumpHeight<0) return "Ошибка!";
        if (this.maxJumpHeight > jumpHeight)
            return this.name+" пытается прыгнуть на "+jumpHeight+':'+true;
        else return this.name+" пытается прыгнуть на "+jumpHeight+':'+false;
    }

    public String testRun(float runLength) {
        if (runLength<0) return "Ошибка!";
        if (this.maxRunLength > runLength)
            return this.name+" пытается пробежать "+runLength+':'+true;
        else return this.name+" пытается пробежать "+runLength+':'+false;

    }

    public String testSwim(float swimLength) {
        if (swimLength<0) return "Ошибка!";
        if (this.maxSwimLength > swimLength)
            return this.name+" пытается проплыть "+swimLength+':'+true;
        else return this.name+" пытается проплыть "+swimLength+':'+false;
    }


}
