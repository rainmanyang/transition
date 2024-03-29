package com.hxcy.service.account;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

import com.hxcy.entity.user;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional(readOnly = true)
public class AccountService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(AccountService.class);
	
	@Autowired
	private com.hxcy.dao.UserMapper userMapper;
	private DateProvider dateProvider = DateProvider.DEFAULT;

//	public List<user> getAllUser() {
//		return (List<User>) userMapper.;
//	}

	public user getUser(BigDecimal id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public user findUserByLoginName(String loginName) {
		return userMapper.findByLoginName(loginName);
	}

//	@Transactional(readOnly = false)
//	public void registerUser(User user) {
//		entryptPassword(user);
//		user.setRoles("user");
//		user.setRegisterDate(dateProvider.getDate());
//
//		userDao.save(user);
//	}
//
//	@Transactional(readOnly = false)
//	public void updateUser(User user) {
//		if (StringUtils.isNotBlank(user.getPlainPassword())) {
//			entryptPassword(user);
//		}
//		userDao.save(user);
//	}
//
//	@Transactional(readOnly = false)
//	public void deleteUser(Long id) {
//		if (isSupervisor(id)) {
//			logger.warn("操作员{}尝试删除超级管理员用户", getCurrentUserName());
//			throw new ServiceException("不能删除超级管理员用户");
//		}
//		userDao.delete(id);
//		taskDao.deleteByUserId(id);
//
//	}
//
//	/**
//	 * 判断是否超级管理员.
//	 */
//	private boolean isSupervisor(Long id) {
//		return id == 1;
//	}
//
//	/**
//	 * 取出Shiro中的当前用户LoginName.
//	 */
//	private String getCurrentUserName() {
//		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
//		return user.loginName;
//	}
//
//	/**
//	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
//	 */
//	private void entryptPassword(User user) {
//		byte[] salt = Digests.generateSalt(SALT_SIZE);
//		user.setSalt(Encodes.encodeHex(salt));
//
//		byte[] hashPassword = Digests.sha1(user.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
//		user.setPassword(Encodes.encodeHex(hashPassword));
//	}
//
//	@Autowired
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
//
//	@Autowired
//	public void setTaskDao(TaskDao taskDao) {
//		this.taskDao = taskDao;
//	}
//
//	public void setDateProvider(DateProvider dateProvider) {
//		this.dateProvider = dateProvider;
//	}
}
