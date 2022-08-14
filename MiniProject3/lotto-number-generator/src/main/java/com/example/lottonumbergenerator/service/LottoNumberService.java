package com.example.lottonumbergenerator.service;

import com.example.lottonumbergenerator.domain.LottoNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

;

@Service
@RequiredArgsConstructor
public class LottoNumberService {

    private static List<LottoNumber> lottoNumberList;

    // 로또 번호 생성
    public void createLottoNumber(String creatorName) {

        List<Integer> numbers = this.createLottoNumber();

        LottoNumber lottoNumber = new LottoNumber(numbers, creatorName, LocalDate.now());

        lottoNumberList.add(lottoNumber);

    }

    // 로또 번호 읽어오기
    public List<LottoNumber> readLottoNumberList() {
        return lottoNumberList;
    }

    // 로또 번호 삭제
    public void deleteLottoNumberList(int lottoId) {
        LottoNumber lottoNumber = this.findById(lottoId);
        lottoNumberList.remove(lottoNumber);
    }


    /* private 메소드들입니다. */
    private LottoNumber findById(int lottoId) {
        return lottoNumberList.stream()
                .filter(lottoNumber -> lottoNumber.getLottoId().equals(lottoId))
                .findFirst().orElse(null);
    }

    private List<Integer> createLottoNumber() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 7) {
            int number = random.nextInt(45);
            if (numbers.contains(number)) {
                continue;
            }
            numbers.add(number);
        }

        return numbers;

    }

}
