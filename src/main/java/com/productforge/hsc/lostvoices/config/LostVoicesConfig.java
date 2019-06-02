package com.productforge.hsc.lostvoices.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.productforge.hsc.lostvoices.dao")
public class LostVoicesConfig {

}
