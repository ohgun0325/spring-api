package site.esgaida.api.soccer.stadium.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class StadiumVO {

    private String stadiumId; // stadium_id
    private String stadiumName; // stadium_name
    private String hometeamId; // hometeam_id
    private String seatCount; // seat_count
    private String address; // address
    private String ddd; // ddd
    private String tel; // tel
}
