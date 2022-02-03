package joffre.NanifarfallaRest.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.stream.Stream;
import joffre.NanifarfallaRest.model.PasswordRessetToken;



@Repository
public interface PasswordRessetTokenRepository extends JpaRepository<PasswordRessetToken, Integer> {
    PasswordRessetToken findByToken(String token);

 //   PasswordRessetToken findByUser(Usuario user);

    Stream<PasswordRessetToken> findAllByExpiryDateLessThan(Date now);

    void deleteByExpiryDateLessThan(Date now);

	/*
	 * @Modifying
	 * 
	 * @Query("delete from PasswordResetToken t where t.expiryDate <= ?1") void
	 * deleteAllExpiredSince(Date now);
	 */
}
