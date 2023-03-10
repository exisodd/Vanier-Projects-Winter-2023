package test1;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        // Bank 1
        Bank bank1 = new Bank();
        bank1.setName("TD");
        bank1.setBranch("CDG");
        bank1.setRevenue(800230.0);
        bank1.setAddress("1234 Rue Stuff");
        bank1.setNoOfCustomers(200);

        // Bank 2
        Bank bank2 = new Bank();
        bank2.setName("RBC");
        bank2.setBranch("StMichel");
        bank2.setRevenue(950000.0);
        bank2.setAddress("492 Boulevard Something");
        bank2.setNoOfCustomers(250);

        // Bank 3
        Bank bank3 = new Bank();
        bank3.setName("TD");
        bank3.setBranch("StLaurent");
        bank3.setRevenue(699000.0);
        bank3.setAddress("4500 Boulevard Imaginary");
        bank3.setNoOfCustomers(222);

        // Bank 4
        Bank bank4 = new Bank();
        bank4.setName("RBC");
        bank4.setBranch("StLaurent");
        bank4.setRevenue(600010.0);
        bank4.setAddress("1030 Street Wilson");
        bank4.setNoOfCustomers(209);

        // Bank 5
        Bank bank5 = new Bank();
        bank5.setName("TD");
        bank5.setBranch("StMichel");
        bank5.setRevenue(742351.0);
        bank5.setAddress("1030 Street Wilson");
        bank5.setNoOfCustomers(241);

        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(bank1);
        banks.add(bank2);
        banks.add(bank3);
        banks.add(bank4);
        banks.add(bank5);

        // 4.1 Find all branch names for a particular bank (RBC & TD) whose revenue is 600k-750k
        System.out.println("-----4.1-----");
        System.out.println("Bank: TD (600k-750k)");
        for (Bank bank: banks) {
            if (bank.getRevenue() >= 600000.0 && bank.getRevenue() <= 750000.0 && bank.getName().equals("TD")) {
                System.out.println("-Branch name: " + bank.getBranch());
                System.out.println("-Revenue: " + bank.getRevenue());
            }
        }
        System.out.println("Bank: RBC (600k-750k)");
        for (Bank bank: banks) {
            if (bank.getRevenue() >= 600000.0 && bank.getRevenue() <= 750000.0 && bank.getName().equals("RBC")) {
                System.out.println("-Branch name: " + bank.getBranch());
                System.out.println("-Revenue: " + bank.getRevenue());
            }
        }
        System.out.println();

        System.out.println("-----4.2-----");
        // 4.2 Count total number of customers for all the banks
        int totalCustomers = 0;
        for (Bank bank: banks) {
            totalCustomers += bank.getNoOfCustomers();
        }
        System.out.println("Total number of customers: " + totalCustomers);
        System.out.println();

        // 4.3 Display the bank that makes more revenue
        System.out.println("-----4.3-----");
        Bank mostRevenueBank = new Bank();
        mostRevenueBank.setRevenue(Double.MIN_VALUE);
        for (Bank bank: banks) {
            if (bank.getRevenue() > mostRevenueBank.getRevenue()) {
                mostRevenueBank = bank;
            }
        }
        System.out.println("Bank with most revenue: ");
        System.out.println("Bank: " + mostRevenueBank.getName());
        System.out.println("Branch name: " + mostRevenueBank.getBranch());
        System.out.println("Revenue: " + mostRevenueBank.getRevenue());

    }

}

