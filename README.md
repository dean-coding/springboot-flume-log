

# flume日志收集

## 1 执行 ./build.sh

## 2 scp logsToFlume.tar.gz hostname@hostAddress:/指定路径

## 3 在server主机上,解压logsToFlume.tar.gz,进入目录

## 4 启动app: java -jar ./springboot-flume-logs-1.0.1-SNAPSHOT.jar --spring.profiles.active=prod

## 5 启动flume:flume-ng agent -c ./ -f ./flume-to-file.conf -n a1 -Dflume.root.logger=INFO,console

## tip:或者直接执行start.sh
