package animal;
public class Bird extends Animal {
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    private String classification;
    public Bird(String name, String classification) {
        super(name);
        this.classification=classification;

    }

    @Override
    public void makeSound() {
        System.out.println("The bird makes a tweet");

}
    public void Fly(boolean a) {
        if (a)
        System.out.println("can fly");
else {
            System.out.println("can't fly");
        }
    }}
