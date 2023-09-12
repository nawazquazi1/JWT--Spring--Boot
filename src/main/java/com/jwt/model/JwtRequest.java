package com.jwt.model;


import lombok.*;

/**
 * @author nawaz
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtRequest {
    private String email;
    private String password;
}
