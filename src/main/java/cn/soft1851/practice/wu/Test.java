package cn.soft1851.practice.wu;

/**
 * @author jh_wu
 * @ClassName Test
 * @Description TODO
 * @Date 2020/2/23:0:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        People people = name -> {
            System.out.print(name+"去银行");
        };
        people.people("吴家浩");
        Bank bank = active -> {
            System.out.print(active+"100块");
        };
        bank.Money("取了");
        Market market = delicious -> {
            System.out.println(delicious+"泡面");
        };
        market.shop("买");
    }
}
