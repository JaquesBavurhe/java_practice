//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CourseAccess {
    static void main() {
        //conditions and loops

        String paymentStatus = "SUCCESS";
        
        if (paymentStatus.equals("SUCCESS")){
            System.out.println("Payment successful");
        } else if (paymentStatus.equals("PENDING")) {
            System.out.println("your payment is being processed ");
        } else if (paymentStatus.equals("REFUND")) {
            System.out.println("your payment is being refunded");
        } else {
            System.out.println("Access not  allowed");
        }

        //switch
        switch (paymentStatus){
            case "SUCCESS" -> System.out.println("Payment successful");
            case "PENDING" -> System.out.println("your payment is being processed ");
            case "REFUNDED" -> System.out.println("your payment is being refunded");
            default -> System.out.println("Access not  allowed");
        }

        //loops
        int watchedLessons = 5;
        int totalLessons = 10;

        for (int lesson = 1; lesson <= watchedLessons ; lesson++) {
            System.out.println("lesson " + lesson + " is completed");
        }

        //while loop
        int lesson =1;
        while (lesson <= watchedLessons){
            System.out.println("lesson " + lesson + " is completed");
            lesson ++;
        }
    }
}
