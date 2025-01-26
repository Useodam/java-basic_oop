package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        duck duck = new duck();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(duck);
        soundAnimal(bird);

        flyAnimal(duck);
        flyAnimal(bird);
//        flyAnimal(dog);
    }
    // AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("소리 테스트");
        animal.sound();
        System.out.println("테스트 끝");
    }

    //Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트");
        fly.fly();
        System.out.println("테스트 종료");
    }
}
