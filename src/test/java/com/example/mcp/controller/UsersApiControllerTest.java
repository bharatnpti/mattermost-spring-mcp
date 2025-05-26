package com.example.mcp.controller;

import com.example.mcp.model.User;
import com.example.mcp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UsersApiController.class) // Specify the controller to test
public class UsersApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;
    // Mock other services injected into UsersApiController as they are part of its constructor
    @MockBean private com.example.mcp.service.ChannelService channelService;
    @MockBean private com.example.mcp.service.TeamService teamService;
    @MockBean private com.example.mcp.service.PostService postService;
    @MockBean private com.example.mcp.service.GroupService groupService;


    @Test
    public void testGetUser_Success() throws Exception {
        User mockUser = new User();
        mockUser.setId("testUserId");
        mockUser.setUsername("testUser");
        mockUser.setEmail("test@example.com");

        when(userService.getUser(anyString())).thenReturn(mockUser);

        mockMvc.perform(get("/api/v4/users/{user_id}", "testUserId")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value("testUserId"))
                .andExpect(jsonPath("$.username").value("testUser"))
                .andExpect(jsonPath("$.email").value("test@example.com"));
    }
}
