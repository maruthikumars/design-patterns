package abstractdesignpattern.impl.aws;

import abstractdesignpattern.Database;

public class AWSDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to AWS Database..");
    }
}
