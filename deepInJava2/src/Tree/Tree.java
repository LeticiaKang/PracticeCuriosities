package Tree;

import java.util.Arrays;
import java.lang.Math;

public class Tree {
    /*
        이진트리를 표현한 nodes를 인자로 받는다.
        이진트리에 대해 preorder, inorder, postorder 결과를 반환하는 solution을 구현하세요.

        제약 : 노드값의 개수는 1이상 1000 이하 / 노드값은 정수형이며 중복은 없다.
        // TODO: 중복이 있다면? 3개 이상의 중복이 있으면?
     */

    public static void main(String[] args){
        Tree tree = new Tree();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(tree.solution(input)));

        System.out.println("=================================");
        System.out.println( Math.log10(16)/Math.log10(2));

    }

    private String[] solution(int[] sample) {
        String[] result = new String[3];
        result[0] = preorder(sample, 0).trim();
        result[1] = inorder(sample, 0).trim();
        result[2] = postorder(sample, 0).trim();
        return result;
    }

    private String preorder(int[] sample, int i) {
        String result = "";
        if(i >= sample.length){
            return result;
        }
        return sample[i] + " "
            + preorder(sample, 2*i +1)
            + preorder(sample, 2*i +2);
    }

    private String inorder(int[] sample, int i) {
        String result = "";
        if(i >= sample.length){
            return result;
        }
        return inorder(sample, 2*i +1)
            + sample[i]
            + " " + inorder(sample, 2*i +2);
    }

    private String postorder(int[] sample, int i) {
        System.out.println("지나감 : " + i);
        String result = "";
        if (i >= sample.length) {
            return result;
        }
        // 왼쪽 서브트리의 후위 순회 결과
        String left = postorder(sample, 2*i + 1);


        // 오른쪽 서브트리의 후위 순회 결과
        String right = postorder(sample, 2*i + 2);

        // 현재 노드를 처리
        result = left + right + sample[i] + " ";

        // 디버깅 정보 출력
        System.out.println("Node " + sample[i] + ": Left -> " + left + "Right -> " + right + "Result -> " + result);

        return result;
    }
}
