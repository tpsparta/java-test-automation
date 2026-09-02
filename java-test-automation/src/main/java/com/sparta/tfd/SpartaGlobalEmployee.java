
public class SpartaGlobalEmployee {
    //define the variables
    private String firstName;
    private String lastName;
    private String email;




    public SpartaGlobalEmployee(String fName, String lName, String eMail){
        firstName = fName;
        lastName = lName;
        email = eMail;

    }

    //Putting Getters and Setters
    //makes 'Main' access and change private strings

    // right-click -> generate -> getters and setters


    public String getFirstName() {
        return firstName;
    }


    private int appointmentsQuantity;
    private boolean appointmentsQuantityMutex;

    public boolean addAppointments(int quantity) {
        if (appointmentsQuantityMutex == false) {
            this.appointmentsQuantityMutex = true;
            this.appointmentsQuantity = this.appointmentsQuantity + quantity;
            this.appointmentsQuantityMutex = false;
            return true;
        }
        return false;
    }





    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print(){
        System.out.print("First Name: " + firstName +
                "\nLast Name : " + lastName +
                "\nE-mail: "+ email);
    }
}
 