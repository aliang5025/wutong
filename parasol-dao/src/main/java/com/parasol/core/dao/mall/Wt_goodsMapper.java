package com.parasol.core.dao.mall;

import com.parasol.core.mall.Wt_goods;

public interface Wt_goodsMapper {

    int deleteByPrimaryKey(Integer gdId);

    int insert(Wt_goods record);

    int insertSelective(Wt_goods record);

    Wt_goods selectByPrimaryKey(Integer gdId);

    int updateByPrimaryKeySelective(Wt_goods record);

    int updateByPrimaryKey(Wt_goods record);
}