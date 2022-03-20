package chain.before;

import chain.common.Request;

public class Manager {

    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    public void DealRequest(String managerLevel, Request request) {
        if ("项目经理".equals(managerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 1) {
                System.out.printf("%s:%s 数量%s 被批准%n", name, request.getRequestContent(), request.getNumber());
            }else {
                System.out.printf("%s:%s 数量%s 我无权处理%n", name, request.getRequestContent(), request.getNumber());
            }
        }else if ("总监".equals(managerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 3) {
                System.out.printf("%s:%s 数量%s 被批准%n", name, request.getRequestContent(), request.getNumber());
            }else {
                System.out.printf("%s:%s 数量%s 我无权处理%n", name, request.getRequestContent(), request.getNumber());
            }
        }else if ("总经理".equals(managerLevel)) {
            if ("请假".equals(request.getRequestType())) {
                System.out.printf("%s:%s 数量%s 被批准%n", name, request.getRequestContent(), request.getNumber());
            }else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
                System.out.printf("%s:%s 数量%s 被批准%n", name, request.getRequestContent(), request.getNumber());
            }else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
                System.out.printf("%s:%s 数量%s 再说吧%n", name, request.getRequestContent(), request.getNumber());
            }
        }
    }

}
