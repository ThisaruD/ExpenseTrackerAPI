package com.pairlearning.expensestrackerapi.services;

import com.pairlearning.expensestrackerapi.domain.User;
import com.pairlearning.expensestrackerapi.exception.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
