package rxz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import rxz.pojo.Student;

import java.util.List;

@Repository
public interface StudentDao {
    public void add(Student student);

    List<Student> findAll();

    void updateById(Student student);

    void deleteById(Integer id);
}
