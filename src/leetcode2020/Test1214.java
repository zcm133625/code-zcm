package leetcode2020;

public class Test1214 {
    public static void main(String[] args) {

        System.out.println(monotoneIncreasingDigits(3472));
    }
    public static int monotoneIncreasingDigits(int n){
        String x=String.valueOf(n);
        char xarray[]=x.toCharArray();
        String increaNum="";
        int maxNum=0;
        for (int i=xarray.length-1;i>0;i--){
            if(i==xarray.length-1){
                maxNum=Integer.valueOf(xarray[xarray.length-1]);
                if (maxNum==0){
                    break;
                }
                increaNum+=maxNum+"";
            }else{
                int y=xarray[i];
                while (y>maxNum){
                    y=y-1;
                }
                increaNum=increaNum+y;
            }

        }
        if (increaNum.trim().equals("")){
            return 0;
        }else {
            return Integer.valueOf(increaNum);
        }
    }
}
