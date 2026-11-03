package org.Arrays;

public class task_4 {
    public int meth1(){
        int arr[] = {5,6,7,8};
        int sum=0;
        if(arr.length>=2) {
            for (int i = 0; i <= 1; i++) {
                sum += arr[i];
            }
            return sum;
        }
        else if (arr.length==1) {
            for (int i = 0; i < 1; i++) {
                sum += arr[i];
            }
        }
        else {
            return 0;
        }
        System.out.println("meth1");
        return sum;

    }
    public void meth2(){}
    public static void main(String[] args) {
        task_4 obj = new task_4();
        System.out.println(obj.meth1());
    }
}
