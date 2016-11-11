package com.luoq.designpattern.structure.facade;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class Computer {

    private CPU cpu;

    private Memory memory;

    private Disk disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
        //有一定的道理，但是进入了那个圈子，发现能力不够，面临的局面比较尴尬。
    }

}
