package com.floatpoint.springcloud;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsk
 * @date 2020/3/15 22:15
 */
@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${git.uri}")
    private String gitUri;  //要访问的3344上的信息

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return gitUri;
    }
}