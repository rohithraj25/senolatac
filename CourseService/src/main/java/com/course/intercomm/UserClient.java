package com.course.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("User-Service")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/service/names", consumes = "application/json")
    List<String> getNamesOfUsers(@RequestBody List<Long> userIdList);
}
