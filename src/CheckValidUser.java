public class CheckValidUser {

        UsernameAndPasswordList userList = new UsernameAndPasswordList();

        boolean CheckValidUser(String usernameInput, String passwordInput) {
            PasswordEncoder passwordEncoder = new PasswordEncoder();

            for (int i = 0; i < userList.UsernameAndPasswordList().size(); i++) {
                if (userList.UsernameAndPasswordList().get(i).substring(10).equals(usernameInput)
                        && userList.UsernameAndPasswordList().get(i + 1).substring(10).equals(passwordInput)) {

                    return true;
                }
            }
            return false;
        }
}
