package leetcode2020;

public class Test1217 {
    public static void main(String[] args) {
        int a[]={1,3,4,2,5,7,5,4,2,23,5};
        leftSum(a);


    }
    public static void leftSum(int a[]){


        int leftSuM=0;
        for (int i=0;i<a.length;i++){
            if (i==0){
                continue;
            }else {
                for (int j=0;j<i;j++){
                    if (a[i]>a[j]){
                        leftSuM+=a[j];
                    }
                }
            }
        }
        System.out.println(leftSuM);

    }
}
