package id.tokorepo.sbsecure.service;

import id.tokorepo.sbsecure.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    Optional<User> findById(Long userId);
}
