package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.UserModel;

public interface UserService {
    String addUser(UserModel user);
    public String encrypt(String password);

    UserModel findUserByNama(String username);

    String changePassword(UserModel user, String password);
}
