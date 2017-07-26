package com.fengshuo.EtcdAuth.Service;

/**
 * Created by fengshuo on 2017/7/26.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.fengshuo.EtcdAuth.Dao.UserRepository;
import com.fengshuo.EtcdAuth.Dao.RoleRepository;
import com.fengshuo.EtcdAuth.Entity.User;
import com.fengshuo.EtcdAuth.Entity.Role;


import java.util.Collection;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>((Collection<? extends Role>) roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}