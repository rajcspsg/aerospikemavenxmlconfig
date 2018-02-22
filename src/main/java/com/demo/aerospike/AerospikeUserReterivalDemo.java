package com.demo.aerospike;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Key;
import com.aerospike.client.Record;

public class AerospikeUserReterivalDemo {

    public static void main(String []args) {
        AerospikeClient client = new AerospikeClient("172.28.128.3", 3000);
        Record record = client.get(null, new Key("test", "User", "Dave-01"));
        System.out.println("record is "+ record);
        System.out.println("record bins is " + record.bins);
        System.out.println();
        System.out.println();
        record.bins.forEach( (k,v) -> {
            System.out.println("key is "+ k +" value is " + v);
        });
        client.close();
    }
}
