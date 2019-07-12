package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：
 *      又叫部分整体模式，是用于把一组相似的对象当做一个单一的对象
 *      (就是对象包含对象的问题)
 */

public class Employer {
    private String name;
    private  String dept;
    private  int salary;
    private List<Employer> employerList;

    public Employer(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        employerList =new ArrayList<>();
    }
    public  void add(Employer employer){
        employerList.add(employer);
    }
    public void  remove(Employer employer){
        employerList.remove(employer);
    }
    public List<Employer>  getSubordinates(){
        return  employerList;
    }
    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
