package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Appointment {

    private String createdBy;
    private String createdDate;
    private int id;
    private String startDate;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private String description;
    private Physician physician;
    private Patient patient;
    private String ctests;

/*
{
     "createdBy": "hastateam50",
     "createdDate": "2022-08-09T07:52:05.968664Z",
     "id": 169761,
     "startDate": "2022-08-16T00:00:00Z",
     "endDate": "2022-08-16T01:00:00Z",
     "status": "PENDING",
     "anamnesis": null,
     "treatment": null,
     "diagnosis": null,
     "prescription": null,
     "description": null,
     "physician": {
          "createdBy": "medunnat50",
          "createdDate": "2022-08-04T09:28:09.012406Z",
          "id": 154299,
          "firstName": "Doktor",
          "lastName": "Team50",
          "birthDate": "1999-12-31T22:00:00Z",
          "phone": "555-555-5555",
          "gender": "MALE",
          "bloodGroup": "Apositive",
          "adress": "",
          "description": "",
          "user": {
               "createdBy": "anonymousUser",
               "createdDate": "2022-08-04T08:53:59.563805Z",
               "id": 156599,
               "login": "doktorteam50",
               "firstName": "newFirstName",
               "lastName": "yeniLastName",
               "email": "yeni1@gmail.com",
               "activated": true,
               "langKey": "en",
               "imageUrl": null,
               "resetDate": null,
               "ssn": "555-78-9908"
          },
          "speciality": "PATHOLOGY",
          "country": null,
          "cstate": null,
          "examFee": 300.00,
          "image": "",
          "imageContentType": null
     },
     "patient": {
          "createdBy": "hastateam50",
          "createdDate": "2022-08-09T07:52:05.968242Z",
          "id": 169369,
          "firstName": "Hasta",
          "lastName": "GokhanTeam50",
          "birthDate": null,
          "phone": "541-789-6666",
          "gender": null,
          "bloodGroup": null,
          "adress": null,
          "email": "evren@gmail.com",
          "description": null,
          "user": {
               "createdBy": "hastateam50",
               "createdDate": "2022-08-09T07:52:05.966994Z",
               "id": 169344,
               "login": "user_112233445_56677889991660031525848",
               "firstName": "Hasta",
               "lastName": "GokhanTeam50",
               "email": "evren@gmail.com",
               "activated": false,
               "langKey": null,
               "imageUrl": null,
               "resetDate": null,
               "ssn": "566-78-6606"
          },
          "inPatients": null,
          "country": null,
          "cstate": null
     },
     "ctests": null
}
 */



}

