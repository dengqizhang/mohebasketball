package org.example.client;

import org.example.client.fallback.FallBackAccountsClient;
import org.example.model.AccountsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "accounts-service",fallbackFactory = FallBackAccountsClient.class)
public interface AccountsClient {

    @GetMapping("/accounts/{id}")
    AccountsDto finAllaccounts(@PathVariable("id") int id);
}
