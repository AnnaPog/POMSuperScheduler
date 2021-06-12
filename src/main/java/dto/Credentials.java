package dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class Credentials {
    String email;
    String password;

}
