package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "application")
class EnvFromPropertySource {
    lateinit var properties: Map<String, String>
}