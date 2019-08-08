package com.cpq.mybatispulslearn.linyi.village_cottage.mapper;

import com.cpq.mybatispulslearn.linyi.village_cottage.entity.VillageCottage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 社区物业信息表 Mapper 接口
 * </p>
 *
 * @author cpq
 * @since 2019-08-07
 */
public interface VillageCottageMapper extends BaseMapper<VillageCottage> {
    List<Map<String, String>> zhuhu();
}
