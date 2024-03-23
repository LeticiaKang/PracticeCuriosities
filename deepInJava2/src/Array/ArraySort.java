package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {

    public int[] solution(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args){
        ArrayList<int[]> samples = new ArrayList<>();
        samples.add(new int[]{1, -5, 2, 4, 3});
        samples.add(new int[]{2, 1, 1, 3, 2, 5, 4});
        samples.add(new int[]{6,1,7});

        // 수정: ArraySort의 인스턴스를 생성합니다.
        ArraySort arraySort = new ArraySort();

        // 수정: 각 int[] 배열에 대해 solution 메서드를 호출합니다.
        for(int[] sample : samples){
            int[] sortedSample = arraySort.solution(sample);
            System.out.println(Arrays.toString(sortedSample));  // 정렬된 배열을 출력합니다.
        }
    }
}
