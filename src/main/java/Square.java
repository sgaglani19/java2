public class Square extends Shape {
    private int num;
    
    public Square(int num){
        this.num = num;
    }

    public void draw(){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if((i==1)||(i==num) ||(j==1) || (j==num)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
