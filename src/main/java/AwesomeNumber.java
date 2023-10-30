public class AwesomeNumber {
    private int num;

    public AwesomeNumber(int num){
        this.num = num;
    }

    public static int add(AwesomeNumber num1, AwesomeNumber num2){
        int sum = 0;
        sum = num1.getNum() + num2.getNum();

        return sum;

    }
    public static int subtract(AwesomeNumber num1, AwesomeNumber num2){
        int sub = 0;
        sub = num1.getNum() - num2.getNum();

        return sub;

    }

    public int getNum(){
        return this.num;
    }

}
