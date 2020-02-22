package cn.soft1851.practice.guo;
@FunctionalInterface
public interface BookService {
    void sellBook(String name,Double price);

    /**
     * 编写静态方法，不算做抽象方法
     * @param name
     * @param price
     */
    static void calPrice(String name,Double price) {
        if (name == "郭瑞昌"){
            System.out.println("价格为"+price * 0.5);
        }
    }
}
