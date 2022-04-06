import java.util.Arrays;

// Arrays 메소드
public class chap05_06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,4};
        int index = -1;

        // 배열을 문자열로 반환
        String str = Arrays.toString(a);
        System.out.println(str);
        // key 값과 같은 값의 요소를 찾아 몇 번째 요소인지 주소를 반환
        index = Arrays.binarySearch(a, 3);
        System.out.println(index);
        // 배열 a, b, c의 요소가 동일한지 검사한다
        int [] b = {1,2,3,5,4};
        int [] c = {1,2,3,4,5};
        boolean isEquals = false;
        isEquals = Arrays.equals(a, b);
        System.out.println(isEquals);
        isEquals = Arrays.equals(a, c);
        System.out.println(isEquals);

        //배열 정렬
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //배열을 val값으로 채운다
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));
        
        
    }
    
}
