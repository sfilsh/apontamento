package com.apontamento.main.repository;

import com.apontamento.main.domain.schedule.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySchedule extends JpaRepository<Schedule, Long> {
}
