package rxz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rxz.dao.StudentDao;
import rxz.pojo.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public boolean add(Student student) {
        try {
            studentDao.add(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public boolean updateById(Student student) {
        try {
            studentDao.updateById(student);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean deleteById(Integer id) {
        try {
            studentDao.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
