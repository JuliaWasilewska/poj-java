package Lab12;

import Lab12.fields.Person;
import Lab12.fields.Role;
import Lab12.fields.User;

import java.util.*;


public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAddresses().size() > 1).toList();
    }

    public static User findOldestPerson(List<User> users) {
        return (User) users.stream().map(User::getPersonDetails).max(Comparator.comparing(Person::getAge)).stream();
    }

    public static Optional<User> findUserWithLongestUsername(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getName)); /// Poddaje się
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        StringBuilder stringBuilder = new StringBuilder();
        List<User> userList = users.stream().filter(user -> user.getPersonDetails().getAge() > 18).toList().stream().toList();
        for (User user: userList) {
            stringBuilder.append(user.getPersonDetails().getName()).append(" ").append(user.getPersonDetails().getSurname()).append(",");
        }
        return stringBuilder.toString();
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        return null;
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return null;
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return null;
    }
}
