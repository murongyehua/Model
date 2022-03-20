package chain.common;

public class Request {

    /**
     * 申请类型 请假 加薪
     */
    private String requestType;

    /**
     * 申请内容
     */
    private String requestContent;

    /**
     * 申请数量
     */
    private Integer number;

    public Request(String requestType, String requestContent, Integer number) {
        this.requestType = requestType;
        this.requestContent = requestContent;
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
