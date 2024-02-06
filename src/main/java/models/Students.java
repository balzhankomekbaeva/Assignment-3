package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Students {
    private int student_id;
    private int user_id;
    private String student_name;
    private String student_dob;
    private String student_address;

    public void validateStudentDOB(){
        try{
            if ((!student_dob.contains(".")) & (student_dob.length() != 8)){
                throw new IllegalArgumentException("Invalid Date of Birth format: " + student_dob);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void validateStudentAddress(){
        try{
            if (!student_address.contains("/")){
                throw new IllegalArgumentException("Invalid address format: " + student_address);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    @Override
    public String toString() {
        return student_id + " " +  user_id + " " + student_name + " " + student_dob + " " + student_address;
    }
}
