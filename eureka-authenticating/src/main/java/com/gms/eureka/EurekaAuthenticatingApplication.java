package com.gms.eureka;

import com.netflix.discovery.DiscoveryClient;
//import com.sun.jersey.api.client.filter.ClientFilter;
//import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaServer
public class EurekaAuthenticatingApplication {

//    @Bean
//    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs(){
//        DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs = new DiscoveryClient.DiscoveryClientOptionalArgs();
//        List<ClientFilter> filterList = new ArrayList<>();
//        filterList.add(new HTTPBasicAuthFilter("root", "root"));
//        discoveryClientOptionalArgs.setAdditionalFilters(filterList);
//
//        return discoveryClientOptionalArgs;
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaAuthenticatingApplication.class, args);
    }

}
