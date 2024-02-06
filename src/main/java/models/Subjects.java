package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subjects {
    private int subject_id;
    private String subject_name;
    private int subject_code;

    public void validateSubjectCode(){
        try{
            if (String.valueOf(subject_code).length()>3){
                throw new IllegalArgumentException("Invalid subject code format: " + subject_code);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    @Override
    public String toString() {
        return subject_id + " " + subject_name + " " + subject_code;
    }
}
