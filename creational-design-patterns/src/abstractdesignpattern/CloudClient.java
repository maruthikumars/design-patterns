package abstractdesignpattern;

import abstractdesignpattern.factory.CloudServiceFactory;
import abstractdesignpattern.factory.AWSCloudServiceFactory;
import abstractdesignpattern.factory.AzureCloudServiceFactory;

public class CloudClient {
    private VirtualMachine virtualMachine;
    private Database database;
    private Storage storage;

    public CloudClient(CloudServiceFactory cloudServiceFactory) {
        this.virtualMachine = cloudServiceFactory.createVirtualMachine();
        this.database = cloudServiceFactory.createDatabase();
        this.storage = cloudServiceFactory.createStorage();
    }

    public void run() {
        virtualMachine.start();
        database.connect();
        storage.uploadData("Sample Data");
    }


    public static void main(String[] args) {
        CloudServiceFactory awsFactory = new AWSCloudServiceFactory();
        CloudClient awsClient = new CloudClient(awsFactory);
        awsClient.run();

        System.out.println("------------");

        CloudServiceFactory azureFactory = new AzureCloudServiceFactory();
        CloudClient azureClient = new CloudClient(azureFactory);
        azureClient.run();
    }
}