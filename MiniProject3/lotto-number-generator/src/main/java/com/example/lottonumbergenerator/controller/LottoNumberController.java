package com.example.lottonumbergenerator.controller;

import com.example.lottonumbergenerator.annotation.Timer;
import com.example.lottonumbergenerator.domain.LottoNumber;
import com.example.lottonumbergenerator.service.LottoNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LottoNumberController {

    private final LottoNumberService lottoNumberService;
    @Timer
    @GetMapping("/get")
    public List<LottoNumber> getLottoNum(){
        System.out.println(lottoNumberService.readLottoNumberList());
        return lottoNumberService.readLottoNumberList();
    }

    @Timer
    @ResponseBody
    @PostMapping("/post")
    public void createLottoNum(@RequestBody String creatorName){
        // talent API BODY에 그냥 이름 입력
        lottoNumberService.createLottoNumber(creatorName);
    }

    @Timer
    @DeleteMapping("/delete/{lottoId}")
    public void delete(@PathVariable Integer lottoId){

        lottoNumberService.deleteLottoNumberList(lottoId);


    }



}
