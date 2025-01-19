## Kafka CLI commands:

### Topics: **kafka-topics**

```shell
# List topics
# --list
kafka-topics --bootstrap-server localhost:9092 --list

# Create topic
# --create --topic <topic-name>
kafka-topics --bootstrap-server localhost:9092 --create --topic kafka-topic-one

# Create topic with partitions
# --partitions <n>
kafka-topics --bootstrap-server localhost:9092 --create --topic kafka-topic-two --partitions 3

# Create topic with replication factor
# --replication-factor <n> (default: 0)
kafka-topics --bootstrap-server localhost:9092 --create --topic kafka-topic-three --partitions 3 --replication-factor 1

# Describe a topic
# --topic --describe <topic-name>
kafka-topics --bootstrap-server localhost:9092 --topic --describe kafka-topic-three
```

### Producer: kafka-console-producer

```shell
# Public message
# --broker-list <host:port> --topic <topic-name>
kafka-console-producer --broker-list localhost:9092 --topic kafka-topic-three
```

### Consumer: kafka-console-consumer

```shell
# Consume message
# --topic <topic-name> --from-beginning (where start the consuming)
kafka-console-consumer --bootstrap-server localhost:9092 --topic kafka-topic-three --from-beginning
```