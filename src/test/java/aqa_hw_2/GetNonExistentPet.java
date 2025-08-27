package aqa_hw_2;

import aqa_hw_2.dto.NotFoundPetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetNonExistentPet {
    @Test
    public void petNotReal()
    {
        int notRealId = 989789987;
        Response response = given().get("https://petstore.swagger.io/v2/pet/" + notRealId);
        Assert.assertEquals(404,response.statusCode());

        NotFoundPetDto error = response.as(NotFoundPetDto.class);
        Assert.assertEquals("error", error.getType());

    }

}
