package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.models.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private Set<Role> roles = new HashSet<>();
}
