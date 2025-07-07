package com.nhanle.pilee_backend.Repository;

import com.nhanle.pilee_backend.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Có thể thêm các method custom nếu cần
} 