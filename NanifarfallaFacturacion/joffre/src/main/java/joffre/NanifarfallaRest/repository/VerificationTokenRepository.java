package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;


import joffre.NanifarfallaRest.model.VerificationToken;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {
    VerificationToken findByToken(String token);

 //   VerificationToken findByUser(Usuario user);

  // Stream<VerificationToken> findAllByExpiryDateLessThan(Date now);

    void deleteByExpiryDateLessThan(Date now);

	/*
	 * @Modifying
	 * 
	 * @Query("delete from VerificationToken t where t.expiryDate <= ?1") void
	 * deleteAllExpiredSince(Date now);
	 */

	Optional<VerificationToken> findById(Integer token_id);

	void deleteById(Integer tokenId);
}
