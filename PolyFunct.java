import java.util.Scanner;
/** 
 *Creates a graph and options to determine a y value from a specified x value or graphs the function from a given range. 
 */
public class Polyfunct {

    public static void main(String[] args) {
        String skip;
        Scanner in = new Scanner(System.in);
        //Ask for the power of the function
        // Asks which type of graph
        System.out.println("Enter power of your polynomial or enter \"q\" to quit");
        String deg = in.nextLine();
        if (deg == "q") {
            return;
        }
        int degree = Integer.valueOf(deg);

        //creating function
        Grapher function;
        System.out.println("Insert the coefficients of the function (a, b, c, etc.) in order, leading coefficient first.");
        if (degree==0) {
            int n1 = in.nextInt();
            skip = in.nextLine();
            function = new Grapher(n1);
        }
        else if (degree==1) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            skip = in.nextLine();
            function = new Grapher(n1, n2);
        }
        else if (degree==2) {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int n3 = in.nextInt();
            skip = in.nextLine();
            function = new Grapher(n1, n2, n3);
        }
        else {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int n3 = in.nextInt();
            int n4 = in.nextInt();
            skip = in.nextLine();
            function = new Grapher(n1, n2, n3, n4);
        }


        //command prompting
        int choice;
        while (true) {
            //Ask which command to execute
            System.out.println("What do you want to do? Type the number:");
            System.out.println("0: quit" + "\n" + "1: f(x)" + "\n" + "2: graphing");
            choice = in.nextInt();
            skip = in.nextLine();
            if (choice==1) {
                System.out.println("x value: ");
                int x = in.nextInt();
                skip = in.nextLine();
                System.out.println(function.f(x));
            }

            else if (choice==2) {

                System.out.println("enter range (two numbers spaced):");
                int a = in.nextInt();
                int b = in.nextInt();
                skip = in.nextLine();

                System.out.println("enter plotting character type");
                String s = in.nextLine();
                Stars star = new Stars(s);
                Grapher.graph(a, b, star, function);
            }

            else if (choice==0) {
                break;
            }

        }
    }
}
