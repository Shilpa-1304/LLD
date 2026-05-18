package com.sk.LLD.Lab;

import lombok.Data;

@Data
public class Order implements Comparable<Order>{
    int orderId;
    Boolean isExpress;

    @Override
    public int compareTo(Order o) {
        if (this.isExpress && !o.isExpress) {
            return -1;
        }

        if (!this.isExpress && o.isExpress) {
            return 1;
        }


        return Integer.compare(this.orderId,o.orderId);
    }
}
