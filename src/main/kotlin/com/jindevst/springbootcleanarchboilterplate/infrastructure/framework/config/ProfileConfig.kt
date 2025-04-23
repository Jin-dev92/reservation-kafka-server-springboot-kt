package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

class ProfileConfig {
    @Configuration
    @Profile("development")
    class DevelopmentConfig

    @Configuration
    @Profile("production")
    class ProductionConfig
}