package abstractdesignpattern.factory;

import abstractdesignpattern.Database;
import abstractdesignpattern.Storage;
import abstractdesignpattern.VirtualMachine;
import abstractdesignpattern.impl.azure.AzureDatabase;
import abstractdesignpattern.impl.azure.AzureStorage;
import abstractdesignpattern.impl.azure.AzureVirtualMachine;

public class AzureCloudServiceFactory implements CloudServiceFactory {
    @Override
    public VirtualMachine createVirtualMachine() {
        return new AzureVirtualMachine();
    }

    @Override
    public Database createDatabase() {
        return new AzureDatabase();
    }

    @Override
    public Storage createStorage() {
        return new AzureStorage();
    }
}
