/**
 * 递归
 *  什么是递归 ？ 递归就是方法自己调用自己
 *  但是一般情况使用不使用 因为它有可能会造成堆栈溢出(StackOverflowError)
 *      所以使用递归一定要写结束条件
 *      编写一个计算 1+n 的和
 *
 *
 */
public class Test {
    public static void main(String args[]) {

        int sum = sum1(3);
        System.out.println(sum);
    }
    //3+2+1
    public static int sum(int num) {
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static int sum1(int num) {
       if(num == 1){
           return 1;
       }
     return num * sum1(num-1);
        // 3 +  (sum1(3-1)=2) + sum1(2-1)=1
        // 3+2 +1
    }



}
