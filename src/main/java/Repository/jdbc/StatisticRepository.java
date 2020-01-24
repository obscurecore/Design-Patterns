package Repository.jdbc;

import DAO.model.PhoneModel;
import Repository.model.Statistic;
import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public interface StatisticRepository<Entity extends Statistic, Range extends Statistic.TimeRange> {
    // Сущности работает со Статистстикой

    List<Entity> getStat(List<PhoneModel> models, Range range, Comparator<Entity> comp);

    List<Entity> getStatRevenueLess(BigDecimal threshold, Range range, Comparator<Entity> comp);

    List<Entity> getStatRevenueMore(BigDecimal threshold, Range range, Comparator<Entity> comp);

    default String modelWildcards(final @NotNull int models) {
        if (models == 0) {
            return "";
        } else if (models == 1) {
            return "AND m.name = (?) ";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(" AND (m.name = (?) ");
            for (int i = 0; i < models - 1; i++) {
                sb.append(" OR m.name = (?) ");
            }
            sb.append(") ");
            return sb.toString();
        }
    }
}
