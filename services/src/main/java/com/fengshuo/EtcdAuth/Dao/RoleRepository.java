package com.fengshuo.EtcdAuth.Dao;

/**
 * Created by fengshuo on 2017/7/25.
 */

import com.fengshuo.EtcdAuth.Entity.Role;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface RoleRepository extends CrudRepository<Role, Long> {

    public Role findByRoleName(String roleName);
    //public EtcdUser etcdUserCreate(String username, String password);
    //public boolean  etcdUserLoginValidate(String username, String password);

}
