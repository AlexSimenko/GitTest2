import animal.Bird;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Sparrow","Small bird");
        bird.Fly(true);
        System.out.println("this bird is "+bird.getName());


        //мои изменения Пацаган 04.06.2023
        Bird bird1 = new Bird("Raven","Big bird");
        bird1.Fly(true);
        System.out.println("this bird is "+bird1.getName());

        Bird bird2 = new Bird("Sparrow","Small bird");
        bird2.Fly(true);
        System.out.println("this bird is "+bird2.getName());
    }
}