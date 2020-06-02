package com.rinzin.controller;

import com.rinzin.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ts")
public class TestController {
    /**
     * 测试
     * @return
     */
    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    /**
     * 获取学生列表
     * @param map
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView getList(ModelMap map){
        List<Student> studentList = new ArrayList<Student>();
        studentList = getStudentList();
        map.addAttribute("studentList",studentList);
        ModelAndView mv = new ModelAndView("list");
        mv.addAllObjects(map);
        return mv;
    }

    /**
     * 虚拟构造学生数据
     * @return
     */
    private List<Student> getStudentList(){
        List<Student> list = new ArrayList<Student>();
        for(int i=0;i<30;i++){
            Student student = Student.builder().setName("student"+i).setAge((int) (18+Math.random())).setHeight(1.75+i/10)
                    .setPhone("132263045"+i).setStuClass(i+"班").setWeight(90+i);
            list.add(student);
        }
        return list;
    }
}
