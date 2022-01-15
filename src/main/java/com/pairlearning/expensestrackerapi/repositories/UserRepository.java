package com.pairlearning.expensestrackerapi.repositories;

import com.pairlearning.expensestrackerapi.domain.User;
import com.pairlearning.expensestrackerapi.exception.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User findById(Integer userId);

}
