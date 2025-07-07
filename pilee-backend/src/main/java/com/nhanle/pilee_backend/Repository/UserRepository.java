package com.nhanle.pilee_backend.Repository;

import com.nhanle.pilee_backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Có thể thêm các method custom nếu cần
} 