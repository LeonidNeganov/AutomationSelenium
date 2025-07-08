//package test.tetsLayer;

//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.path.json.JsonPath;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import test.api.Users;
//
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Optional;
//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

//public class UsersApiTest {

//    String baseUrl = "https://reqres.in/api/users";
//
//
////    @Test
////    public void statusCodeWithQueryParamsEquals200() {
////        Users users = new Users();
////        Assert.assertEquals(users.getStatusCodeWithQueryParams("page", 2), 200);
////    }
//
//    @Test
//    public void statusCodeWithQueryParamsEquals200Witout() {
//        Users users = new Users();
//        JsonPath jsonPath = users.getJsonPathUsers();
//        SoftAssert softAssert = new SoftAssert();
//
//        List<LinkedHashMap> arrayList = jsonPath.getList("data");
//        for (LinkedHashMap str : arrayList) {
//            softAssert.assertNotNull(str.get("id"), "id == null");
//            softAssert.assertNotNull(str.get("email"), "email == null");
//            softAssert.assertNotNull(str.get("first_name"), "first_name == null");
//            softAssert.assertNotNull(str.get("last_name"), "last_name == null");
//        }
//
//        System.out.println(jsonPath.prettify());
//        softAssert.assertNotNull(jsonPath.get("data"), "data == null");
//        softAssert.assertEquals(jsonPath.getInt("data[0].id"), 7);
//        softAssert.assertEquals(jsonPath.getList("data").size(), 6, "dataSize != 6");
//        softAssert.assertAll();
//    }
//
////    @Test
////    public void statusCodeEquals200() {
////        Users users = new Users();
////        Assert.assertEquals(users.getStatusCode(), 200);
////    }
//
//    @Test
//    public void statusCodeEquals200Without() {
//        given().
//                when().
//                get(baseUrl)
//                .then()
//                .assertThat()
//                .statusCode(200);
//    }
//
////    @Test
////    public void containsObjectInBody() {
////        Users users = new Users();
////        Assert.assertEquals(users.containsData("data"), true);
////    }
//
//    @Test
//    public void containsObjectInBodyWithout() {
//        given().
//                when().
//                get(baseUrl)
//                .then()
//                .assertThat()
//                .body("", hasKey("data"));
//    }
//
////    @Test
////    public void sizeOfObject() {
////        Users users = new Users();
////        int result = users.getCountElementsOfObjectInResponse("data");
////        Assert.assertEquals(result, 6);
////    }
//
//
//    @Test
//    public void sizeOfObjectWithout() {
//        given().
//                when().
//                get(baseUrl)
//                .then()
//                .assertThat()
//                .body("data", hasSize(6));
//    }
//
//    @Test(dataProvider = "data-provider-api-get")
//    public void isObjectContainsKeys(String val) {
//        given().
//                when().
//                get(baseUrl)
//                .then()
//                .assertThat()
//                .body("data", hasItems(allOf(hasKey(val))));
////                .body("data", hasItems(allOf(hasValue("janet.weaver@reqres.in1"))));
//    }
//
//    @Test
//    public void postRequest() {
//        given()
//                .body("{\n" +
//                        "    \"name\": \"morpheus\",\n" +
//                        "    \"job\": \"leader\"\n" +
//                        "}")
//                .when()
//                .post(baseUrl)
//                .then()
//                .statusCode(201);
//    }
//
//    //    @Test
//    @Test(dataProvider = "data-provider-api-post")
//    public void postHasFields(String val) {
////        String body = "{\n" +
////                "    \"name\": \"morpheus\",\n" +
////                "    \"job\": \"leader\"\n" +
////                "}";
//
//        given()
//                .contentType(ContentType.JSON)
//                .body("{\n" +
//                        "    \"name\": \"morpheus\",\n" +
//                        "    \"job\": \"leader\"\n" +
//                        "}")
//                .when()
//                .post(baseUrl)
//                .then()
//                .body("", hasKey(val))
//                .and()
//                .body("name", is("morpheus"))
//                .and()
//                .body("job", is("leader"))
//                .statusCode(201);
//    }
//
//
//    @DataProvider(name = "data-provider-api-get")
//    public Object[][] dpMethod() {
//        return new Object[][]{{"id"},
//                {"email"},
//                {"first_name"},
//                {"last_name"}
//        };
//    }
//
//    @DataProvider(name = "data-provider-api-post")
//    public Object[][] dpMethodPost() {
//        return new Object[][]{{"name"},
//                {"job"},
//                {"id"}
//        };
//    }
//}
