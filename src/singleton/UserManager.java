package singleton;

import java.util.ArrayList;
import java.util.List;

public final class UserManager {

    private static UserManager instance;
    private static final List<User> users = new ArrayList<>();

    private UserManager() {
    }

    /**
     * Implementar a lógica de adicionar um novo usuário na lista mutável $users.
     */
    public void addUser(int position, String name) {
        users.add(new User(position, name));
    }

    /**
     * Implementar a impressão dos $users, seguindo o padrão definido no enunciado.
     */
    public void listUsers() {
        users.forEach(u -> System.out.println(u.getId() + " - " + u.getName()));
    }

    public static UserManager getInstance(){
        if(instance == null) {
            instance = new UserManager();
        }
        return instance;
    }
}
