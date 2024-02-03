import java.util.Scanner;

class Exam{
    Scanner sc = new Scanner(System.in);

    String name;
    String User;
    String pass;

    int count=0;
    int ans;

    public void register(){
        boolean checkIfValid = false;
        do {
            try {
                System.out.print("Enter Your Name : ");
                name = sc.nextLine();
                if(name.matches(".*\\d.*")) {
                    throw new Exception("a");
                }
                System.out.print("Set Your Username : ");
                User = sc.nextLine();
                if(User.matches(".*\\d.*")) {
                    throw new Exception("a");
                }
                System.out.print("Set Your Password : ");
                pass = sc.nextLine();
                if(!pass.matches(".*\\d.*")) {
                    throw new Exception("a");
                }
                System.out.print("User Registered Successfully !\nProceed to Login\n");
                System.out.println("-------------------------------------------------------");
                checkIfValid=true;
            }catch(Exception ex){
                System.out.println("Invalid Credentials, please register again!!!");
            }
            }while(!checkIfValid);
    }
    public boolean login() {

        boolean is_Login = false;

        while ( !is_Login ) {
            System.out.print("Enter Your Username : ");
            String user_name = sc.nextLine();
            System.out.print("Enter Your password : ");
            String password = sc.nextLine();
            if ( user_name.equals(User) & password.equals(pass) ) {

                System.out.print("\nLogin Successful  !!\n");
                System.out.println("-------------------------------------------------------");
                is_Login = true;

            }
            else {
                System.out.println("\n Username or password not found");
            }
        }
        return is_Login;
    }

    void test(){
        System.out.println("Select following subject:");
        System.out.println("1.Core Java \n2.Operating System \n3.DBMS");
        System.out.println("Enter your choice:");
        int option=sc.nextInt();
        System.out.println("There are 5 questions in the examination");


        System.out.println("Each question consist of 4 option you have to choose correct answer");
        switch (option) {
            case 1:
                count = 0;
                System.out.println("Q.1.Java is developed by:");

                System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 1) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.2.Which of the following is not a Java features?");
                System.out.println("1.Dynamic\n2.Architecture Neutral\n3.Use of Pointers\n4.Object-oriented");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 3) {
                    ++count;
                }
                System.out.println("Q.3.Java is:");
                System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 2) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.4. In which memory a String is stored, when we create a string using new operator?");
                System.out.println("1.Stack\n2.String memory\n3.Heap Memory\n4.Random storage space");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 3) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.5.Java is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                System.out.println("---------------------------");

                if (ans == 3) {
                    ++count;
                    System.out.println("Correct");

                }
                break;


            case 2:
                count = 0;
                System.out.println("Q.1.What is the main function of the command interpreter?:");

                System.out.println("1.to provide the interface between the API and application program\n2.to handle the files in the operating system\n3.to get and execute the next user-specified command\n4.None");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 3) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.2.In Operating Systems, which of the following is/are CPU scheduling algorithms?");
                System.out.println("1. Priority\n2. Round Robin\n3.Shortest Job First\n4. All of the mentioned");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 4) {
                    ++count;
                    System.out.println("Correct");

                }
                System.out.println("Q.3.To access the services of the operating system, the interface is provided by the ___________");
                System.out.println("1. Library\n2.System calls\n3.Assembly instructions\n4.API");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 2) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.4. Which one of the following is not a real time operating system?");
                System.out.println("1.RTLinux\n2. Palm OS\n3.QNX\n4.VxWorks");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 2) {
                    ++count;
                }
                System.out.println("Q.5.What does OS X has?");
                System.out.println("1.monolithic kernel with modules\n2.microkernel\n3.monolithic kernel\n4.hybrid kernel");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 4) {
                    ++count;
                    System.out.println("Correct");

                }
                break;

            case 3:

                count = 0;
                System.out.println("Q.1.What is the full form of DBMS?");

                System.out.println("1. Data of Binary Management System\n2. Database Management System\n3. Database Management Service\n4. Data Backup Management System");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 2) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.2.Who created the first DBMS?");
                System.out.println("1.Edgar Frank Codd\n2.Charles Bachman\n3. Charles Babbage\n4.Sharon B. Codd");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 2) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.3. Which of the following is not a type of database?");
                System.out.println("1.Hierarchical\n2.Network\n3.Distributed\n4.Decentralized");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 4) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.4.  Which of the following is not an example of DBMS?");
                System.out.println("1.MySQL\n2. Microsoft Acess\n3.IBM DB2\n4. Google");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 4) {
                    ++count;
                    System.out.println("Correct");
                }
                System.out.println("Q.5.Which of the following is a component of the DBMS?");
                System.out.println("1.Data\n2. Data Languages\n3.Data Manager\n4.All of the above");
                System.out.print("Enter answer:");
                ans = sc.nextInt();
                if (ans == 4) {
                    ++count;
                    System.out.println("Correct");
                }
            break;
        }




    }

    void view_marks(){
        if(count > 3){
            System.out.println("Congratulations  "+name+"  You scored "+count+" marks "+"out of 5 \n\n");
            System.out.print("-----------------------------* * * ----------------------------\n\n");
        }
        else{
            System.out.print("Well Done!  "+name+" but, you scored only "+count+" marks out of 5 !\nStudy hard for next time \n\n");
            System.out.print("-----------------------------* * * ----------------------------\n\n");
        }
    }



}

