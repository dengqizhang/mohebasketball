package org.example.client.fallback;

import org.example.client.AccountsClient;
import org.example.model.AccountsDto;

public class FallBackAccountsClient implements AccountsClient {

    @Override
    public AccountsDto finAllaccounts(int id) {
        return null;
    }
}
