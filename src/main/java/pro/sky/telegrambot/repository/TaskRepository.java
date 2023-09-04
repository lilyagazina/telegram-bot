package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<NotificationTask, Long> {
///////////////////
    List<NotificationTask> findTaskByTime(LocalDateTime dateTime);
}