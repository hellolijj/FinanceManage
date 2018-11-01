package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserHold;

import java.util.List;

public interface UserHoldMapper extends Mapper<UserHold> {
    public List<UserHold> selectByUid(String uid);
}