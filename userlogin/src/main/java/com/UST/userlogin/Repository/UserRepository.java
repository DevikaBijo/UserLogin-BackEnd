package com.UST.userlogin.Repository;

import com.UST.userlogin.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,java.lang.String> {
}
