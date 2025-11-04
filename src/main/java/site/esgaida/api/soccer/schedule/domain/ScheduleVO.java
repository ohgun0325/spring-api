package site.esgaida.api.soccer.schedule.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class ScheduleVO {

    private String scheDate; // sche_date
    private String stadiumId; // stadium_id
    private String gubun; // gubun
    private String hometeamId; // hometeam_id
    private String awayteamId; // awayteam_id
    private String homeScore; // home_score
    private String awayScore; // away_score
}
