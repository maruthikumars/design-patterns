package abstractdesignpattern.impl.azure;

import abstractdesignpattern.VirtualMachine;

public class AzureVirtualMachine implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("Starting Azure Virtual Machine..");
    }
}
