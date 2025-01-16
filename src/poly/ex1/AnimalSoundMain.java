package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Caw caw = new Caw();
        Caw caw1 = new Caw();
        Caw caw2 = new Caw();
        Cat cat = new Cat();
        Dog dog = new Dog();

        /*Caw[] cawArr = {caw, caw1, caw2};*/

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        cat.sound();
        soundCaw(caw);
        System.out.println("동물 소리 테스트 종료");

    }

    private static void soundCaw(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
