package com.fengshuo.EtcdAuth.Service;

/**
 * Created by fengshuo on 2017/7/26.
 */

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}