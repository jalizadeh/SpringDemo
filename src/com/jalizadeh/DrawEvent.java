package com.jalizadeh;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 120987978048146409L;

	//the source indicates which class, made the event
	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public String toString() {
		return "Draw Event occured.";
	}

}
