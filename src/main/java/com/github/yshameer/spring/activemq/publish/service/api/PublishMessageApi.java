package com.github.yshameer.spring.activemq.publish.service.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "Publish Message", description = "the Publish Message to ActiveMQ API")
public interface PublishMessageApi {

    @ApiOperation(value = "", notes = "Publish Message to specified queue", tags = {"Publish Message",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "message published successfully")})

    @RequestMapping(value = "/publishMessage",
            produces = {"text/plain"},
            consumes = {"text/plain"},
            method = RequestMethod.PUT)
    ResponseEntity<String> publishMessage(@ApiParam(value = "Queue Name.", required = true) @RequestHeader(value = "queueName", required = true) String queueName, @ApiParam(value = "message") @RequestBody String message);


}
