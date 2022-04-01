package chapter12.generics;

public class ThreeDPrinter<T extends Material> {
    // 플라스틱이든 파우더든 같은 동작을 하는걸 만들고싶다
    // <T>는 자료형 매개변수라고 한다
    private T material;
    //static 키워드는 T에 활용할 수 없음
    //<T, V> 이런식으로 두개 받을수도 있다

    //무슨 자료형이 들어올지 여지를 남겨놓고
    // getter를 구현하면 이게 제너릭 메서드다
    // 이게 동작되면서 자료형이 확립되고 나야 컴파일이던 뭐던 될테니까
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
