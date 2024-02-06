package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {
    private int user_id;
    private String name;
    private String surname;
    private String user_type;

    public void updateUserType(String newType){
        try{
            if (newType.equals("Student") || (newType.equals("Teacher"))) {
                this.user_type = newType;
            }
            else{
                throw new IllegalArgumentException("Invalid User type: " + newType);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    @Override
    public String toString() {
        return user_id + " " + name + " " + surname + " " + user_type;
    }
}