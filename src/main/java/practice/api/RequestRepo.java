package practice.api;

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

    private final static String KEY="06aacd672653757cb826c81e4605ab02";
    private final static String TOKEN="53b31836ef880c26c79d755b48c2298c3fd2c0a94094adc266f5411e97423a1e";

    public static Request createTrelloBoard(String boardName) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/?name="+boardName+"&key="+KEY +
                "&token="+TOKEN);
        request.setMethod("POST");
        request.setBody("{\"defaultLists\":false,\"name\":\"test_board1\",\"prefs_permissionLevel\"" +
                ":\"org\",\"prefs_selfJoin\":true,\"idOrganization\":\"60fefe65beb2b76caa04761c\"}");
        return request;
    }

    private static Request baseTrelloRequest() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("api.trello.com");
        return request;
    }

    public static Request deleteTrelloBoard(String boardId) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardId+"?key="+KEY +
                "&token="+TOKEN);
        request.setMethod("DELETE");
        return request;
    }
}
