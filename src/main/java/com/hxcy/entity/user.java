package com.hxcy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class user {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.ID
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.LOGIN_NAME
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.NAME
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.PASSWORD
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.SALT
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.ROLES
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private String roles;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CC_USER.REGISTER_DATE
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    private Date registerDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.ID
     *
     * @return the value of CC_USER.ID
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.ID
     *
     * @param id the value for CC_USER.ID
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.LOGIN_NAME
     *
     * @return the value of CC_USER.LOGIN_NAME
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.LOGIN_NAME
     *
     * @param loginName the value for CC_USER.LOGIN_NAME
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.NAME
     *
     * @return the value of CC_USER.NAME
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.NAME
     *
     * @param name the value for CC_USER.NAME
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.PASSWORD
     *
     * @return the value of CC_USER.PASSWORD
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.PASSWORD
     *
     * @param password the value for CC_USER.PASSWORD
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.SALT
     *
     * @return the value of CC_USER.SALT
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.SALT
     *
     * @param salt the value for CC_USER.SALT
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.ROLES
     *
     * @return the value of CC_USER.ROLES
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public String getRoles() {
        return roles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.ROLES
     *
     * @param roles the value for CC_USER.ROLES
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CC_USER.REGISTER_DATE
     *
     * @return the value of CC_USER.REGISTER_DATE
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CC_USER.REGISTER_DATE
     *
     * @param registerDate the value for CC_USER.REGISTER_DATE
     *
     * @mbggenerated Thu Mar 07 15:38:35 CST 2013
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}