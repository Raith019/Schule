/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.pcp;

import java.util.concurrent.ArrayBlockingQueue;

public class Storage { 
    private final ArrayBlockingQueue<Integer> queue = null;
    
    private int fetchedCounter;
    private int storedCounter;
    private int underflowCounter;
    private int overflowCounter;
    private boolean productionComplete;
    private int storagesize;

    public Storage() {
        this.storagesize = 10;
        this.storedCounter = 0;
        this.overflowCounter = 0;

    }
    
    public synchronized boolean put(Integer data) throws InterruptedException {
        if(storedCounter <= storagesize){
            queue.add(data);
            storedCounter++;
            return true;
        }

        overflowCounter++;
        return false;
    }
 
    public synchronized Integer get() {
        if (queue.isEmpty()){
            underflowCounter++;
            return queue.poll();
        }
        fetchedCounter++;
        return queue.poll();

    }

    public boolean isProductionComplete() {
        return isProductionComplete();
    }

    public void setProductionComplete() {
        productionComplete = true;
    }

    public int getFetchedCounter() {
        return fetchedCounter;
    }

    public int getStoredCounter() {
        return storedCounter;
    }

    public int getUnderflowCounter() {
        return underflowCounter;
    }

    public int getOverflowCounter() {
        return overflowCounter;
    }
}
