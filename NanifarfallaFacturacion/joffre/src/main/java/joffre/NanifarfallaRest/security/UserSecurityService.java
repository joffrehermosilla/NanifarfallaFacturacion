package joffre.NanifarfallaRest.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import joffre.NanifarfallaRest.model.PasswordRessetToken;
import joffre.NanifarfallaRest.repository.PasswordRessetTokenRepository;

import javax.transaction.Transactional;
import java.util.Calendar;

@Service
@Transactional
public class UserSecurityService implements ISecurityUserService {

    @Autowired
    private PasswordRessetTokenRepository passwordTokenRepository;

    @Override
    public String validatePasswordResetToken(String token) {
        final PasswordRessetToken passToken = passwordTokenRepository.findByToken(token);

        return !isTokenFound(passToken) ? "invalidToken"
                : isTokenExpired(passToken) ? "expired"
                : null;
    }

    private boolean isTokenFound(PasswordRessetToken passToken) {
        return passToken != null;
    }

    private boolean isTokenExpired(PasswordRessetToken passToken) {
        final Calendar cal = Calendar.getInstance();
        return passToken.getExpiryDate().before(cal.getTime());
    }
}