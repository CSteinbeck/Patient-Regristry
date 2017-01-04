package FinalEntry;

/**
 * Created by calebtaylor on 1/3/2017.
 */
public class DataEntry1 {
    private String LastName;
    private String FirstName;
    private String Gender;
    private String Age;
    private String Description;

    public DataEntry1(String FirstName, String LastName, String Gender, String Age, String Description){

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.Age = Age;
        this.Description = Description;


    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
