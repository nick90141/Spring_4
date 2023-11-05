package Task_4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsername(String username);
    List<User> findByEmail(String email);

    @Query("UPDATE User u SET u.username = ?2, u.email = ?3 WHERE u.id = ?1")
    @Modifying
    @Transactional
    void updateUserInformation(Long id, String username, String email);


    @Query(value = "DELETE FROM User WHERE id = ?1", nativeQuery = true)
    @Modifying
    @Transactional
    void deleteUserById(Long id);
}
