package test.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;


import java.util.*;

import static io.restassured.RestAssured.given;

public class Users {

    String baseUrl = "https://reqres.in/api/";
    String users = "users";
    RequestSpecification requestSpecification;

    public Users() {
        requestSpecification = new RequestSpecBuilder()
                .addParam("page", 2)
                .setBaseUri(baseUrl)
                .build();

    }

    public JsonPath getJsonPathUsers() {
        JsonPath jsonPath =
                given()
                        .spec(requestSpecification)
//                        .baseUri(baseUrl)
//                        .params("page", 2)
                        .when()
                        .get(users)
                        .then()
                        .statusCode(200)
                        .extract().jsonPath();
        return jsonPath;
    }
//    public int getStatusCodeWithQueryParams(String query, int number) {
//        RequestSpecification httpRequest =
//                given()
//                        .queryParam(query, number)
//                        .contentType(ContentType.JSON);
//        Response res = httpRequest
//                .contentType(ContentType.JSON)
//                .get(baseUrl);
//        return res.getStatusCode();
//    }
//
//    public int getStatusCode() {
//        RequestSpecification httpRequest =
//                given()
//                        .contentType(ContentType.JSON);
//        Response res = httpRequest
//                .contentType(ContentType.JSON)
//                .get(baseUrl);
//        return res.getStatusCode();
//    }
//
//    public Boolean containsData(String data) {
//        RequestSpecification httpRequest =
//                given()
//                        .contentType(ContentType.JSON);
//        String res = httpRequest
//                .contentType(ContentType.JSON)
//                .get(baseUrl)
//                .then()
//                .extract().asPrettyString();
//        System.out.println(res);
//        return res.contains(data);
//    }
//
//    public int getCountElementsOfObjectInResponse(String data) {
//        RequestSpecification httpRequest =
//                given()
//                        .contentType(ContentType.JSON);
//        ArrayList res = httpRequest
//                .contentType(ContentType.JSON)
//                .get(baseUrl)
//                .then()
//                .extract().path(data);
//        return res.size();
//    }
//
//    public void containsElementsInArray(String data, String val) {
//        RequestSpecification httpRequest =
//                RestAssured.given()
//                        .contentType(ContentType.JSON);
//        Response response = httpRequest.request(Method.GET, baseUrl);
//        JsonPath jsonPath = response.jsonPath();
//        List<HashMap> strings = jsonPath.getList("data");
//        for(HashMap string : strings)
//        {
//            System.out.println(string);
//        }
//
//        System.out.println(response.asString());
//
//        String res = httpRequest
//                .contentType(ContentType.JSON)
//                .get(baseUrl)
//                .then()
//                .extract().asString();
//        System.out.println(res);

//    }


}
