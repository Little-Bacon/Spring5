# 第三章
1. Spring与日志框架进行整合，日志框架就可以在控制台中输出Spring框架运行中一些重要信息。
2. 好处：便于了解Spring框架的运行过程，利于测试



## Spring如何整合日志框架

```markdown
默认
	Spring1 .2.3早期都是于commons-logging.jar
	Spring5.x默认整合的日志框架logback log4j2
Spring5.x整合log4j
	1．引入log4j jar包
	2．引入log4.properties配置文件
```

### pom

<dependency>`slf4j`与`log4j`

这样默认改为log4j

log4j.properties

