public class BankAcctApp {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Bank Account Application!");

        // Test data entry
        System.out.println("Enter customer details:");

        System.out.print("Customer ID: ");
        String customerId = DataEntry.enterString(5);

        System.out.print("Customer SSN (9 digits): ");
        String customerSSN = DataEntry.enterNumericString();
        while (customerSSN.length() != 9) {
            System.out.println("SSN must be 9 digits. Please enter again:");
            customerSSN = DataEntry.enterNumericString();
        }

        System.out.print("Last Name: ");
        String lastName = DataEntry.enterString(20);

        System.out.print("First Name: ");
        String firstName = DataEntry.enterString(15);

        System.out.print("Street: ");
        String street = DataEntry.enterString(20);

        System.out.print("City: ");
        String city = DataEntry.enterString(20);

        System.out.print("State (2 characters): ");
        String state = DataEntry.enterString(2);

        System.out.print("Zip (5 digits): ");
        String zip = DataEntry.enterNumericString();
        while (zip.length() != 5) {
            System.out.println("Zip code must be 5 digits. Please enter again:");
            zip = DataEntry.enterNumericString();
        }

        System.out.print("Phone (10 digits): ");
        String phone = DataEntry.enterNumericString();
        while (phone.length() != 10) {
            System.out.println("Phone number must be 10 digits. Please enter again:");
            phone = DataEntry.enterNumericString();
        }

        // Create a customer object
        Customer customer = new Customer(customerId, customerSSN, lastName, firstName, street, city, state, zip, phone);

        // Display customer details
        System.out.println("\nCustomer details:");
        System.out.println(customer);
    }
}
