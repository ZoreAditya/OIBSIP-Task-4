
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("             ------------------------------            ");
        System.out.print(" ********** |   Online 1 System    | **********\n");
        System.out.println("             ------------------------------             ");


        System.out.print("Press 1 to register");
        int ch = sc.nextInt();

        Exam exam = new Exam();

        if (ch==1){
            exam.register();

            while(true){

                System.out.println("1.Login");
                System.out.println("2.Exit");
                System.out.print("Enter Your Choice - ");
                int user_choice = sc.nextInt();
                if(user_choice == 1){
                    if(exam.login()){
                        System.out.println("\n\n----------- WELCOME " + exam.name + " !! -----------\n");


                        boolean is_exit = false;

                        while(!is_exit){
                            System.out.println("1.Give online test");
                            System.out.println("2.View test Score");
                            System.out.println("3.Exit\n");

                            System.out.print("Enter your choice:");
                            int choice=sc.nextInt();

                            switch(choice)
                            {
                                case 1:
                                {
                                    exam.test();
                                    System.out.print("----------------------------Thanks for giving online test!----------------------------\n\n");
                                    break;
                                }
                                case 2:
                                {
                                    exam.view_marks();
                                    break;
                                }
                                case 3:
                                    is_exit = true;
                                    break;

                            }

                        }
                    }
                }
            }

        }
    }
}