package com.kruger.orders.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "auth-service", url="http://localhost:8082/api/v1/auth/users")
public class UserRestClient {
//    @GetMapping("/{id}")
}
