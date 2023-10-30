public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(int length,int width){
        this.width = width;
        this.length = length;
    }

    public void draw(){
        for(int i = 1; i <= width;i++){
            for(int j = 1; j<=length;j++){
                if((i==1)||(i==width)||(j==1)||(j==length)){
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
