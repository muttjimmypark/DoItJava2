package chapter10.interfaceEx;

public class CompleteCalc extends Calculator{
    //구현 상속이라고 한다

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int devide(int num1, int num2) {
        if (num2 != 0){
            return num1 / num2 ;
        }
        return ERROR;
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
