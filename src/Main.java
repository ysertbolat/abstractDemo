public class Main {

    public static void main(String[] args) {
        //burada önce customerManager'ı çağırdık
        //sonra customerManager'daki databaseManager(BaseDatabaseManager)'ın hangi inherit edilmiş sınıfı çağırması gerektiğini belirttik
        //daha sonra sorunsuz şekilde getCustomers işlemini yaptık
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager(); //bu bir konfigurasyondur değişebilir
        customerManager.getCustomers();
    }
}
