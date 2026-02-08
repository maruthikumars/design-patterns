package abstractdesignpattern.impl.azure;

import abstractdesignpattern.Storage;

public class AzureStorage implements Storage {
    @Override
    public void uploadData(String data) {
        System.out.println("Uploading data to Azure Storage..");
    }
}
