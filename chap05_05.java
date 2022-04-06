import java.util.Scanner;

// 가변배열 활용

public class chap05_05 {
    public static void main(String[] args) {
        int [][] scores = new int [3][];
        Scanner scanner = new Scanner(System.in);
        
        //각 반 학생 수 입력받기
        for(int i=0; i<scores.length; i++){
            System.out.print("반당 학생수:");
            int size = scanner.nextInt();
            scores[i] = new int[size];
        }
        
        //3개 반 학생들의 점수 반복 입력
        for(int f=0; f<scores.length; f++){
            for(int s=0; s<scores[f].length; s++){
                System.out.print("점수 :");
                scores[f][s] = scanner.nextInt(); 
            }
        }
        // 모든 학생들의 점수의 합
        int sum = 0;
        for(int f=0; f<scores.length; f++){
            for(int s=0; s<scores[f].length; s++){
                sum = sum + scores[f][s];
            }
        }
        // 모든 학생 수 카운팅
        int totalNum = 0;
        for(int f=0; f<scores.length; f++){
                totalNum = totalNum + scores[f].length;
            }
        // 평균 구하기
        int avg = sum / totalNum;
        System.out.println("TotalNum :"+totalNum);
        System.out.println("Sum :"+sum);
        System.out.println("Avg :"+avg);

        scanner.close();
        
        }
        
        



        
    }
    

