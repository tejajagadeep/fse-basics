# SpringBasics

Interview Question:
"How do you refer to fetching a limited amount of data to the frontend when there is low stored data?"

Detailed Question:
"When implementing pagination on the frontend, each page requires a separate call, and only a limited amount of data should be retrieved per page."

Answer:
"We need to specify an offset and limit or utilize Spring Pageable."

Sub Question:
"Please provide the query and endpoint path required for this call."

```
"SELECT * FROM Actor ORDER BY actor_id LIMIT ?1 OFFSET ?2"
```

Path: http://localhost:8080/actor/entities?offset=5&limit=5

https://github.com/tejajagadeep/SpringBasics/blob/main/interview/page-nation/src/main/java/com/interview/pagenation/controller/ActorController.java




