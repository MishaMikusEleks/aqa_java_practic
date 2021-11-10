mvn clean install exec:java -Dexec.mainClass="practice.serialization.SerializationJson" -Dexec.args="arg0 arg1"

#TEST execution
mvn clean test
allure serve -h localhost
