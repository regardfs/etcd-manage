package com.fengshuo.EtcdAuth.Entity;


/**
 * Created by fengshuo on 2017/7/26.
 */

import lombok.Getter;
import lombok.Setter;

import com.fengshuo.Framework.base.entity.BaseEntity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 后台用户
 */

@Entity
@Table(name = "user")
@EntityListeners({ AuditingEntityListener.class })
public class User extends BaseEntity {

    //用户ID
    @Getter
    @Setter
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;

	//用户名称
	@Getter
    @Setter
    @Id
    private String username;
	 
	 //用户密码
	@Getter
    @Setter
    private String password;

	//密码确认
    @Getter
    @Setter
    private String passwordConfirm;

	@Getter
    @Setter
    @CreatedDate
    private Date createtime;
	 
	@Getter
    @Setter
    @LastModifiedDate
    private Date updateTime;

	//属于roles
	@Getter
    @Setter
    private Set<Role> roles;
}
