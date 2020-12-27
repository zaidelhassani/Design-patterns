public class ProxyPatternClient {
    public static void main(String[] args)
    {
        OfficeInternetAccess access = new ProxyInternetAccess("zaid el hassani");
        access.grantInternetAccess();
    }
}