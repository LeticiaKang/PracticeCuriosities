import java.util.ArrayList;

public class Type {

    // primitive type : int, long, double....
    int i = 0;
    long[] longs = new long[10];
    float f = 10.5f;
    double d = 10/3.0;

    // reference type : Integer, Long, ...
    // ☞ 레퍼런스 타입은 꼭 필요한 경우가 아니라면 코딩테스트에서 사용을 지양해야 한다.
    // ☞ 왜냐하면, 느리기 때문이지!
    Integer I = 0;
    Long[] Longs = new Long[10];
    Float F = 10.5f;
    Double D = 10/3.0;

    // 문법 오류 발생
//    ArrayList<int> arrayList = new ArrayList<>();
    // 왜 발생하는 가? ▷ 참조형 타입이 아닌 primitive 타입을 넣었기 때문이지!

    // 올바른 문법
    ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}