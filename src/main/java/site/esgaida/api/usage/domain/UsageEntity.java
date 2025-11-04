package site.esgaida.api.usage.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usages")
public class UsageEntity {

    @Id private Long id;
    private String corporateName; // 법인명
    private String supervisingAuthority; // 관장기관
    private String designationType; // 지정구분
    private String industry; // 지정업종(목표)/계획업종(할당)
    private String ghge; // 온실가스 배출량(tCO₂eq)
    private String energy; // 에너지 사용량(TJ)
    private String verification; // 검증수행기관
}
