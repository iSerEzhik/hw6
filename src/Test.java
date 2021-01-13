public class Test {
    public static void main(String[] args) {
        Animal cat= new Cat("Барсик","Серый",25);
        Animal dog=new Dog("Шарик","Черный",23);
        Animal dog1=new Dog("Барбос","Чёрно-белый",20);
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println(cat.testJump(1));
        System.out.println(cat.testJump(2));
        System.out.println(cat.testJump(3));
        System.out.println(cat.testRun(250));
        System.out.println(cat.testRun(340));
        System.out.println(cat.testSwim(10));
        System.out.println(cat.testSwim(-2));
        System.out.println(dog.testSwim(10));
        System.out.println(dog1.testSwim(10));
        System.out.println("Животных: "+cat.getK());
    }

}
