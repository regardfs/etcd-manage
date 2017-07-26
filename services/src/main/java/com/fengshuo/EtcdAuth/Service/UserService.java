package com.fengshuo.EtcdAuth.Service;

/**
 * Created by fengshuo on 2017/7/26.
 */
import com.fengshuo.EtcdAuth.Entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
