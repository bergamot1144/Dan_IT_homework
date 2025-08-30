package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatePetTests {

    @Test
    public void verifyPetCanBeCreated() {
        int petIdToCreate = 1124;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("King");
        String petNameToCreate = "Lion";
        String status = "available";

        PetDto petDtoToCreate = new PetDto(petIdToCreate, categoryDto, petNameToCreate, status);

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponseDto = createdPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, postResponseDto.getId());

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());
        Assert.assertEquals(categoryDto.getName(), previouslyCreatedPetDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, previouslyCreatedPetDto.getName());
        Assert.assertEquals(status, previouslyCreatedPetDto.getStatus());

    }

}


