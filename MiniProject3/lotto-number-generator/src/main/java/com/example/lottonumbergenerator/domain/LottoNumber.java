package com.example.lottonumbergenerator.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@ToString
public class LottoNumber {

    private static Integer lastId = 0;

    private Integer lottoId; // 로또 고유 일련 번호

    private List<Integer> lottoNumber; // 로또 번호

    private String creatorName; // 생성한 사람 이름

    private LocalDate localDate; // 생성 날짜

    public LottoNumber(List<Integer> lottoNumber, String creatorName, LocalDate localDate) {
        this.lottoId = lastId++;
        this.lottoNumber = lottoNumber;
        this.creatorName = creatorName;
        this.localDate = localDate;
    }

}
