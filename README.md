# spring-jenkins-pipeline

# Remove all containers
docker system prune

# Pull and start images from docker compose
docker-compose up -d

# Install Jenkins

https://jenkins.io/download/
- Get the generic java package (.war)
- Start jenkins "java -jar jenkins.war"
- Jenkins data/backup is found in "~/.jenkins"
- Update extended email notification settings


# Create Jira Issue
Host: http://localhost/rest/api/2/issue/
Body: {
  "fields": {
    "project": {
      "key": "TEST"
    },
    "summary": "REST ye merry gentlemen.",
    "description": "Creating of an issue using project keys and issue type names using the REST API",
    "issuetype": {
      "name": "Task"
    }
  }
}

# MailHog (Intercepts emails)
http://localhost:8025/


