package org.example;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class ServerNode {

    public static void main(String[] args) {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance(HazelcastConfig.getConfig());
        IMap<Integer, Integer> map = instance.getMap("map");
        for (int i = 0; i < 1000; i++) {
            map.put(i, i);
        }
    }
}
