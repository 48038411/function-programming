package cn.soft1851.practice.yang;

/**
 * @author ysx
 * @date  2020/2/23
 * 函数测试
 */
public interface Serviceest {
    public static void main(String[] args) {
        People people = name -> {
            System.out.println(name + "买了一杯");
        };
        people.buyPeopleName("杨苏祥");
        MikTea mikTea = price -> {
            System.out.print(price +"的奶茶");
        };
        mikTea.buy(10.8);
    }
}
