import animal.Bird;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Sparrow","Small bird");
        bird.Fly(false);
        System.out.println("this bird is "+bird.getName());
        System.out.println("classification "+ bird.getClassification());
        System.out.println("Sometimes bird cannot fly");
    }
}