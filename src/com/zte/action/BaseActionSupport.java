package com.zte.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


public class BaseActionSupport extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	protected Logger logger = LogManager.getLogger(getClass());
}
