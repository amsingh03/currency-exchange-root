package com.amit.ms.currencyconversionservice.proxy;

import com.amit.ms.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="currency-conversion-service",url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {
    @GetMapping(path="/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion getCrrencyExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
}
