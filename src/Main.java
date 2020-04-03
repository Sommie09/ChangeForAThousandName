import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int hundredNaira = 100;
        int twoHundredNaira = 200;
        int fiveHundred = 500;
        int oneThousand = 1000;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Change For A Thousand Game!");
        System.out.println("Your goal is to enter enough change to make up to #1000");

        System.out.println("Enter your number of hundreds");
        int numOfHundreds = scan.nextInt();

        System.out.println("Enter your number of two hundreds");
        int numOfTwoHundreds = scan.nextInt();

        System.out.println("Enter your number of five hundreds");
        int numOfFiveHundreds = scan.nextInt();

        scan.close();

        long total = numOfFiveHundreds * fiveHundred + numOfHundreds * hundredNaira + numOfTwoHundreds * twoHundredNaira;


        if(total < oneThousand){
            long less = oneThousand- total;
            System.out.println("Opps not up to a thousand" + ", Your short by "+less+"naira");
        } else if (total > oneThousand) {
            long more = total - oneThousand;
            System.out.println("You went over the bridge" + " cut by "+more+"naira");
        }else{
            System.out.println("Yaaaay, you made up to a hundred");
        }






    }
}
