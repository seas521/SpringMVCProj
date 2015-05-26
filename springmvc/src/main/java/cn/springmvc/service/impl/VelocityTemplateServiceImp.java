package cn.springmvc.service.impl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.stereotype.Service;

import cn.springmvc.service.VelocityTemplateService;
@Service
public class VelocityTemplateServiceImp implements VelocityTemplateService{

	public void generateTmpl() {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();
		Template t = ve.getTemplate("templates/template1.vm");
		 VelocityContext ctx = new VelocityContext();
		 
		 ctx.put("name", "velocity");
		 ctx.put("date", (new Date()).toString());
		 ctx.put("title", "my title1");
		 ctx.put("loginName","My login1");
		 ctx.put("placeholder","Please input your username1");
		 ctx.put("loginButton","Login1");
		 try {
			PrintWriter pw = new PrintWriter("test.html");
			t.merge(ctx, pw);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}

}
