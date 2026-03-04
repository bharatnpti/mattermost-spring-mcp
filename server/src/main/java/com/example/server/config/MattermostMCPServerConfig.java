package com.example.server.config;

import com.example.server.service.MattermostService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MattermostMCPServerConfig {

    @Bean
    public ToolCallbackProvider toolCallbackProvider(MattermostService mattermostService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(mattermostService)
                .build();
    }
}
