import java.util.ArrayList;
import java.util.List;

public class Calculator implements Calculatable {
    private List<String> history = new ArrayList<String>();
    public Integer add(Integer num1, Integer num2){
        int sum = num1 + num2;
        history.add(String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + String.valueOf(sum));
        return (Integer) sum;
    }
    public Integer subtract(Integer num1, Integer num2){
        int sub = num1 - num2;
        history.add(String.valueOf(num1) + " - " + String.valueOf(num2) + " = " + String.valueOf(sub));

        return  (Integer)sub;
    }
    public Integer multiply(Integer num1, Integer num2){
        int prod = num1 * num2;
        history.add(String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + String.valueOf(prod));

        return (Integer) prod;
    }
    public Integer divide(Integer num1, Integer num2){
        int div = 0;
        if(num2 != 0){
            div = num1 / num2;
        }
        history.add(String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + String.valueOf(div));

        return (Integer) div;
    }
    public String getHistory(){
        String output = "[";
        for(int i = 0; i < history.size(); i++){
            output += history.get(i) + ", ";
        }
        output += "]";
        return output;
    }
}
