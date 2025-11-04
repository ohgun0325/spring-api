package site.esgaida.api.soccer.player.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class PlayerVO {

    private String playerId; // player_id
    private String playerName; // player_name
    private String ePlayerName; // e_player_name
    private String nickname; // nickname
    private String joinYyyy; // join_yyyy
    private String position; // position
    private String backNo; // back_no
    private String nation; // nation
    private String birthDate; // birth_date
    private String solar; // solar
    private String height; // height
    private String weight; // weight
    private String teamId; // team_id
}
