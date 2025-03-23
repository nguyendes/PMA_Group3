package com.example.WebsiteBanHang2.Repository;

import com.example.WebsiteBanHang2.Dto.UserAccountDTO;
import com.example.WebsiteBanHang2.Model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
    UserAccount findByEmail(String email);
}
