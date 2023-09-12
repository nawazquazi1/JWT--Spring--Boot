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
public class JwtResponse {
    private String username;
    private String jwtToken;
}
