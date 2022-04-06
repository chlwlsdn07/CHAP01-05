// arraycopy 메소드 활용 
public class chap05_04 {
    public static void main(String[] args) {
        int[] sourceData = new int[]{1,2,3};
        int[] targetData = new int[3];

        System.arraycopy(sourceData, 0, targetData, 0,3 );
        // (원본, 원본배열의위치, 대상, 대상배열의위치, 복사할길이)

        for(int i=0; i<3; i++){
            System.out.println("targetData["+i+"] =" +targetData[i]);
        }
    }

}
