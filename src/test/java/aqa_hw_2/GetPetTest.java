package aqa_hw_2;

import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class GetPetTest {

    @Test
    public void verifyPetCanBeObtained() {
        int entityIdToFind = 1124;
        Response response = given().get("https://petstore.swagger.io/v2/pet/" + entityIdToFind);
        System.out.println(response.asPrettyString());

        PetDto petDto = response.as(PetDto.class);
        System.out.println(petDto);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(entityIdToFind, petDto.getId());
    }
}



