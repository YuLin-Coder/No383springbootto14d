package com.entity.view;

import com.entity.JiedaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接待信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
@TableName("jiedaixinxi")
public class JiedaixinxiView  extends JiedaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiedaixinxiView(){
	}
 
 	public JiedaixinxiView(JiedaixinxiEntity jiedaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiedaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
