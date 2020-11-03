package com.demo.demo.utils;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;
/**
 * @author Jiang
 * @version V1.0
 * @Package com.demo.demo.utils
 * @date 2020/10/29 20:40
 */
public interface BaseMapper<T> extends InsertListMapper<T>,Mapper<T> {
}
