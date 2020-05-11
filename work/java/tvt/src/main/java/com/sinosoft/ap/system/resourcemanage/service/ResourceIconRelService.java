package com.sinosoft.ap.system.resourcemanage.service;

import java.util.List;

import com.sinosoft.ap.system.resourcemanage.domain.ResourceIconRelEntity;

/***
 * @since 2017 年  04 月 07 日 01:39:43 
 */
public interface ResourceIconRelService {

	 /**
     * 根据给定的参数新增一条数据
     * @param ResourceIconRelEntity
     */
	void save( ResourceIconRelEntity resourceIconRelEntity ) throws Exception ;
	
    /**
     * 根据给定条件删除一条数据，条件可以有多个
     * @param ResourceIconRelEntity
     */
	void remove( ResourceIconRelEntity resourceIconRelEntity ) throws Exception ;
	
    /**
     * 根据给定参数，查找相关数据，支持多条件查询
     * @param ResourceIconRelEntity
     * @return List<ResourceIconRelEntity>
     */
	List<ResourceIconRelEntity> find( ResourceIconRelEntity resourceIconRelEntity) throws Exception ;
	
}