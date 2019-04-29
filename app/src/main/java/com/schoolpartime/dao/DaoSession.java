package com.schoolpartime.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.schoolpartime.dao.entity.SearchTitle;
import com.schoolpartime.dao.entity.UserInfo;
import com.schoolpartime.dao.entity.WorkType;
import com.schoolpartime.dao.entity.City;
import com.schoolpartime.dao.entity.UserCollect;

import com.schoolpartime.dao.SearchTitleDao;
import com.schoolpartime.dao.UserInfoDao;
import com.schoolpartime.dao.WorkTypeDao;
import com.schoolpartime.dao.CityDao;
import com.schoolpartime.dao.UserCollectDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig searchTitleDaoConfig;
    private final DaoConfig userInfoDaoConfig;
    private final DaoConfig workTypeDaoConfig;
    private final DaoConfig cityDaoConfig;
    private final DaoConfig userCollectDaoConfig;

    private final SearchTitleDao searchTitleDao;
    private final UserInfoDao userInfoDao;
    private final WorkTypeDao workTypeDao;
    private final CityDao cityDao;
    private final UserCollectDao userCollectDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        searchTitleDaoConfig = daoConfigMap.get(SearchTitleDao.class).clone();
        searchTitleDaoConfig.initIdentityScope(type);

        userInfoDaoConfig = daoConfigMap.get(UserInfoDao.class).clone();
        userInfoDaoConfig.initIdentityScope(type);

        workTypeDaoConfig = daoConfigMap.get(WorkTypeDao.class).clone();
        workTypeDaoConfig.initIdentityScope(type);

        cityDaoConfig = daoConfigMap.get(CityDao.class).clone();
        cityDaoConfig.initIdentityScope(type);

        userCollectDaoConfig = daoConfigMap.get(UserCollectDao.class).clone();
        userCollectDaoConfig.initIdentityScope(type);

        searchTitleDao = new SearchTitleDao(searchTitleDaoConfig, this);
        userInfoDao = new UserInfoDao(userInfoDaoConfig, this);
        workTypeDao = new WorkTypeDao(workTypeDaoConfig, this);
        cityDao = new CityDao(cityDaoConfig, this);
        userCollectDao = new UserCollectDao(userCollectDaoConfig, this);

        registerDao(SearchTitle.class, searchTitleDao);
        registerDao(UserInfo.class, userInfoDao);
        registerDao(WorkType.class, workTypeDao);
        registerDao(City.class, cityDao);
        registerDao(UserCollect.class, userCollectDao);
    }
    
    public void clear() {
        searchTitleDaoConfig.clearIdentityScope();
        userInfoDaoConfig.clearIdentityScope();
        workTypeDaoConfig.clearIdentityScope();
        cityDaoConfig.clearIdentityScope();
        userCollectDaoConfig.clearIdentityScope();
    }

    public SearchTitleDao getSearchTitleDao() {
        return searchTitleDao;
    }

    public UserInfoDao getUserInfoDao() {
        return userInfoDao;
    }

    public WorkTypeDao getWorkTypeDao() {
        return workTypeDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

    public UserCollectDao getUserCollectDao() {
        return userCollectDao;
    }

}
