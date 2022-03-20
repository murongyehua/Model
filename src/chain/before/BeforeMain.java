package chain.before;

import chain.common.Request;

public class BeforeMain {

    public static void main(String[] args) {
        Manager xmManager = new Manager("香木金利");
        Manager zjManager = new Manager("宗剑");
        Manager allManager = new Manager("钟精励");

        Request request1 = new Request("加薪", "小明请求加薪", 1000);

        xmManager.DealRequest("项目经理", request1);
        zjManager.DealRequest("总监", request1);
        allManager.DealRequest("总经理", request1);

        Request request2 = new Request("请假", "小明请假", 3);

        xmManager.DealRequest("项目经理", request2);
        zjManager.DealRequest("总监", request2);
        allManager.DealRequest("总经理", request2);

    }

}
