package abstractdesignpattern.factory;

import abstractdesignpattern.Database;
import abstractdesignpattern.Storage;
import abstractdesignpattern.VirtualMachine;
import abstractdesignpattern.impl.aws.AWSDatabase;
import abstractdesignpattern.impl.aws.AWSStorage;
import abstractdesignpattern.impl.aws.AWSVirtualMachine;

public class AWSCloudServiceFactory implements CloudServiceFactory {
    @Override
    public VirtualMachine createVirtualMachine() {
        return new AWSVirtualMachine();
    }

    @Override
    public Database createDatabase() {
        return new AWSDatabase();
    }

    @Override
    public Storage createStorage() {
        return new AWSStorage();
    }
}
