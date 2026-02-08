package abstractdesignpattern.impl.aws;

import abstractdesignpattern.VirtualMachine;

public class AWSVirtualMachine implements VirtualMachine {
    @Override
    public void start() {
        System.out.println("Starting AWS Virtual Machine...");
    }
}
