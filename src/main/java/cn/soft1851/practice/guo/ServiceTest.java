package cn.soft1851.practice.guo;

/**
 * 描述:
 * 函数式编程测试
 *
 * @author：Guorc
 * @create 2020-02-23 0:26
 */
public class ServiceTest {
    public static void main(String[] args) {
        PeopleService peopleService = peopleName -> {
            System.out.print(peopleName+"购买了一本");
        };
        peopleService.peopleName("郭瑞昌");
        BookService bookService = (name,price) -> {
            System.out.println(name+"书");
        };
        bookService.sellBook("java",66.00);
        //调用静态方法
        BookService.calPrice("郭瑞昌",66.00);
    }
}
