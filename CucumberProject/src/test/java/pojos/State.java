package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

private int id;
private String name;
private Country country;
// private State [] cstate;

    //  "cstate": {
    //                "id": 1251,
    //                "name": "Alaska",
    //                "country": {
    //                    "id": 1201,
    //                    "name": "US"
    //                }
    //            },
}
