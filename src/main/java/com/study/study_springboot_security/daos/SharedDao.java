package com.study.study_springboot_security.daos;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Repository
@Component
public class SharedDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.selectList(sqlMapId);
        return result;
    }

    public Object getOne(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.selectOne(sqlMapId, dataMap);
        return result;
    }

    public Object update(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.update(sqlMapId, dataMap); // update() return값은 업데이트 수 int형이다 0이면 안됐다는 것
        return result;
    }

    public Object delete(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.delete(sqlMapId, dataMap); // delete() return값은 삭제한 수 int형이다 0이면 안됐다는 것
        return result;
    }

    public Object insert(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.insert(sqlMapId, dataMap); // insert() return값은 삽입한 수 int형이다 0이면 안됐다는 것
        return result;
    }
}
