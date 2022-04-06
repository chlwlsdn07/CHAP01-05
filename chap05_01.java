// 5명의 점수를 입력받아 평균 구하기.
import java.util.Scanner;
public class chap05_01 {
    public static void main(String[] args){
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);
        
        // 5명의 점수를 입력 받아 배열에 저장
        for(int i=0; i<5; i++){
            scores[i] = sc.nextInt();
            

        }
        // 배열의 값을 반복해서 읽고, sum에 합하기
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = sum + scores[i];
        }
        // sum의 평균 구하기
        int avg = sum/5;
        System.out.println("AVG : "+avg);
        sc.close();
    
    

        
    }
}
