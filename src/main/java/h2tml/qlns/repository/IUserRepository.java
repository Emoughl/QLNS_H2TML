package h2tml.qlns.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import h2tml.qlns.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}