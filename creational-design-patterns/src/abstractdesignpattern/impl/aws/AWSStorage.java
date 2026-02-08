package abstractdesignpattern.impl.aws;

import abstractdesignpattern.Storage;

public class AWSStorage implements Storage {
    @Override
    public void uploadData(String data) {
        System.out.println("Uploading data to AWS Storage..");
    }
}
