package pers.lagomoro.railway_system.mapper.unused;

import pers.lagomoro.railway_system.entity.unused.RuleEnabled;

public interface RuleEnabledMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(RuleEnabled record);

    int insertSelective(RuleEnabled record);

    RuleEnabled selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(RuleEnabled record);

    int updateByPrimaryKey(RuleEnabled record);
}