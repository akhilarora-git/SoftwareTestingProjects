package ex_08_Arrays;

public class Lab043_Arrays_Sum {
    public static void main(String[] args) {

        int [] numbers = {2,4,2,5,6,2};
        int sum =0;
        System.out.println("----------");
        for(int i = 0; i < numbers.length;i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        int sum1 = 0;
        for(int n:numbers){ //this is enhanced for Loop
            sum1=sum1+ n;   //this will not go with indexation this will take all the inputs
        }
        System.out.println(sum1);
    }
}
