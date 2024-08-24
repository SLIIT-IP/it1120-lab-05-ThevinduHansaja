import java.util.Scanner;

public class IT24101843Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1, num2;


        System.out.println("Enter the start Date (1-31):");
        num1 = input.nextInt();


        System.out.println("Enter the End Date (1-31):");
        num2 = input.nextInt();


        if (num1 >= 1 && num1 <= 31 && num2 >= 1 && num2 <= 31 && num1 < num2) {
            // Calculate the number of days reserved
            int num3 = num2 - num1;
            double RoomChargePerDay = 48000.00; // Room charge per day
            double totalAmount = RoomChargePerDay * num3; // Total amount

            System.out.println("Room Charge Per Day: Rs.48000.00");
            System.out.println("Numbers of Days Reserved: " + num3);


            if (num3 >= 5) {
                totalAmount = totalAmount - (totalAmount * 0.2); // 20% discount
                System.out.println("Total Amount to be Paid: Rs." + totalAmount);
            } else if (num3 >= 3 && num3 <= 4) {
                totalAmount = totalAmount - (totalAmount * 0.1); // 10% discount
                System.out.println("Total Amount to be Paid: Rs." + totalAmount);
            } else {
                System.out.println("Total Amount to be Paid: Rs." + totalAmount); // No discount
            }
        } else if (num1 >= num2) {

            System.out.println("Error: Start day must be less than the End day");
        } else {

            System.out.println("Error: Days must be between 1 and 31");
        }


    }
}
