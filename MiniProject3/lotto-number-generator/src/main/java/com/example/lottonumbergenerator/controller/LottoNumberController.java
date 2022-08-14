package com.example.lottonumbergenerator.controller;

import com.example.lottonumbergenerator.service.LottoNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LottoNumberController {

    private final LottoNumberService lottoNumberService;

}
