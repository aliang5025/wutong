package com.parasol.common.converter;

import java.util.regex.Pattern;

	/**
	 * 校验器：利用正则表达式校验邮箱、手机号等
	 * 
	 * @author wuliang
	 * 
	 */
public class Validator {
	
		/**
	     * 正则表达式：验证用户名
	     */
	public static final String REGEX_USERNAME = "^[a-zA-Z0-9]{6,18}$";//^[a-zA-Z]\w{3,12}$
	
		/**
	     * 正则表达式：验证密码
	     */
	public static final String REGEX_PASSWORD = "^[a-zA-Z0-9_\\s]{6,18}$";//^[0-9a-zA-Z_]{6,12}$
	
		/**
	     * 正则表达式：验证手机号
	     */
	public static final String REGEX_MOBILE = "^1[34578]\\d{9}$";//1[3|4|5|7|8][0-9]{9}
	
		/**
	     * 正则表达式：验证邮箱
	     */
	public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";//正则有问题^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$
	
		/**
	     * 正则表达式：验证汉字
	     */
	public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";//正则有问题…^[\u4e00-\u9fa5]{0,8}$
	
		/**
	     * 正则表达式：验证身份证
	     */
	public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";//^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$

		/**
	     * 正则表达式：验证URL
	     */
	public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";//[a-zA-z]+://[^\s]*
	
		/**
	     * 正则表达式：验证IP地址
	     */
	public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
	
		/**
	     * 校验用户名
	     * 
	     * @param username
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isUsername(String username) {
		
		return Pattern.matches(REGEX_USERNAME,username);
		
	}
		/**
	     * 校验密码
	     * 
	     * @param password
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isPassword(String password) {
		
		return Pattern.matches(REGEX_PASSWORD, password);
		
	}
		/**
	     * 校验手机号
	     * 
	     * @param mobile
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isMobile(String mobile) {
		
		return Pattern.matches(REGEX_MOBILE, mobile);
		
	}
		/**
	     * 校验邮箱
	     * 
	     * @param email
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isEmail(String email) {
		
		return Pattern.matches(REGEX_EMAIL, email);
	
	}

		/**
	     * 校验汉字
	     * 
	     * @param chinese
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isChinese(String chinese) {
		
		return Pattern.matches(REGEX_CHINESE, chinese);
	
	}

		/**
	     * 校验身份证
	     * 
	     * @param idCard
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isIDCard(String idCard) {
		
		return Pattern.matches(REGEX_ID_CARD, idCard);
	
	}

		/**
	     * 校验URL
	     * 
	     * @param url
	     * @return 校验通过返回true，否则返回false
	     */
	public static boolean isUrl(String url) {
		
		return Pattern.matches(REGEX_URL, url);
	
	}

		/**
	     * 校验IP地址
	     * 
	     * @param ipAddr
	     * @return
	     */
	public static boolean isIPAddr(String ipAddr){
		
		return Pattern.matches(REGEX_IP_ADDR, ipAddr);
	
	}
	
	public static void main(String[] args) {
		String username = "fdsdfsdj";
		System.out.println(Validator.isUsername(username));
		System.out.println(Validator.isChinese(username));
		}
	}