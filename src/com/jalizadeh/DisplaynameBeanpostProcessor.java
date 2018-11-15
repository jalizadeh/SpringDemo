package com.jalizadeh;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


//video #15
public class DisplaynameBeanpostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization: Bean name is: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization: Bean name is: " + beanName);
		return bean;
	}
	
	

}
