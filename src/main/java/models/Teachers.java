package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teachers {
    private int teacher_id;
    private int user_id;
    private String teacher_name;
    private String teacher_email;
    private int teacher_phone;

    public void validateTeacherEmail(){
        try{
            if(!teacher_email.contains("@")|| (!teacher_email.contains("."))){
                throw new IllegalArgumentException("Invalid email format: " + teacher_email);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void validateTeacherPhone(){
        try{
            if (String.valueOf(teacher_phone).length()!=6){
                throw new IllegalArgumentException("Invalid phone number: " + teacher_phone);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    @Override
    public String toString() {
        return teacher_id + " " +  user_id + " " + teacher_name + " " + teacher_email + " " +  teacher_phone ;
    }
}
