package Noa.Project.repository;

import Noa.Project.domain.SubTask;
import Noa.Project.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTaskRepo extends JpaRepository<SubTask, Task> {
}
