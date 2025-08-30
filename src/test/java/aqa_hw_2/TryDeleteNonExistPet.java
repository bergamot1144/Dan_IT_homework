package aqa_hw_2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TryDeleteNonExistPet {
    @Test
    public void tryDeletePet() {
        int fakeId = 9654645;

        Response response = given().delete("https://petstore.swagger.io/v2/pet/" + fakeId);
        Assert.assertEquals(404, response.statusCode());

    }
}
