package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutPetTests {
    @Test
    public void verifyPetCanBeModified() {
//        int id = 1124;
        int id = (int) (System.currentTimeMillis() / 1000);
        CategoryDto category = new CategoryDto();
        category.setId(101);
        category.setName("home pets");

        PetDto createPet = new PetDto(id, category, "Kesha", "available");

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(createPet)
                .post("https://petstore.swagger.io/v2/pet");

        Assert.assertEquals(200, createdPetResponse.statusCode());



        Assert.assertEquals(id, createPet.getId());
        Assert.assertEquals("Kesha", createPet.getName());
        Assert.assertEquals("available", createPet.getStatus());
        Assert.assertEquals("home pets", createPet.getCategory().getName());

        Response getResponse = given().get("https://petstore.swagger.io/v2/pet/" + id);
        Assert.assertEquals(200, getResponse.statusCode());

        PetDto fetched = getResponse.as(PetDto.class);
        Assert.assertEquals("Kesha", fetched.getName());
        Assert.assertEquals("available", fetched.getStatus());
        Assert.assertEquals("home pets", fetched.getCategory().getName());

        fetched.setName("Ara");
        fetched.setStatus("pending");
        fetched.getCategory().setName("Parrots");

        Response putResponse = given().contentType("application/json")
                .body(fetched)
                .put("https://petstore.swagger.io/v2/pet");
        Assert.assertEquals(200, putResponse.statusCode());

        PetDto updated = putResponse.as(PetDto.class);
        Assert.assertEquals(id, updated.getId());
        Assert.assertEquals("Ara", updated.getName());
        Assert.assertEquals("pending", updated.getStatus());
        Assert.assertEquals("Parrots", updated.getCategory().getName());

        Response getResponse2 = given()
                .get("https://petstore.swagger.io/v2/pet/" + id);
        Assert.assertEquals(200, getResponse2.statusCode());

        PetDto afterPut = getResponse2.as(PetDto.class);
        Assert.assertEquals("Ara", afterPut.getName());
        Assert.assertEquals("pending", afterPut.getStatus());
        Assert.assertEquals("Parrots", afterPut.getCategory().getName());
    }
}
