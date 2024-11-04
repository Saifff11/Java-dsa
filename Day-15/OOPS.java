public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("yellow");
        p1.color = "yellow";
        System.out.println(p1.color); 

        BankAccount myAcc = new BankAccount();
        myAcc.username = "mdsaifali";
        // myAcc.password = "12345";
        myAcc.setPassword("12345678");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math)/3;
    }
}