package com.sample.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.sample.resources.EmployeeResource;

public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(EmployeeResource.class);
		return s;
	}
}