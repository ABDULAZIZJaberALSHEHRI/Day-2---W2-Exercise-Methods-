import java.util.Objects;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Question '1'
        System.out.println("Question '1':");
        System.out.println("Find smallest number among three numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the 1st number:");
        int num_1 = input.nextInt();
        System.out.println("please enter the 2nd number:");
        int num_2 = input.nextInt();
        System.out.println("please enter the 3rd number:");
        int num_3 = input.nextInt();
        System.out.println("The smallest value is: " + "'"+smallest(num_1,num_2,num_3)+ "'.");


        //Question '2'
        System.out.println("\nQuestion '2':");
        System.out.println("Check if the entered number is negative or positive or zero: ");
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        System.out.println(checking(num));



        //Question '3'
        System.out.println("\nQuestion '3':");
        System.out.println("A password must have at least ten characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits.");
        System.out.println("Enter you password: ");
        input.nextLine();
        String pass= input.next();
        if (password(pass)){
            System.out.println("Password is valid: " + pass);
        }else {
            System.out.println("Password is not valid, please be sure to follow the password instructions.");
        }



        //METHODS:
    }
    //Question '1'
    public static int smallest (int num_1, int num_2, int num_3){
        int number=0;
        if (num_1 <= num_2 && num_1 <= num_3) {
            number= num_1;
        }
        if (num_2 <= num_1 && num_2 <= num_3) {
            number= num_2;
        }
        if (num_3 <= num_2 && num_3 <= num_1) {
            number= num_3;
        }
        return number;
    }

    //Question '2'
    public static String checking (int num){
        String num_state="";

        if (num > 0) {
            num_state = "Positive";
        } else if (num<0) {
            num_state ="Negative";
        }
        else{
            num_state ="zero";}
        return num_state;
    }


    //Question '3'
    public static boolean password(String pass){
        int digit=0;
        int achar = 0;

        if (pass.length()<8) {
            return false;
        }

        for (int i = 0; i < pass.length(); i++) {
            char char_sort = pass.charAt(i);
            char_sort = Character.toUpperCase(char_sort);
            if (char_sort >= 'A' && char_sort <='Z'){
                achar++;
            } else if (char_sort >= '0' && char_sort <= '9') {
                digit++;
            } else
                return false;
        }

        return achar >= 1 && digit >= 2;
    }
}