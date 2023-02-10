package com.study.study_springboot_security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.study.study_springboot_security.daos.SharedDao;

public class PrincipalUserService implements UserDetailsService {

    @Autowired
    SharedDao sharedDao;

    @Override
    // url가 /login일때 spring security가 호출
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String sqlMapId = "Memberwithauthority.selectByUID";
        sharedDao.getOne(sqlMapId, username);
        return null;
    }

}
