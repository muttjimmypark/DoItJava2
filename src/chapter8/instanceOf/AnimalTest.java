package chapter8.instanceOf;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("훨훨 납니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();

        //다운캐스팅 : 최대한 오버라이딩으로 커버칠 생각을 하고 잘 쓰지 말자
        /*
        Human human = (Human) animal;
        human.readBook();
        */
        // 그냥 이렇게 작성하면 컴파일에러를 배출하지 않지만 다른 클래스가 들어오면 에러
        if (animal instanceof Human) {
            Human human = (Human) animal;
            human.readBook();
        } else if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
        } else if (animal instanceof Eagle) {
            Eagle eagle = (Eagle) animal;
            eagle.flying();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
        }
    }
}
