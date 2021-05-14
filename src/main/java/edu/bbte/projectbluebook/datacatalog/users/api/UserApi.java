/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package edu.bbte.projectbluebook.datacatalog.users.api;

import edu.bbte.projectbluebook.datacatalog.users.model.dto.ErrorResponse;
import edu.bbte.projectbluebook.datacatalog.users.model.dto.UserCreationRequest;
import edu.bbte.projectbluebook.datacatalog.users.model.dto.UserResponse;
import edu.bbte.projectbluebook.datacatalog.users.model.dto.UserRoleUpdateRequest;
import edu.bbte.projectbluebook.datacatalog.users.model.dto.UserUpdateRequest;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "User", description = "the User API")
public interface UserApi {

    /**
     * POST /users : Create a User
     * Create new user (registration).  The e-mail address and username must be unique in the application.
     *
     * @param userCreationRequest User information for registration. (optional)
     * @return Created (status code 201)
     *         or Unprocessable entity. (status code 422)
     */
    @ApiOperation(value = "Create a User", nickname = "createUser", notes = "Create new user (registration).  The e-mail address and username must be unique in the application.", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 422, message = "Unprocessable entity.", response = ErrorResponse.class) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default Mono<ResponseEntity<Void>> createUser(@ApiParam(value = "User information for registration."  )  @Valid @RequestBody(required = false) Mono<UserCreationRequest> userCreationRequest, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }


    /**
     * DELETE /users/{userId} : Delete a User
     * Delete the user which ID corresponds to the ID provided.  Requires authentication and *ADMIN* rights to perform the deletion.  A response with status code of &#x60;204&#x60; with empty resonse body indicates that the deletion was successful.
     *
     * @param userId The ID of the user. (required)
     * @return User deleted (status code 204)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "Delete a User", nickname = "deleteUser", notes = "Delete the user which ID corresponds to the ID provided.  Requires authentication and *ADMIN* rights to perform the deletion.  A response with status code of `204` with empty resonse body indicates that the deletion was successful.", authorizations = {
        @Authorization(value = "ApiKey"),
        @Authorization(value = "JWT")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "User deleted"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.DELETE)
    default Mono<ResponseEntity<Void>> deleteUser(@ApiParam(value = "The ID of the user.",required=true) @PathVariable("userId") String userId, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }


    /**
     * GET /users/show_many : Get Many Users by ID
     * Returns all of the users with the specified IDs.
     *
     * @param ids A comma separated list of IDs to query. (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Get Many Users by ID", nickname = "getManyUsersById", notes = "Returns all of the users with the specified IDs.", response = UserResponse.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/users/show_many",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<Flux<UserResponse>>> getManyUsersById(@NotNull @ApiParam(value = "A comma separated list of IDs to query.", required = true) @Valid @RequestParam(value = "ids", required = true) List<String> ids, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"USER\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * GET /users/{userId} : Get a User
     * Returns the user which ID corresponds to the ID provided.
     *
     * @param userId The ID of the user. (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "Get a User", nickname = "getUser", notes = "Returns the user which ID corresponds to the ID provided.", response = UserResponse.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<UserResponse>> getUser(@ApiParam(value = "The ID of the user.",required=true) @PathVariable("userId") String userId, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"USER\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * GET /users/username/{username} : Get User by Username
     * Returns the user with the specified username.
     *
     * @param username The username of the user. (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "Get User by Username", nickname = "getUserByUsername", notes = "Returns the user with the specified username.", response = UserResponse.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/users/username/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<UserResponse>> getUserByUsername(@ApiParam(value = "The username of the user.",required=true) @PathVariable("username") String username, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"USER\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * GET /users : Get all Users
     * Lists all the users.
     *
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Get all Users", nickname = "getUsers", notes = "Lists all the users.", response = UserResponse.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<Flux<UserResponse>>> getUsers(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"USER\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * PUT /users/{userId}/role : Modify User Role by ID
     * Modifies the user&#39;s role.  Requires authentication and *ADMIN* rights.
     *
     * @param userId The ID of the user. (required)
     * @param userRoleUpdateRequest  (optional)
     * @return No Content (status code 204)
     *         or Not Found (status code 404)
     *         or Unprocessable Entity (WebDAV) (status code 422)
     */
    @ApiOperation(value = "Modify User Role by ID", nickname = "modifyUserRole", notes = "Modifies the user's role.  Requires authentication and *ADMIN* rights.", authorizations = {
        @Authorization(value = "ApiKey"),
        @Authorization(value = "JWT")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 422, message = "Unprocessable Entity (WebDAV)", response = ErrorResponse.class) })
    @RequestMapping(value = "/users/{userId}/role",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default Mono<ResponseEntity<Void>> modifyUserRole(@ApiParam(value = "The ID of the user.",required=true) @PathVariable("userId") String userId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Mono<UserRoleUpdateRequest> userRoleUpdateRequest, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }


    /**
     * GET /users/search/{searchTerm} : Search Users by Username
     * Returns the users which usernames contain the searchTerm.
     *
     * @param searchTerm The search term. (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Search Users by Username", nickname = "searchUsers", notes = "Returns the users which usernames contain the searchTerm.", response = UserResponse.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/users/search/{searchTerm}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<Flux<UserResponse>>> searchUsers(@ApiParam(value = "The search term.",required=true, defaultValue="") @PathVariable("searchTerm") String searchTerm, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"USER\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }";
                result = ApiUtil.getExampleResponse(exchange, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * PATCH /users/{userId} : Update User by ID
     * Update the user which ID corresponds to the ID provided.  Only the attributes specified in the HTTP body will be modified. The attributes which are not specified will **not** change.  The e-mail address must be unique in the application.  The role of the user CANNOT be updated using this endpoint. The username CANNOT be updated at all.  Possible response codes:  - &#x60;204&#x60;: The update was successful.  - &#x60;404&#x60;: There is no user found with the provided ID.  - &#x60;422&#x60;: The object provided in the request body is malformed. A detailed explanation can be found in the response body. The user will not be updated.
     *
     * @param userId The ID of the user. (required)
     * @param userUpdateRequest  (optional)
     * @return No Content (status code 204)
     *         or Not Found (status code 404)
     *         or Unprocessable Entity (WebDAV) (status code 422)
     */
    @ApiOperation(value = "Update User by ID", nickname = "updateUser", notes = "Update the user which ID corresponds to the ID provided.  Only the attributes specified in the HTTP body will be modified. The attributes which are not specified will **not** change.  The e-mail address must be unique in the application.  The role of the user CANNOT be updated using this endpoint. The username CANNOT be updated at all.  Possible response codes:  - `204`: The update was successful.  - `404`: There is no user found with the provided ID.  - `422`: The object provided in the request body is malformed. A detailed explanation can be found in the response body. The user will not be updated.", authorizations = {
        @Authorization(value = "ApiKey"),
        @Authorization(value = "JWT")
    }, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 422, message = "Unprocessable Entity (WebDAV)", response = ErrorResponse.class) })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default Mono<ResponseEntity<Void>> updateUser(@ApiParam(value = "The ID of the user.",required=true) @PathVariable("userId") String userId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Mono<UserUpdateRequest> userUpdateRequest, ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(Mono.empty());

    }

}
