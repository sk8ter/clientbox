package ua.com.skarbmandriv.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.skarbmandriv.persistence.domain.User;

/**
 * @author Viktor Kostov (vko)
 * @since 20/01/16
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
