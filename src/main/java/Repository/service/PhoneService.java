package Repository.service;


import Repository.model.Statistic;

import java.util.SortedSet;

public interface PhoneService {
    SortedSet<Statistic> getStatLastYear();
}
