package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {

    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private Country country;
    private String inPatients;
    private State cstate;



    //        "patient": {
    //            "createdBy": "anonymousUser",
    //            "createdDate": "2022-01-13T18:14:21.637681Z",
    //            "id": 8354,
    //            "firstName": "Arlen",
    //            "lastName": "Williamson",
    //            "birthDate": "1010-02-01T18:38:32Z",
    //            "phone": "4387221874",
    //            "gender": "FEMALE",
    //            "bloodGroup": "Bnegative",
    //            "adress": "Fettek",
    //            "email": "nora.shanahan@yahoo.com",
    //            "description": "We are conducting Medunna",

}
