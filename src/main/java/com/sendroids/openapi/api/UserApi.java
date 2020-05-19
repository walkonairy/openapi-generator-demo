/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sendroids.openapi.api;

import com.sendroids.openapi.domain.Auth;
import com.sendroids.openapi.domain.ResponseApi;
import com.sendroids.openapi.domain.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-18T16:51:45.956642+08:00[Asia/Shanghai]")


@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    static void staticMe() {
        System.out.println("static method");
    }


    /**
     * POST /user/auth : 用户认证
     *
     * @param username 用户名 (required)
     * @param password 密码 (required)
     * @return success (status code 200)
     * or 错误的参数 (status code 400)
     * or 错误的请求路径 (status code 404)
     * or 服务器错误 (status code 500)
     */
    @ApiOperation(value = "用户认证", nickname = "issueToken", notes = "", response = Auth.class, tags = {"user-controller",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success", response = Auth.class),
            @ApiResponse(code = 400, message = "错误的参数"),
            @ApiResponse(code = 404, message = "错误的请求路径"),
            @ApiResponse(code = 500, message = "服务器错误")})
    @RequestMapping(value = "/user/auth",
            produces = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<Auth> issueToken(
            @NotNull @ApiParam(value = "用户名", required = true)
            @Valid @RequestParam(value = "username", required = true) String username,
            @NotNull @ApiParam(value = "密码", required = true)
            @Valid @RequestParam(value = "password", required = true) String password
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userId\" : 0, \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/addUser : 用户注册
     *
     * @param user 新增的用户对象 (required)
     * @return success (status code 200)
     * or 错误的参数 (status code 400)
     * or 错误的请求路径 (status code 404)
     * or 服务器错误 (status code 500)
     */
    @ApiOperation(value = "用户注册", nickname = "addUser", notes = "", response = User.class, tags = {"user-controller",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success", response = User.class),
            @ApiResponse(code = 400, message = "错误的参数"),
            @ApiResponse(code = 404, message = "错误的请求路径"),
            @ApiResponse(code = 500, message = "服务器错误")})
    @RequestMapping(value = "/user/addUser",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<User> addUser(@ApiParam(value = "新增的用户对象", required = true) @Valid @RequestBody User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"phone\" : \"phone\", \"id\" : 0, \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{userId} : 根据用户ID获取用户
     * 返回一个用户对象
     *
     * @param userId 用户ID (required)
     * @return success (status code 200)
     * or 错误的参数 (status code 400)
     * or 错误的请求路径 (status code 404)
     * or 服务器错误 (status code 500)
     */
    @ApiOperation(value = "根据用户ID获取用户", nickname = "getUserById", notes = "返回一个用户对象", response = ResponseApi.class, tags = {"user-controller",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success", response = ResponseApi.class),
            @ApiResponse(code = 400, message = "错误的参数"),
            @ApiResponse(code = 404, message = "错误的请求路径"),
            @ApiResponse(code = 500, message = "服务器错误")})
    @RequestMapping(value = "/user/{userId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<User> getUserById(@ApiParam(value = "用户ID", required = true) @PathVariable("userId") Long userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"message\" : \"message\", \"content\" : [ \"{}\", \"{}\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}