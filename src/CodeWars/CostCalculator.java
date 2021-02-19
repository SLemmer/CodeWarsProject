package CodeWars;

class CostCalulator {
    /*a kata which asks the question:
     You will need a rental car in order for you to get around in your vacation.
     The manager of the car rental makes you some good offers.
     Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.
     Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
     */
    public static int rentalCarCost(int d) {
        int dailyRate = 40;
        int numberOfDaysRental = d;
        int totalCost=0;
        int sevenDayDiscount=50;
        int threeDayDiscount=20;

        if (numberOfDaysRental >=7){
            totalCost = (dailyRate * numberOfDaysRental)-sevenDayDiscount;
        } else if (numberOfDaysRental>2 && numberOfDaysRental<7) {
            totalCost = (dailyRate * numberOfDaysRental)-threeDayDiscount;
        } else {
            totalCost = (dailyRate * numberOfDaysRental);
        }


        return totalCost;
    }
}
