package joffre.NanifarfallaRest.security;


public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
