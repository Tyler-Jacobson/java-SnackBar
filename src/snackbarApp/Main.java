package snackbarApp;

public class Main {
    public static void main(String[] args) {
        // Snack sn1 = new Snack("3Musketeers", 9, 1.25);
        // System.out.println(sn1.getName());

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        // System.out.println(jane.getName() + " : " + jane.getCashOnHand() + " : " + jane.getId());
        // System.out.println(bob.getName() + " : " + bob.getCashOnHand() + " : " + bob.getId());

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");


        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        // System.out.println(jane.getCashOnHand());
        // System.out.println(soda.getQuantity());
        jane.buySnacks(soda.buySnack(3));
        System.out.println(jane.getCashOnHand());
        System.out.println(soda.getQuantity());

        jane.buySnacks(pretzel.buySnack(1));
        System.out.println(jane.getCashOnHand());
        System.out.println(pretzel.getQuantity());

        bob.buySnacks(soda.buySnack(2));
        System.out.println(bob.getCashOnHand());
        System.out.println(soda.getQuantity());

        jane.addCash(10);
        System.out.println(jane.getCashOnHand());

        jane.buySnacks(chocolateBar.buySnack(1));
        System.out.println(jane.getCashOnHand());
        System.out.println(chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());

        bob.buySnacks(pretzel.buySnack(3));
        System.out.println(bob.getCashOnHand());
        System.out.println(pretzel.getQuantity());
    }
}