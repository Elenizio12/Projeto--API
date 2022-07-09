package br.com.southrocklab.resources;

import br.com.southrocklab.ApplicationTests;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Java6BDDAssertions.then;
import static org.junit.Assert.assertThat;

 public class TesteBase extends ApplicationTests {

     // Sem sucesso: Testei com Eclipse-IDE, Intellij-IDE
     // Testei no Postman de erro 404

     @Test
     public void CastrateCartaTenhoStatusCode200() {
         baseURI = "http://localhost";
         port = 9090;
         basePath = "/api";
         given();
         body("{\n" +
                 "  \"brand\": \"VISA\",\n" +
                 "  \"cvc\": \"111\",\n" +
                 "  \"expirationMoth\": 2,\n" +
                 "  \"expirationYear\": 2025,\n" +
                 "  \"holderName\": \"LOREM IPSUM SILVA\",\n" +
                 "  \"number\": \"1111111111111112\",\n" +
                 "  \"customerId\": 2\n" +
                 "}");
         RestAssured.responseSpecification.contentType(ContentType.JSON);
         when();
         ValidatableResponse body;
         given();
         post("/card");
         when();
         ValidatableResponse statusCode;
         post("/card");
         assertThat();
         responseSpecification.statusCode(200);

     }

     private void assertThat() {
     }

     private void body(String s) {
     }
 }


