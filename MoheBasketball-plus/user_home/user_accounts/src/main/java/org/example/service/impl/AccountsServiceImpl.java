package org.example.service.impl;

import org.example.mapper.AccountsMapper;
import org.example.model.AccountsDto;
import org.example.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;

    @Override
    public AccountsDto findByIdaccounts(int id) {
        return accountsMapper.selectById(id);
    }
}
