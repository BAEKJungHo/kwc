package com.gymzzak.pt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.gymzzak.pt.repository")
public class AppConfig {
}
