package org.practice.InnerClasses;

public class Shop {
    Lock lock = new Lock();

    public Lock getLock() {
        return lock;
    }

    public void shopStatus() {
        if(lock.isLocking()) {
            System.out.println("Shop is closed");
        } else {
            System.out.println("Shop is open");
        }
    }

    public class Lock {
        private boolean locking = true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }
    }
}
