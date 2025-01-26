package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal() { 인터페이스 생성 불가

        Dog dog = new Dog();

        soundAnimal(dog);
        moveAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("테스트 종료");
    }

}
