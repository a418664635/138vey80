package com.bootdo.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bootdo.system.domain.RoleDO;
import com.bootdo.system.domain.model.SysRole;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 角色
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-02 20:24:47
 */
@Mapper
public interface RoleDao extends BaseMapper<SysRole>{

	RoleDO get(Long roleId);
	
	List<RoleDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(RoleDO role);
	
	int update(RoleDO role);
	
	int remove(Long roleId);
	
	int batchRemove(Long[] roleIds);

	List<String> listUserRoles(Long userId);
}
