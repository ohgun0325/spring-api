package site.esgaida.api.soccer.stadium.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "stadiums")
public class StadiumEntity {

    @Id
    private Long id;
    private String stadiumId; // stadium_id
    private String stadiumName; // stadium_name
    private String hometeamId; // hometeam_id
    private String seatCount; // seat_count
    private String address; // address
    private String ddd; // ddd
    private String tel; // tel
}
