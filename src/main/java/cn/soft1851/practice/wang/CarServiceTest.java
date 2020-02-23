package cn.soft1851.practice.wang;

/**
 * @ClassName GreetingServiceTest
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/2/23 &10:58
 * @Version 1.0
 **/
public class CarServiceTest {
    public static void main(String[] args) {
       PeopleService peopleService = peopleName -> {
           System.out.println(peopleName + "购买了一辆");
       };
       peopleService.peopleName("wqy");
       CarService carService = (name,price) ->{
           System.out.println(name + "汽车");
       };
       carService.sellCar("本田",150000.00);
       CarService.equalName("王庆媛",150000.00);
    }
}
