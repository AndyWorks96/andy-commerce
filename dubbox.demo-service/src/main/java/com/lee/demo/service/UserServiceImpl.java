package com.lee.demo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * ��ʱҪͨ��application*.xml�ļ�����ע������
 * @author ����
 *����ע�⣬���ⷢ����ע�ᵽע������
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		
		return "lee";
	}

}
