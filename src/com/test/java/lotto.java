package com.test.java;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class lotto {
    public static List<Integer> generateLottoNumbers(int totalNumbers, int maxNumber) {
        if (totalNumbers > maxNumber) {
            throw new IllegalArgumentException("Cannot generate more numbers than the available range.");
        }
        
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();
        
        while (lottoNumbers.size() < totalNumbers) {
            int randomNumber = random.nextInt(maxNumber) + 1;
            lottoNumbers.add(randomNumber);
        }
        
        List<Integer> sortedNumbers = new ArrayList<>(lottoNumbers);
        Collections.sort(sortedNumbers);
        
        return sortedNumbers;
    }
    
    public static void main(String[] args) {
        int totalNumbersToGenerate = 6; // 로또 번호 6개를 생성
        int maxNumber = 45; // 1부터 45까지의 숫자 중에서 선택
        
        for (int i = 1; i <= 5; i++) {
            List<Integer> generatedNumbers = generateLottoNumbers(totalNumbersToGenerate, maxNumber);
            System.out.println("Generated Lotto Numbers #" + i + ": " + generatedNumbers);
        }
    }
}
