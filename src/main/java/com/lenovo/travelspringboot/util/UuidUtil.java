package com.lenovo.travelspringboot.util;

import java.util.UUID;

/**
 * 产生UUID随机字符串工具类
 */
public final class UuidUtil {
	private UuidUtil(){}
	public static String getUuid(){
		return UUID.randomUUID().toString().replace("-","");
	}
	/**
	 * 测试
	 */
	public static void main(String[] args) {
		String substring = UuidUtil.getUuid().substring(0, 5);
		System.out.println(substring);
//		System.out.println(UuidUtil.getUuid());
//		System.out.println(UuidUtil.getUuid());
//		System.out.println(UuidUtil.getUuid());
//		System.out.println(UuidUtil.getUuid());
	}
}
