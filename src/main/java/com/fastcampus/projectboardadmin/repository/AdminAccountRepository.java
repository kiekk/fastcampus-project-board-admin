package com.fastcampus.projectboardadmin.repository;

import com.fastcampus.projectboardadmin.domain.admin.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {
}
