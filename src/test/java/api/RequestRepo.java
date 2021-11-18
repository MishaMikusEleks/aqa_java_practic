package api;

import practice.api.Request;

public class RequestRepo {

    public static Request getPostman() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("postman-echo.com");
        request.setPath("get");
        request.setMethod("GET");
        return request;
    }
}
