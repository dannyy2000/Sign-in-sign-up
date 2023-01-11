package data.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Setter
    @Getter
    private String id;
    @NonNull
    @Setter
    @Getter
    private String firstName;
    @NonNull
    @Setter
    @Getter
    private String lastName;
    @NonNull
    @Setter
    @Getter
    private String email;
    @NonNull
    @Setter
    @Getter
    private String password;
    @Setter
    @Getter
    private String phoneNumber;
}
