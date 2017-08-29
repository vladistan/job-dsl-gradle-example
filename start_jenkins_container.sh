# run with -v jenkins_home:/var/jenkins_home to persist jenkins state across container restarts
docker run -it --rm \
    -p 8080:8080 \
    -v $PWD:/var/jenkins_home/workspace/seed:ro \
    -v /var/run/docker.sock:/var/run/docker.sock \
    myjenkins