class DatabaseService {
    public void connect() {
        System.out.println("Connecting to the database...");
    }
}

class UserService {
    private DatabaseService dbService = new DatabaseService();

    public void registerUser(String username) {
        dbService.connect();
        System.out.println("User " + username + " registered.");
    }
}
