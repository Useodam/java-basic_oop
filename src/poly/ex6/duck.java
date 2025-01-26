package poly.ex6;

public class duck extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("오리 소리");
    }

    @Override
    public void fly() {
        System.out.println("오리 날기");
    }
}
