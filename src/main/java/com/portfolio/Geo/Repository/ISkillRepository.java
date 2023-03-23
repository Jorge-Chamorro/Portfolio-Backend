
package com.portfolio.Geo.Repository;

import com.portfolio.Geo.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long>{    
  }
