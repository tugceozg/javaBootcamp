public class Person extends Customer {
    private String nationalId;
    private String firstName;
    private String lastName;

    public String getNationalId(){
        return nationalId;
    }
    public void setNationalId(String nationalId){
        this.nationalId = nationalId;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastname(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
