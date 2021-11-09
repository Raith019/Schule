/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.pcp;

import com.sun.javafx.image.impl.IntArgb;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
    private final String name;
    private final Storage storage;
    private final int sleepTime;
    
    private final List<Integer> sent = null;
    private final int numberOfItems;

    public Producer(String name, Storage storage, int sleepTime, int numberOfItems) {
        this.name = name;
        this.storage = storage;
        this.sleepTime = sleepTime;
        this.numberOfItems = numberOfItems;
    }

    public List<Integer> getSent() {
        return sent;
    }

    @Override
    public void run() {
        Storage s = new Storage();
        for (int i = 0; i < numberOfItems; i++) {
            try {
                boolean put = s.put(sent.get(i));
                sent.add(sent.get(i));
            }catch (Exception e){
                System.out.println("Runnable Error");
                try {
                    s.wait(sleepTime);
                }catch (Exception e1){
                }

                i--;
            }
        }
        s.setProductionComplete();

    }
}
