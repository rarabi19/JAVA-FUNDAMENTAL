public class ProgramAnnualRevenue {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        
        //Calculator the sum at all monthly revenues
        double sum = 0.0;
        for (double monthlyRevenue : revenue) {
            sum += monthlyRevenue;
        }

        //Calculator the average monthly revenue
        double averageRevenue = sum / revenue.length;

        //Output the result as a double
        System.out.println(averageRevenue);
    }
}