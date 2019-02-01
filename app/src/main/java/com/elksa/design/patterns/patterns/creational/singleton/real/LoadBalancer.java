package com.elksa.design.patterns.patterns.creational.singleton.real;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * @author Alejandro Casanova Mutis
 * @created 01/02/2019
 */

/**
 * Singleton class, uses lazy creation with lock and double checking for multi-threading support
 * and better performance
 */
public class LoadBalancer {

    /**
     * Singleton instance
     */
    private static LoadBalancer instance;

    // Fields
    private List<String> servers;
    private Random random;

    private LoadBalancer() {

        random = new Random();
        servers = new ArrayList<>();
        servers.add("Server 1");
        servers.add("Server 2");
        servers.add("Server 3");
        servers.add("Server 4");
        servers.add("Server 5");

    }

    /**
     * Controls simultaneous access and uses lazy initialization to create and return a singleton
     * instance. The method is not synchronized allowing to directly return the instance if it already
     * exists without any multi-threading concerns
     * @return LoadBalancer instance
     */
    public LoadBalancer getInstance() {

        if (instance == null) {

            // Synchronized block to remove overhead and enable multi-threading support
            synchronized (LoadBalancer.class) {
                if (instance == null) {
                    instance = new LoadBalancer();
                }
            }
        }

        return instance;
    }

    /**
     * Gets the appropriate server using based on a random mechanism. This method is for demonstration
     * purposes only
     * @return The server which should handle the job
     */
    public String getServer() {
        return servers.get(random.nextInt(servers.size()));
    }
}
