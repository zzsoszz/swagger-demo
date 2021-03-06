package io.swagger.api;

import io.swagger.model.Pet;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-18T09:29:57.481Z")

@Api(value = "pets", description = "the pets API")
public interface PetsApi {

    @ApiOperation(value = "Add a new pet to the store", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/pets",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Pet body);


    @ApiOperation(value = "Deletes a pet", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid pet value", response = Void.class) })
    @RequestMapping(value = "/pets/{petId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true ) @PathVariable("petId") Long petId);


    @ApiOperation(value = "Finds Pets by status", notes = "Multiple status values can be provided with comma seperated strings", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = Pet.class) })
    @RequestMapping(value = "/pets/findByStatus",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pet>> findPetsByStatus(@ApiParam(value = "Status values that need to be considered for filter") @RequestParam(value = "status", required = false) List<String> status);


    @ApiOperation(value = "Finds Pets by tags", notes = "Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid tag value", response = Pet.class) })
    @RequestMapping(value = "/pets/findByTags",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pet>> findPetsByTags(@ApiParam(value = "Tags to filter by") @RequestParam(value = "tags", required = false) List<String> tags);


    @ApiOperation(value = "Find pet by ID", notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions", response = Pet.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Pet.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Pet.class) })
    @RequestMapping(value = "/pets/{petId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathVariable("petId") Long petId);


    @ApiOperation(value = "Update an existing pet", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    @RequestMapping(value = "/pets",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Pet body);


    @ApiOperation(value = "Updates a pet in the store with form data", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
            @AuthorizationScope(scope = "read_pets", description = "read your pets")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/pets/{petId}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true ) @PathVariable("petId") String petId,
        @ApiParam(value = "Updated name of the pet", required=true ) @RequestPart(value="name", required=true)  String name,
        @ApiParam(value = "Updated status of the pet", required=true ) @RequestPart(value="status", required=true)  String status);

}
