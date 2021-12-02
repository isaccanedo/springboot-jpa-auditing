package net.isaccanedo.springboot.springboot2jpaauditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.isaccanedo.springboot.springboot2jpaauditing.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
