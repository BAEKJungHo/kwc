package com.gymzzak.pt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.gymzzak.pt.domain.*.repository")
@EnableJpaAuditing
public class JpaConfig {
}
