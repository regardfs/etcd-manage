package com.fengshuo.EtcdAuth.Entity;

/**
 * Created by fengshuo on 2017/7/26.
 */


import lombok.Getter;
import lombok.Setter;

import com.fengshuo.Framework.base.entity.BaseEntity;

import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "role")
@EntityListeners({ AuditingEntityListener.class })
public class Role extends BaseEntity {

    @Getter
    @Setter
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long roleId;

    @Getter
    @Setter
    @Id
    private String roleName;

    @Setter
    @Getter
    private int rolePrivilge;

    @Setter
    @Getter
    private Set<User> users;


}
