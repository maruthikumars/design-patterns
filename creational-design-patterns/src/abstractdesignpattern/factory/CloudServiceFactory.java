package abstractdesignpattern.factory;

import abstractdesignpattern.Database;
import abstractdesignpattern.Storage;
import abstractdesignpattern.VirtualMachine;

public interface CloudServiceFactory {
    VirtualMachine createVirtualMachine();
    Database createDatabase();
    Storage createStorage();
}
