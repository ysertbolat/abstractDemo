public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        //bu bağımlı olmadan kullanmamıza yarar
        databaseManager.getData();

        //kullanıcı bunu yaparsa oracle'a bağlı kalmış olur
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
    }
}
