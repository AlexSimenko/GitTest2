import animal.Bird;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Sparrow","Small bird");
        bird.Fly(true);
        System.out.println("this bird is "+bird.getName());
    }
}