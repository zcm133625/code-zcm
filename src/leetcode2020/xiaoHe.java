package leetcode2020;

public class xiaoHe {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        System.out.println(sum(arr,0,0,4));
    }
    public static int sum(int[] arr, int sum, int start,int end){
        if ( start == end){
            return sum;
        }
        int mid = (start + end) / 2;
        sum = sum(arr,sum,start,mid);
        sum = sum(arr,sum,mid+1,end);
        sum = merge(arr,sum,start,mid,end);
        return sum;
    }
    public static int merge(int[] arr, int sum, int L, int M, int R){
        int sum1 = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R){
            if (arr[p1] < arr[p2]){
                sum1 = sum1 + arr[p1++];
            }else if (arr[p1] >= arr[p2]){
                p1 = L;
                p2++;
            }
        }
        sum = sum1 + sum;
        return sum;
    }
}
