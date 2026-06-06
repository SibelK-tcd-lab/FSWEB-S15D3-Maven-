package org.example;

import java.util.Map;

public class TimeComplexity {

    public static void runPerformanceTest() {
        System.out.println("=== ANALİZ BAŞLADI ===");

        // İşlem başlamadan önceki zamanı nanosaniye olarak alıyoruz
        long startTime = System.nanoTime();

        // O(n) karmaşıklığa sahip kelime sayma metodunu çağırıyoruz
        Map<String, Integer> result = WordCounter.calculatedWord();

        // İşlem bittikten sonraki zamanı alıyoruz
        long endTime = System.nanoTime();

        // Toplam harcanan süreyi hesaplıyoruz (Nanosaniye -> Milisaniye dönüşümü ile)
        long durationNano = endTime - startTime;
        double durationMilli = durationNano / 1_000_000.0;

        // Toplam kelime sayısını bulmak için map'teki value'ları topluyoruz
        int totalWordsProcessed = 0;
        for (int count : result.values()) {
            totalWordsProcessed += count;
        }

        // Sonuçları ve Performans Analizini Konsola Yazdırıyoruz
        System.out.println("Analiz Edilen Toplam Kelime Sayısı (n): " + totalWordsProcessed);
        System.out.println("Benzersiz (Unique) Kelime Sayısı: " + result.size());
        System.out.println("Algoritma Zaman Karmaşıklığı: O(n) - Doğrusal Zaman (Linear Time)");
        System.out.println("Harcanan Toplam Süre: " + durationNano + " ns (" + durationMilli + " ms)");
        System.out.println("=======================================");
    }
}