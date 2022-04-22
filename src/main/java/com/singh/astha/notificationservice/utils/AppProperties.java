package com.singh.astha.notificationservice.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AppProperties {

    @Value("${auth.token.public.key}")
    private String publicKey;
}
