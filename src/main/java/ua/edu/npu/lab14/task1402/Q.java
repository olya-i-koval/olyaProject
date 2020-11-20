package ua.edu.npu.lab14.task1402;

import java.util.concurrent.Semaphore;

public class Q {
        public int n;
        int product = 1;

        static Semaphore semCon = new Semaphore(0);
        static Semaphore semProd = new Semaphore(1);


        void get(int n) {
            try {
                semCon.acquire();
            } catch (InterruptedException e) {
                //  System.out.println("InterruptedException caught");
            }
            System.out.println("контейнерів на складі " + product);
            System.out.println("відчалило " + n + " контейнерів");
            semProd.release();
            product = product - n;
        }

        void put(int n) {

            try {
                semProd.acquire();
            } catch (InterruptedException e) {
            }
            this.n = n;
            System.out.println("контейнерів на складі " + product);
            product = product + n;
            System.out.println("прибуло " + n + " контейнерів");
            semCon.release();
        }
    }


