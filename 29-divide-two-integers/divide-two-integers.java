// class Solution {
//     public int divide(int dividend, int divisor) {

//         // int sign = ((dividend<0)^(divisor<0))?-1:1;
//         // dividend=Math.abs(dividend);
//         // divisor=Math.abs(divisor);
//         // int count=0,sum=0;
//         // while(sum+divisor<=dividend){
//         //     sum=sum+divisor;
//         //     count=count+1;
//         // }
//         // return sign*count;
//         // Math.abs() = number oda sign remove pannum
//     }
// }

class Solution{
    public int divide(int dividend, int divisor){
        if(dividend==Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int sign=((dividend<0) ^ (divisor<0))?-1:1;
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        long result=0;
        while(dvd>=dvs){
            long temp=dvs,multiple=1;
            while(dvd>=(temp<<1)){
                temp=temp<<1;
                multiple=multiple<<1;
            }
            result=result+multiple;
            dvd=dvd-temp;
        }
        if(sign==-1) return (int)(-result);
        else return (int)(result);
    }
}