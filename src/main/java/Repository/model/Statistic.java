package Repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * <p>
 * Statistic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Statistic {

    private TimeRange range;

    private String model;

    private BigDecimal revenue;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class TimeRange {

        private Timestamp from;

        private Timestamp to;
    }

}
