package com.fadhilah.expensetrackerapi.services;

import com.fadhilah.expensetrackerapi.domain.User;
import com.fadhilah.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
