# datahub-commons
公共依赖，包括基础类，工具类等
1. 引用该依赖需要将两个第三方jar安装到本地或私服maven仓库；
```
mvn install:install-file -DgroupId=chardet -DartifactId=chardet -Dversion=1.0 -Dfile=F:/git/datahub/datahub-commons/libext/chardet-1.0.jar -Dpackaging=jar -DgeneratePom=true
mvn install:install-file -DgroupId=cpdetector -DartifactId=cpdetector -Dversion=1.0.10 -Dfile=F:/git/datahub/datahub-commons/libext/cpdetector_1.0.10.jar -Dpackaging=jar -DgeneratePom=true

```
