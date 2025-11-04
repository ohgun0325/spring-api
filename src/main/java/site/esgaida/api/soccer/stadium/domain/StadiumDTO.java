package site.esgaida.api.soccer.stadium.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StadiumDTO {

    private String stadiumId; // stadium_id
    private String stadiumName; // stadium_name
    private String hometeamId; // hometeam_id
    private String seatCount; // seat_count
    private String address; // address
    private String ddd; // ddd
    private String tel; // tel
}
