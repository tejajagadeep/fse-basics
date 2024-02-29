# SpringBasics

Interview

How do you call limited data to the frontend when the store data is low?

Detailed Question: When we perform page nation in the front end. For each page call should be made and according to page limited data should be called.

Ans: We need to give offset and limit or Use spring pageable.

Sub Question: provide the query and path needed to for the call.

```
"SELECT * FROM Actor ORDER BY actor_id LIMIT ?1 OFFSET ?2"
```

https://github.com/tejajagadeep/SpringBasics/blob/main/interview/page-nation/src/main/java/com/interview/pagenation/controller/ActorController.java




