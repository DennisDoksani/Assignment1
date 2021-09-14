import java.util.Scanner;

public class First_Assignment {
    public First_Assignment(){

    }
    public static void main(String[] args){
        First_Assignment myProgram = new First_Assignment();
        myProgram.Start();
    }

    void Start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println(name + " " + age);
    }
}
