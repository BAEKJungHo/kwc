package com.gymzzak.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.gymzzak.core.domain.*.repository")
@EnableJpaAuditing
public class JpaConfig {
}
