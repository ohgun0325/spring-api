package site.esgaida.api.soccer.schedule.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "schedules")
public class ScheduleEntity {

    @Id
    private Long id;
    private String scheDate; // sche_date
    private String stadiumId; // stadium_id
    private String gubun; // gubun
    private String hometeamId; // hometeam_id
    private String awayteamId; // awayteam_id
    private String homeScore; // home_score
    private String awayScore; // away_score
}
