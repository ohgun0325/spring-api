package site.esgaida.api.soccer.schedule.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDTO {

    private String scheDate; // sche_date
    private String stadiumId; // stadium_id
    private String gubun; // gubun
    private String hometeamId; // hometeam_id
    private String awayteamId; // awayteam_id
    private String homeScore; // home_score
    private String awayScore; // away_score
}
