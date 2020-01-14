package com.kaine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class StreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class);
    }

    @Bean
    public Function<String, String> fun() {
        return value -> value.toUpperCase();
    }

    @Bean
    public Supplier<Flux<String>> sup() {
        return () -> Flux.from(emitter -> {
            while (true) {
                try {
                    emitter.onNext("Hello from Supplier!");
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // ignore
                }
            }
        });
    }
}
