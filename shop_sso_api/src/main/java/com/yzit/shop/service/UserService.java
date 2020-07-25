package com.yzit.shop.service;
import java.util.List;

import com.yzit.framework.web.ui.AjaxResult;
import com.yzit.shop.entity.User;
//import com.github.pagehelper.PageInfo;
/**
 * 
 * <br>
 * <b>功能：</b>用户表--服务实现类<br>
 * <b>作者：</b>Administrator<br>
 * <b>日期：</b> 2020-05-22 <br>
 * <b>版权所有： 2020，云优众<br>
 */ 
public interface UserService {
	/**
	 * 保持对象
	 * 
	 * @param user
	 */
	public int save(User user);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int del(Long id);

	/**
	 * 修改对象
	 * 
	 * @param user
	 */
	public int  update(User user);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<User> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param user
	 * @return
	 */
	public List<User> findByList(User user);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public User  findById(Long id);

	
	/**
     * 批量删除信息
     * 
     * @param ids 需要删除的ID集合
     * @return 结果
     */
    public boolean batchDel(Long[] ids) ;

    // 登录
    User doLogin(User user);

    AjaxResult checkUser(User user);
}