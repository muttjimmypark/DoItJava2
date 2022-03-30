package chapter8.inheritance;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal{
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}

class Eagle extends Animal{
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal){
        animal.move();
        // 코드는 하나지만 여러 결과물을 산출 - 다형성
        // 동일한 메서드가 다양한 인스턴스를 구현?
    }
}
