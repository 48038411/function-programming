package cn.soft1851.practice.wang;

/**
 * @ClassName GretingService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/2/23 &10:57
 * @Version 1.0
 **/
@FunctionalInterface
public interface CarService {
    void sellCar(String name,Double price);

    static  void equalName(String name,Double price){
        if(name == "wqy"){
            System.out.println("价格为"+ price *100000);
        }
    }
}
