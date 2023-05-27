package com.driver.repository;

import com.driver.model.Station;
import com.driver.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrainRepository extends JpaRepository<Train,Integer> {

    List<Train> findByRouteContains(Station station);
}
