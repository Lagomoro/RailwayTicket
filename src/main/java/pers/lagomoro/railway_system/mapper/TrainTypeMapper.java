package pers.lagomoro.railway_system.mapper;

import pers.lagomoro.railway_system.entity.TrainType;

public interface TrainTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(TrainType record);

    int insertSelective(TrainType record);

    TrainType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(TrainType record);

    int updateByPrimaryKey(TrainType record);
}