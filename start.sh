echo "start run app ..."
java -jar ./springboot-flume-logs-1.0.1-SNAPSHOT.jar --spring.profiles.active=prod > tmp.log 2>&1 &
echo "start run flume listener ..."
command -v flume-ng >/dev/null 2>&1 || { \
echo >&2 "please chech the flume path or installed ?"; \
kill -9 $(ps -ef | grep springboot-flume-logs); \
exit; \
}

#后台运行: flume-ng agent -c ./ -f ./flume-to-file.conf -n a1 -Dflume.root.logger=INFO,console &
flume-ng agent -c ./ -f ./flume-to-file.conf -n a1 -Dflume.root.logger=INFO,console