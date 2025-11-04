package site.esgaida.api.soccer.team.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDTO {

    private String teamId; // team_id
    private String regionName; // region_name
    private String teamName; // team_name
    private String eTeamName; // e_team_name
    private String origYyyy; // orig_yyyy
    private String zipCode1; // zip_code1
    private String zipCode2; // zip_code2
    private String address; // address
    private String ddd; // ddd
    private String tel; // tel
    private String fax; // fax
    private String homepage; // homepage
    private String owner; // owner
    private String stadiumId; // stadium_id
}
