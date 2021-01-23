package com.lee.demo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 此时要通过application*.xml文件告诉注册中心
 * @author 李星
 *服务注解，对外发布，注册到注册中心
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		
		return "lee";
	}

}
