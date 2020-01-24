package DAO.model;
public class User {

    private int id;

    private String login;

    private String password;

    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return login.equals(user.login) && password.equals(user.password) && role.equals(user.role);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }


    public static class Role {

        private int id;

        private String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Role)) return false;
            Role role = (Role) o;
            return name.equals(role.name);
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + name.hashCode();
            return result;
        }
    }
}
