import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register(String userName, String password) {

        Optional<User> foundUser = userRepository.find(userName);
        if(foundUser.isPresent()){
            throw new IllegalStateException("User with " + userName + " already exists");
        }

        if (!User.isUserNameValid()){
            throw new IllegalArgumentException("Valid username should have" +
                    " a length between " + User.MIN_USERNAME_LENGTH + " and " + User.MAX_USERNAME_LENGTH);
        }
        User user = new User(userName,password);
        userRepository.add(user);
    }
}
