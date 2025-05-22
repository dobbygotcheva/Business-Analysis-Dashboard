#!/bin/bash

# Start Spring Boot application
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar &
SPRING_PID=$!

# Wait for Spring Boot to start
echo "Waiting for Spring Boot to start..."
for i in {1..30}; do
    if curl -s http://localhost:8080/health > /dev/null; then
        echo "Spring Boot is up!"
        break
    fi
    if [ $i -eq 30 ]; then
        echo "Spring Boot failed to start"
        exit 1
    fi
    sleep 1
done

# Start Node.js proxy
echo "Starting Node.js proxy..."
yarn start 