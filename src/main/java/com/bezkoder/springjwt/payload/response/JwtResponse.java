package com.bezkoder.springjwt.payload.response;

import com.bezkoder.springjwt.common.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private String email;
  private List<String> roles;
  private Message message;

  public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles, Message message) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.email = email;
    this.roles = roles;
    this.message = message;
  }


}
