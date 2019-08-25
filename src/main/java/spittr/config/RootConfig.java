package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

@Configuration

//启用扫描器 并过滤一些Resource
@ComponentScan(basePackages = {"spittr"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = RootConfig.WebPackage.class)})
public class RootConfig {

    //类名是否满足正则表达式
    public static class WebPackage extends RegexPatternTypeFilter{
        public WebPackage(){
            super(Pattern.compile("spittr\\.web"));  // '\\' 插入一个正则表达式的反斜线 所以其后的字符具有特殊的意义 这里指spittr.web
        }
    }
}
