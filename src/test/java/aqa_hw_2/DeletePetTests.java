package aqa_hw_2;

import aqa_hw_2.dto.CategoryDto;
import aqa_hw_2.dto.NotFoundPetDto;
import aqa_hw_2.dto.PetDto;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeletePetTests {
    @Test
    public void verifyPetCanRemoved() {
        int petIdCreated = 1144;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Staff");
        String petNameToCreate = "Bul";
        String status = "available";

        PetDto petDtoToCreate = new PetDto(petIdCreated, categoryDto, petNameToCreate, status);

        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponseDto = createdPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdCreated, postResponseDto.getId());

        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdCreated);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdCreated, previouslyCreatedPetDto.getId());

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdCreated);

        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdCreated);

        Assert.assertEquals(404, deletedPetResponse.getStatusCode());

        NotFoundPetDto notFoundPetDto = deletedPetResponse.as(NotFoundPetDto.class);

        Assert.assertEquals("error", notFoundPetDto.getType());
        Assert.assertEquals("Pet not found", notFoundPetDto.getMessage());

    }

}
