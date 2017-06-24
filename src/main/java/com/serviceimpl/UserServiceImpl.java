package com.serviceimpl;

import com.dao.UserMapper;
import com.entry.User;
import com.entry.UserExample;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserExample userExample;
    public User selectById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 获得Criteria
     * @return Criteria
     */
    private UserExample.Criteria getCriteria(){
      return userExample.createCriteria();
    }

    /**
     * 原本想着改mapper 但是觉得还太麻烦了  还是用example吧
     * @param user
     * @return
     */
    public boolean register(User user) {
        if(userMapper.selectByName(user.getUserName())==null) {
            userMapper.insertSelective(user);
            return true;
        }
        return false;
    }

    public boolean login(User user) {
        //获取criteria
        UserExample.Criteria criteria = getCriteria();
        //写入条件
        criteria.andUserNameEqualTo(user.getUserName()).andUserPassEqualTo(user.getUserPass());
        if(userMapper.selectByExample(userExample)!=null){
            //写入session
            return  true;
        }
        return false;
    }
}
