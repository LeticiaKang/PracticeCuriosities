import java.util.Arrays;
import java.util.ArrayList;
/*
 ☞ Collection Framework는 여러 개의 값을 저장하고 그 값을 쉽고 효율적으로 처리해주는 표준화 Class 집합
 ☞ 다양한 자료구조인 List, Queue, Stack, HashMap 등을 직접 구현하지 않아도 사용할 수 있게 해준다.
 */
public class CollectionFramework {

    public static class Array{
    /*
       ☞ Array
        인덱스로 배열에 접근할 수 있다.
        생성 후 배열의 길이를 늘리거나 줄일 수 없다.
        배열 요소에 대한 접근과 변경의 시간 복잡도는 O(1)이다.
     */
        private final int[] array1 = {1,2,3,4,5};             // 변수 생성과 함께 초기화
        private final int[] array2 = new int[] {1,2,3,4,5};   // 변수 생성과 함께 생성자로 초기화
        private final int[] array3 = new int[5];              // 변수 생성을 하지만, 값을 넣지는 않음.

        public void setArray3(int a, int b, int c, int d, int e){
            int[] Nums = {a,b,c,d,e};
            for(int i = 0; i < 5; i++){
                array3[i] = Nums[i];
            }
        }
    }

    public static class ArrayList{
        /*
           ☞ List
            코딩테스트에서 일반적으로 ArrayList를 의미한다.
            가장 큰 차이점은
                Array는 "크기가 고정"되어 있어서, 데이터를 삭제하거나 삽입할 수 없지만,
                ArrayList는 "가변하는 크기"이므로 크기를 늘리거나 줄일 수 있다는 것이다.

             데이터를 맨 뒤에 추가 O(1)
             데이터를 삭제하거나 중간에 삽입할 때 O(N)

         */
        ArrayList list = new ArrayList();

        public void setArray3(int a, int b, int c, int d, int e){
            int[] Nums = {a,b,c,d,e};
            for(int i = 0; i < 5; i++){
//                list[i] = Nums[i];
            }
        }
    }

    public static void main(String[] args){
    // ======== Array ========
        Array AC = new Array();

        // ======== 값 설정 전 ========
        System.out.println("[array1 값] : " + Arrays.toString(AC.array1));
        System.out.println("[array2 값] : " + Arrays.toString(AC.array2));
        System.out.println("[array3 값] : " + Arrays.toString(AC.array3) + "\n");

        // ======== 값 설정 후 ========
        AC.setArray3(6,7,8,9,10);
        System.out.println("[array1 값] : " + Arrays.toString(AC.array1));
        System.out.println("[array2 값] : " + Arrays.toString(AC.array2));
        System.out.println("[array3 값] : " + Arrays.toString(AC.array3));

        /*
         < 결과값 >
            [array1 값] : [1, 2, 3, 4, 5]
            [array2 값] : [1, 2, 3, 4, 5]
            [array3 값] : [0, 0, 0, 0, 0]

            [array1 값] : [1, 2, 3, 4, 5]
            [array2 값] : [1, 2, 3, 4, 5]
            [array3 값] : [6, 7, 8, 9, 10]
         */

    }

}
