package com.config.server.currency_exchange_service.controller;

import com.config.server.currency_exchange_service.model.CurrencyExchange;
import com.config.server.currency_exchange_service.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeServiceController {
  @Autowired
    private Environment env;
  @Autowired
  private CurrencyExchangeRepository repository;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getConvertionDetails(@PathVariable String from, @PathVariable String to){
     CurrencyExchange currencyExchange=repository.findByFromAndTo(from,to);
     if(currencyExchange==null){
       throw new RuntimeException("Unable to find the details for"+from+"to"+to);
     }
      currencyExchange.setEnvironmentDetails(env.getProperty("local.server.port"));
       return currencyExchange;
    }
}
