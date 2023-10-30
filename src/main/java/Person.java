public class Person {
    private String firstName;
    private String lastName;
    private int social;
    private byte age;
    private static int count;

    public Person(){
        this.firstName = "N/A";
        this.lastName = "";
        count++;
    }
    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = -1;
        count++;
    }
    public Person(String firstName, String lastName, int social){
        this.firstName = firstName;
        this.lastName = lastName;
        this.social = social;
        this.age = Animal.getAge();
        count++;
    }

    public void speak(){
        if(this.firstName == "N/A"){
            System.out.println("I don't have name.");
        }
        else if(this.age >= 0){
            System.out.println("My name is " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old.");
        }
        else{
            System.out.println("My name is " + this.firstName + " " + this.lastName);
        }
    }
    public static int getPersonCount(){
        return count;
    }

    public String toString(){
        if(social > 99999999){
            return this.firstName + " " + this.lastName + " " + Integer.toString(this.social).substring(5); 
        }
        return this.firstName + " " + this.lastName;
    }

}
