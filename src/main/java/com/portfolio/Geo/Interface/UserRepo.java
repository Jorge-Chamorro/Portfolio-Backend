
package com.portfolio.Geo.Interface;

import com.portfolio.Geo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, String>{
    User findByUserId(String userId);
}
