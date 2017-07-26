package com.fengshuo.EtcdAuth.Dao;

/**
 * Created by fengshuo on 2017/7/25.
 */

import javax.transaction.Transactional;

import com.fengshuo.EtcdAuth.Entity.User;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUsername(String username);
    //public EtcdUser etcdUserCreate(String username, String password);
    //public boolean  etcdUserLoginValidate(String username, String password);

}
