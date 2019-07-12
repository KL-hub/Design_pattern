package Filter;

import java.util.List;

/**
 * 允许开发人员使用不同的标准来过一组对象，通过逻辑运算以解耦的方式  把他们 连接起来
 */

public interface Criteria {
    public  List<Person> meetCriteris(List<Person> personList);
}
