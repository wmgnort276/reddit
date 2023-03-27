package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubRedditResponse {
    private String name;
    private String description;
    private Instant created;
    private Instant updated;
    private String username;
}
