import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import demo.response.DataResponseGet;
import demo.request.DataRequest;
import demo.response.DataResponsePost;

public class APITest {
    String baseURI = "https://jsonplaceholder.typicode.com";

    int dataLength;
    @Test
    public void getDataType() {
        Response response = RestAssured
                .given()
                .baseUri(baseURI)
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .get("/posts");

        DataResponseGet[] dataResponseGet = response.as(DataResponseGet[].class);
        dataLength = dataResponseGet.length;
        for(int i = 0; i < dataLength; i++){
            Assert.assertEquals("java.lang.Integer", dataResponseGet[i].getUserId().getClass().getTypeName());
            Assert.assertEquals("java.lang.Integer", dataResponseGet[i].getId().getClass().getTypeName());
            Assert.assertEquals("java.lang.String", dataResponseGet[i].getTitle().getClass().getTypeName());
            Assert.assertEquals("java.lang.String", dataResponseGet[i].getBody().getClass().getTypeName());
        }
    }
    @Test
    public void postData(){
        String inputTitle = "recommendation";
        String inputBody = "motorcycle";
        int inputUserId = 12;
        DataRequest dataRequest = new DataRequest();
        dataRequest.setTitle(inputTitle);
        dataRequest.setBody(inputBody);
        dataRequest.setUserId(inputUserId);

        Response response = RestAssured
                .given()
                .baseUri(baseURI)
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .body(dataRequest)
                .post("/posts");

        DataResponsePost dataResponsePost = response.as(DataResponsePost.class);
        Assert.assertEquals(inputTitle, dataResponsePost.getTitle());
        Assert.assertEquals(inputBody, dataResponsePost.getBody());
        Assert.assertEquals(inputUserId, dataResponsePost.getUserId().intValue());
    }
}
