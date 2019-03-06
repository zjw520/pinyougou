package com.pinyougou.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * UserDetialsServiceImp
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2019-03-03<p>
 */
public class UserDetialsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
