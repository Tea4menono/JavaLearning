public class Child extends Father {
    public int weight = 20;

    public void show() {
        System.out.println(this.weight);
        System.out.println(super.weight);
    }
}
