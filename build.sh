mvn clean package -Dmaven.test.skip=true 
echo "package successed! starting..."
mkdir -m 755 logsToFlume
cd logsToFlume/
mkdir -m 755 flume-logs
cd ../
cp ./target/springboot-flume-logs-1.0.1-SNAPSHOT.jar logsToFlume
cp start.sh logsToFlume
cp -r flumeConfs/ logsToFlume/
tar czvf logsToFlume.tar.gz logsToFlume/
rm -rf ./logsToFlume/
echo "build successed!"
echo "you can copy the file of logsToFlume.tar.gz and then run the script of start.sh"
