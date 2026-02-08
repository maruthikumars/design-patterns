package abstractdesignpattern.impl.azure;

import abstractdesignpattern.Database;

public class AzureDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Azure Database..");
    }
}
