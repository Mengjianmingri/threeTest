package rxz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import rxz.pojo.Result;
import rxz.pojo.Student;
import rxz.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 增加student
     * @param student
     * @return
     */
    @RequestMapping("/add")
    public Result add(Student student){
        boolean flag = studentService.add(student);
        if (flag){
            return new Result(true,"添加成功!",student);
        }else {
            return new Result(false,"添加失败!");
        }
    }

    /**
     * 查询所有student
     * @return
     */
    @RequestMapping("/findAll")
    public Result findAll(){
        List<Student> students;
        try {
             students = studentService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"查询所有失败!");
        }
        return new Result(true,"查询所有成功!",students);
    }

    /**
     * 更新student
     * @param student
     * @return
     */
    @RequestMapping("/updateById")
    public Result updateById(Student student){
        boolean flag = studentService.updateById(student);
        if (flag){
            return new Result(true,"更新成功!",student);
        }else {
            return new Result(false,"更新失败!");
        }
    }

    @RequestMapping("/deleteById")
    public Result deleteById(Integer id){
        boolean flag = studentService.deleteById(id);
        if (flag){
            return new Result(true,"删除成功!");
        }else {
            return new Result(false,"删除失败!");
        }
    }
}
