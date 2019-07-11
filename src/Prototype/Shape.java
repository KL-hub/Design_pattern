package Prototype;

/**
 * 作用：用于创建重复的对象，同时更能保证性能，提供创建对象的最佳方式，当创建对象比较耗资源时，缓存对象，再次创建时返回该对象的克隆
 *
 *
 */
public abstract  class Shape  implements  Cloneable{
    private String id;
    protected   String type;
    abstract  void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  String  getType(){
        return  type;
    }
    @Override
    public  Object clone(){
        Object clone=null;
        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
