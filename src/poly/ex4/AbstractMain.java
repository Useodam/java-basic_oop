package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        //추상 클래스는 생성 불가
        //AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);
    }

        // 변하지 않는 부분
        private static void soundAnimal(AbstractAnimal animal){
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("동물 이동 테스트 종료");
    }
}
