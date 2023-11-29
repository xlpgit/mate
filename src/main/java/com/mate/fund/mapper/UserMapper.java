package com.mate.fund.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mate.fund.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
