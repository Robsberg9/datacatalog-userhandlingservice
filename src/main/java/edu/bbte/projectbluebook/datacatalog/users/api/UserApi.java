/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package edu.bbte.projectbluebook.datacatalog.users.api;

import edu.bbte.projectbluebook.datacatalog.users.model.TokenInfoResponse;
import edu.bbte.projectbluebook.datacatalog.users.model.UserLoginRequest;
import edu.bbte.projectbluebook.datacatalog.users.model.UserLoginResponse;
import edu.bbte.projectbluebook.datacatalog.users.model.UserRequest;
import edu.bbte.projectbluebook.datacatalog.users.model.UserResponse;
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
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "User", description = "the User API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users
     * Create new user (registration).
     *
     * @param userRequest User information for registration. (optional)
     * @return New user created. (status code 201)
     *         or Unprocessable entity. (status code 422)
     */
    @ApiOperation(value = "", nickname = "createUser", notes = "Create new user (registration).", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "New user created."),
        @ApiResponse(code = 422, message = "Unprocessable entity.") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createUser(@ApiParam(value = "User information for registration."  )  @Valid @RequestBody(required = false) UserRequest userRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /users/{userId}
     * Delete a specific user
     *
     * @param userId Unique identifier for user (required)
     * @return User deleted (status code 204)
     */
    @ApiOperation(value = "", nickname = "deleteUser", notes = "Delete a specific user", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "User deleted") })
    @RequestMapping(value = "/users/{userId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUser(@ApiParam(value = "Unique identifier for user",required=true) @PathVariable("userId") String userId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/{userId} : Your GET endpoint
     * Get user by ID
     *
     * @param userId Unique identifier for user (required)
     * @return OK (status code 200)
     *         or User not found (status code 404)
     */
    @ApiOperation(value = "Your GET endpoint", nickname = "getUser", notes = "Get user by ID", response = UserResponse.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<UserResponse> getUser(@ApiParam(value = "Unique identifier for user",required=true) @PathVariable("userId") String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users : Your GET endpoint
     * Get all users.
     *
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Your GET endpoint", nickname = "getUsers", notes = "Get all users.", response = UserResponse.class, responseContainer = "List", tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<UserResponse>> getUsers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /users/login
     * Log user into the system.
     *
     * @param userLoginRequest  (optional)
     * @return OK (status code 200)
     *         or Authentication failed. The username or password is not correct. (status code 401)
     */
    @ApiOperation(value = "", nickname = "login", notes = "Log user into the system.", response = UserLoginResponse.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserLoginResponse.class),
        @ApiResponse(code = 401, message = "Authentication failed. The username or password is not correct.") })
    @RequestMapping(value = "/users/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<UserLoginResponse> login(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) UserLoginRequest userLoginRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"token\" : \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE0ODUxNDA5ODQsImlhdCI6MTQ4NTEzNzM4NCwiaXNzIjoiYWNtZS5jb20iLCJzdWIiOiIyOWFjMGMxOC0wYjRhLTQyY2YtODJmYy0wM2Q1NzAzMThhMWQiLCJhcHBsaWNhdGlvbklkIjoiNzkxMDM3MzQtOTdhYi00ZDFhLWFmMzctZTAwNmQwNWQyOTUyIiwic\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /token_info
     * It provides information about the token.
     *
     * @param body Contains the token. (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "tokenInfo", notes = "It provides information about the token.", response = TokenInfoResponse.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TokenInfoResponse.class) })
    @RequestMapping(value = "/token_info",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<TokenInfoResponse> tokenInfo(@ApiParam(value = "Contains the token."  )  @Valid @RequestBody(required = false) String body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"user\", \"active\" : true, \"exp\" : 1437275311, \"userId\" : \"userId\", \"iat\" : 1419350238, \"username\" : \"user1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
