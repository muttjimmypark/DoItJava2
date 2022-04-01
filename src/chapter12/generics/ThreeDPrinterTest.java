package chapter12.generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        //클래스 작성시 <T>로 들어갔던 실제 사용할 참조형 타입을 쓰면 된다
        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        //프린터 안에서 T -->> Powder = new Powder();로 들어가는 격

        //컴파일러가 printer 내용을 캐스팅하므로
        // 우항을 (Powder)로 다운캐스팅해서 좌항에 집어넣을 필요가 없다
        Powder powder = printer.getMaterial();
        System.out.println(printer);

        // <T> 자리에 다른 클래스가 들어가서 동일한 기능이 구현될수 있다
        ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        System.out.println(printerPlastic);

        //입력받는 타입에 제한을 둘수 있다
        //제네릭 표현 T의 자리에는 특정 클래스로부터 상속받은 클래스만 들어갈수 있도록
        /*
        ThreeDPrinter<Water> printerWater = new ThreeDPrinter<>();
        printerWater.setMaterial(new Water());
        Water water = printerWater.getMaterial();
        System.out.println(printerWater);
        */

        //상속을 주는 김에 공통 메서드를 abstract로 구현해넣을수도 있고 그렇다
        // 어짜피 T에 뭐가 들어오든 부모 클래스가 doPrinting()을 가지므로
        // Printer가 printing()을 수행할때 활용할수 있게된것이다
        printerPlastic.printing();
    }
}
