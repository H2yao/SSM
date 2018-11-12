package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Student;
import com.example.service.InterStudentService;

@Controller
public class TestController {

	@Autowired(required=true)
	//默认为 @Autowired(required=true)，表示注入的时候，该bean必须存在，否则就会注入失败。
	//@Autowired(required=false)表示忽略当前要注入的bean，如果有直接注入，没有跳过，不会报错。
	private InterStudentService service;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "index";
	}
	/*@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addPage(){
		return "add";
	}*/
	/*@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deletePage(){
		return "delete";
	}*/
	/*@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addPage(){
		Student stu=new Student();
		ModelAndView modelAndView=new ModelAndView("add","command",stu);
		return modelAndView;
	}*/
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String deletePage(Model model){
		Student student =new Student();
		Map<Integer,String> idList=new HashMap<Integer,String>();
		List<Integer> list=service.getAllId();
		for(int i=0;i<list.size();i++){
			idList.put(list.get(i),list.get(i)+"");
		}
		model.addAttribute("stu", student);
		model.addAttribute("idList",idList);
		return "update";
	}
	
	
	/**
	 * @ add
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute("stu")Student stu,Model model){		
		if(service.checkID(stu.getId())){
			model.addAttribute("message",stu.getId()+"ID已有，添加失败！");
		}else{
			service.addStudent(stu);
			model.addAttribute("message",stu.getId()+"添加成功！");
		}
		return "message";
	}

	/**
	 * @ update
	 * @return
	 */
	@RequestMapping(value="/updateDeal",method=RequestMethod.POST)
	public String update(@ModelAttribute("stu")Student stu,Model model){
		System.out.println(stu);
		if(service.updateStudent(stu))
			model.addAttribute("message",stu.getId()+"修改成功！");
		else
			model.addAttribute("message",stu.getId()+"修改失败！");
		return "message";
	}
	
	/**
	 * 
	 * @param delete
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String getOneStudent(@RequestParam("id")int id,Model model){
		if(service.checkID(id)){
			service.deleteStudent(id);
			model.addAttribute("message",id+"删除成功！");
		}else{
			model.addAttribute("message",id+"没有该ID，删除失败！");
		}
		return "message";
		
	}
	
	/*@ResponseBody 加这个返回 了String字符串到界面*/
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String getAll(Model model){ 
		List<Student> user = service.showList();
		model.addAttribute("user",user);
		System.out.println(user);
		return "show";
	}
	
	@RequestMapping(value="/studentSelect",method=RequestMethod.POST)
	@ResponseBody
	public Student selectStudent(@RequestParam("id")int id){
		Student student=service.getOneStudent(id);
		System.out.println(student);
		return student;
	}
	
	/*@ModelAttribute("idList")
	public Map<String,String> getAllId(){
		Map<String,String> idList=new HashMap<String,String>();
		List<Integer> list=service.getAllId();
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			idList.put(String.valueOf(list.get(i)),list.get(i)+"1");
		}
		Set<String> set=idList.keySet();
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
		String key = (String) iterator.next();
		System.out.println(key+" "+idList.get(key));
		}
		return idList;
	}*/
		
}





