import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
public class User {

    public static final int MIN_USERNAME_LENGTH = 4;
    public static final int MAX_USERNAME_LENGTH = 20;
    private static String userName;
    private String password;
    private UUID id;
    private LocalDateTime createdAT;
    private LocalDateTime updatedAT;


    public User(String userName, String password) {
        id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        createdAT = LocalDateTime.now();
        updatedAT = createdAT;
    }

    public void changeUserName(String userName){
        
        if (!isUserNameValid()){
            throw new IllegalArgumentException("Valid username should have" +
                    " a length between " + MIN_USERNAME_LENGTH + " and " + MAX_USERNAME_LENGTH);
        }
        this.userName = userName;
        update();
    }

    public static boolean isUserNameValid(){
        return userName != null
                && userName.length() >= MIN_USERNAME_LENGTH
                && userName.length() <= MAX_USERNAME_LENGTH;
    }

    private void update(){
        updatedAT = LocalDateTime.now();
    }
}
