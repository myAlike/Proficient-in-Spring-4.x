package com.smart._03resource;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

public class _03PatternResolverTest {
    @Test
    public void getResouces() throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //加载所有类包com.smart(及子孙包)下以.xml为后缀的资源
        Resource resources[] = resolver.getResources("classpath*:/com/smart/**/*.xml");
        for (Resource resource : resources) {
            System.out.println(resource.getDescription());
        }
    }
}
